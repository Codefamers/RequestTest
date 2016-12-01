package com.qhn.administrator.requesttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class RxJavaActivity extends AppCompatActivity {
    private static final String TAG = "RxJavaActivity";
    /* Rxjava 操作符
    *
    * 1:just():执行方法得值 subscribe():接受回调结果，并定义一个接口对结果进行处理 有三种方法
    * 2:create():数据处理与just()类似但是经常出来较复杂的逻辑，且如果后面没有被订阅create()方法不会被执行
    * 3:map():主要用于数据类型的一对一转换，而mapflat()主要用于数据类型的一对多数据类型转换
    * 4:observeOn:主要用于指定异步任务的线程 Schedulers.computation( )；// 计算线程
    *                                     Schedulers.from(executor);// 自定义
    *                                     Schedulers.immediate();// 当前线程
    *                                     Schedulers.io();// io线程
    *                                     Schedulers.newThread();// 创建新线程
    *                                     Schedulers.trampoline();// 当前线程队列执行
    * 5:subscribeOn():指定回调所在的线程    AndroidSchedulers.mainThread();UI线程
    * 6:filter():筛选器 将返回为true值传入到下一个事件流中，返回为false的值不做处理;
    */
    /*
    * 观察者
    * */
    Observer<String> observer = new Observer<String>() {
        @Override
        public void onNext(String s) {
            Log.d(TAG, "Item: " + s);
        }

        @Override
        public void onCompleted() {
            Log.d(TAG, "Completed!");
        }

        @Override
        public void onError(Throwable e) {
            Log.d(TAG, "Error!");
        }
    };

    Subscriber<String> subscriber = new Subscriber<String>() {
        @Override
        public void onNext(String s) {
            Log.d(TAG, "Item: " + s);
        }

        @Override
        public void onCompleted() {
            Log.d(TAG, "Completed!");
        }

        @Override
        public void onError(Throwable e) {
            Log.d(TAG, "Error!");
        }
    };

    // observer与subscriber的异同
    /*onStart():这是 Subscriber增加的方法。它会在 subscribe刚开始，而事件还未发送之前被调用，可以用于做一些准备工作，
     例如数据的清零或重置。这是一个可选方法，默认情况下它的实现为空。需要注意的是，如果对准备工作的线程有要求（例如弹出一个显示进度的对话框，
    这必须在主线程执行），onStart()就不适用了，因为它总是在 subscribe所发生的线程被调用，而不能指定线程。要在指定的线程来做准备工作，
     可以使用 doOnSubscribe()方法，具体可以在后面的文中看到。*/

    /* unsubscribe():这是 Subscriber所实现的另一个接口 Subscription 的方法，用于取消订阅。在这个方法被调用后，
     Subscriber 将不再接收事件。一般在这个方法调用前，可以使用 isUnsubscribed()先判断一下状态。
     unsubscribe()这个方法很重要，因为在 subscribe()之后，Observable 会持有Subscriber 的引用，这个引用如果不能及时被释放，
     将有内存泄露的风险。所以最好保持一个原则：要在不再使用的时候尽快在合适的地方（例如 onPause()onStop()等方法中）
    调用 unsubscribe()来解除引用关系，以避免内存泄露的发生*/

    /*
    * 被观察者
    * */
    Observable observable = Observable.create(new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {//定义被观察者被订阅之后执行的操作
            subscriber.onNext("Hello");
            subscriber.onNext("Hi");
            subscriber.onNext("Aloha");
            subscriber.onCompleted();
        }
    });
    //create();new Observable.OnSubscribe<Subscriber>()被观察者订阅的 观察者对象
    //call(Subscriber<T> subscriber)被观察者订阅的 观察者对象

   // new Observable.OnSubscribe<String>();=="订阅"=new View.OnClickListener();
    Observable subscriberObservable = Observable.create(new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext(longRunningOperation());
            subscriber.onCompleted();
        }

    }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());


    /*Subscriber<String> subscriber = new Subscriber<String>() {
        @Override
        public void onNext(String s) {
            Log.d(TAG, "Item: " + s);
        }

        @Override
        public void onCompleted() {
            Log.d(TAG, "Completed!");
        }

        @Override
        public void onError(Throwable e) {
            Log.d(TAG, "Error!");
        }
    };*/
    private int flag;
    private Button btn;


    Observable<String> o = Observable.just("one object");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java);
        final EditText et = (EditText) findViewById(R.id.et1);

       // Observable<String> o1 = Observable.from("a", "b", "c");

        final ArrayList<String> list = new ArrayList<>();
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        Observable<String> o2= Observable.from(list);
        final Observable<String> o3= Observable.just("one object");


        btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = Integer.parseInt(et.getText().toString());
                switch (flag) {
                    case 0://最原始RxJava方式
                        Observable.from(list).subscribe(observer);
                        //just();
                        break;
                    case 1://简化Rxjava方式
                        o3.subscribe(observer);
                        //simplify();
                        break;
                    case 2://Rxjava异步
                        //async();
                        break;
                    case 3://加载本地gif图片
                        break;
                    case 4://进入下个RxjavaActivity
                        break;
                }


            }
        });
    }

    private void async() {
        btn.setEnabled(false);
        subscriberObservable.subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted: ");
                btn.setEnabled(true);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                Log.d(TAG, "onCompleted: " + s);

                Toast.makeText(RxJavaActivity.this, s, Toast.LENGTH_SHORT).show();
            }


        });
    }

    private void simplify() {
        Observable.just(1, 2, 3, 4, 5).filter(new Func1<Integer, Boolean>() {
            @Override
            public Boolean call(Integer integer) {
                return integer % 2 == 1;
            }
        }).map(new Func1<Integer, Double>() {
            @Override
            public Double call(Integer value) {
                return Math.sqrt(value);
            }
        }).subscribe(new Subscriber<Double>() {
            @Override
            public void onCompleted() {
                System.out.println("complete");
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onNext(Double aDouble) {
                Log.d(TAG, "onNext: " + aDouble);

            }


        });
    }

    private void just() {
        Observable integerObservable = Observable.create(new Observable.OnSubscribe() {
            @Override
            public void call(Object o) {
                subscriber.onNext("1");
                subscriber.onNext("b");
                subscriber.onNext("3");
                subscriber.onCompleted();
            }

        });
        integerObservable.subscribe(subscriber);
    }

    public String longRunningOperation() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "耗时Complete";
    }

}

package com.qhn.administrator.requesttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.qhn.administrator.requesttest.ObserverPattern.Observer;
import com.qhn.administrator.requesttest.strategyPattern.AlterableGirl;
import com.qhn.administrator.requesttest.strategyPattern.LivelyCharacter;
import com.qhn.administrator.requesttest.strategyPattern.UglyAppearance;
import com.qhn.administrator.requesttest.utils.OkHttpUtils;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String TAG = "MainActivity";
    @Bind(R.id.lv_item)
    ListView lvItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String [] data=new String []{"策略模式","观察者模式","rxJava+retrofit示例","Glide的基本使用"};
        final ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,data);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        AlterableGirl alterableGirl=new AlterableGirl();
                        alterableGirl.display();
                        alterableGirl.setAppearanceStyle(new UglyAppearance());
                        alterableGirl.display();
                        alterableGirl.setGirlCharacterStyle(new LivelyCharacter());
                        alterableGirl.display();
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, ObservableActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, RxRetrofitActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, MapActivity.class));
                        break;
                }
            }
        });

    }


}
 /*
       * placeholder()                                 占位符在显示要加载的图片之前所显示的图片;
       * error()                                       glide 未加载正确图片时需要显示的图片;
       * dontAnimate()                                 取消淡入淡出效果
       * override(600, 200)                            固定图片大小;
       * crossFade ()                                  淡入淡出效果 参数可以出入int值 淡入淡出时间
       * centerCrop()                                  使裁剪图像使图像完全填充imageview，有可能不能完全显示图片
       * fitCrop ()                                    压缩图片是图片完全在imgaeview内，有可能导致图片不能完全填满控件
       * asGif()                                       检查提供的图片是否是Gif图片
       * asBitmap()                                    把一个Gif的首帧作为img显示
       * skipMemoryCache(true)                         跳过内存缓存
       * diskCacheStrategy(DiskCacheStrategy.NONE)     跳过磁盘缓存: DiskCacheStrategy.NONE 什么都不缓存，就像刚讨论的那样
       *                                                            DiskCacheStrategy.SOURCE 仅仅只缓存原来的全分辨率的图像。在我们上面的例子中，将会只有一个 1000x1000 像素的图片
       *                                                            DiskCacheStrategy.RESULT 仅仅缓存最终的图像，即，降低分辨率后的（或者是转换后的)
       *                                                            DiskCacheStrategy.ALL    缓存所有版本的图像（默认行为)
       * priority()//参数                              缓存优先级： Priority.LOW 最低级
       *                                                          Priority.NORMAL 普通级
       *                                                          Priority.HIGH   高级
       *                                                          Priority.IMMEDIATE 最高级
       *animate()                                      给图像设置自定义动画:动画资源文件
       *
       *
       *
       *
       *
       * */
    /*
    * studio快捷操作
    *
    * 活动板块
    *
    * 1:数组对象和数字可以使用  .fori/.for/.forr(反向循环) 实现快速for循环
    * 2:对象非空判断可以使用    .null/.notnull            实现快速if非空判断
    * 3:在任何判断语句后加上    .if                       实现快速if语句判断
    * 说明不仅if可以如此使用switch 等都可以这样使用对象.if/switch/for
    *
    * 4:多行编辑               alt键+鼠标左键一直向下拉    就可以选中多行同时编辑相同的部分;
    * 5:块编辑                 按住alt键，拉对角线，拉出一块，就可以对选中的块进行快编辑了;
    * 6:大纲                   ctrl+f12                  显示出代码的总体纲领;
    * 7:分屏显示               全局搜索 输入split就可以选择vertically和horizontally
    * 8:继承关系图             ctrl+H
    *
    *
    * */
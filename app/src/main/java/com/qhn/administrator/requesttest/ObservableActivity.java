package com.qhn.administrator.requesttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.qhn.administrator.requesttest.ObserverPattern.FarmerSubscriber;
import com.qhn.administrator.requesttest.ObserverPattern.StudentSubscriber;
import com.qhn.administrator.requesttest.ObserverPattern.WeatherData;
import com.qhn.administrator.requesttest.ObserverPattern.WomenSubscriber;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ObservableActivity extends AppCompatActivity {

    @Bind(R.id.button)
    Button btnSun;
    @Bind(R.id.button5)
    Button butCloundy;
    @Bind(R.id.textView2)
    TextView txtFarmer;
    @Bind(R.id.textView3)
    TextView txtStudent;
    @Bind(R.id.textView4)
    TextView txtWomen;
    @Bind(R.id.editText)
    EditText etWeather;
    @Bind(R.id.activity_observable)
    RelativeLayout activityObservable;
    @Bind(R.id.button6)
    Button btnRain;
    WeatherData weatherData;
    StudentSubscriber studentSubscriber;
    WomenSubscriber womenSubscriber;
    FarmerSubscriber farmerSubscriber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observable);
        ButterKnife.bind(this);
        weatherData=new WeatherData();
        studentSubscriber=new StudentSubscriber();
        womenSubscriber=new WomenSubscriber();
        farmerSubscriber=new FarmerSubscriber();
        weatherData.subscribe(studentSubscriber);
        weatherData.subscribe(womenSubscriber);
        weatherData.subscribe(farmerSubscriber);
        showSubscriberBehavior();
    }

    @OnClick({R.id.button, R.id.button5,R.id.button6})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                weatherData.weatherChanged(1);
                break;
            case R.id.button5:
                weatherData.weatherChanged(0);
                break;
            case R.id.button6:
                weatherData.weatherChanged(-1);
                break;
        }
        showSubscriberBehavior();
    }

    private void showSubscriberBehavior() {
        txtFarmer.setText(farmerSubscriber.getDoingSomeThing());
        txtStudent.setText(studentSubscriber.getDoingSomeThing());
        txtWomen.setText(womenSubscriber.getDoingSomeThing());
    }


}

package com.qhn.administrator.requesttest.ObserverPattern;

import android.util.Log;

/**
 * Created by qhn
 * on 2016/12/2 0002.
 */

public class WomenSubscriber implements Observer {
    private String doingSomeThing="等待天气更新";
    private static final String TAG = "WomenSubscriber";
    public String getDoingSomeThing() {
        return doingSomeThing;
    }

    public void setDoingSomeThing(String doingSomeThing) {
        this.doingSomeThing = doingSomeThing;
    }

    @Override
    public void update(int weatherState) {
        switch (weatherState) {
            case WeatherData.RAIN:
                doingSomeThing="下雨了，忘记收衣服了";
                break;
            case WeatherData.CLOUDY:
                doingSomeThing="天阴了，赶紧收衣服啦";

                break;
            case WeatherData.SUN:
                doingSomeThing="出太阳了，终于可以晒衣服啦";
                break;
        }
        Log.d(TAG, "update: "+doingSomeThing);
        setDoingSomeThing(doingSomeThing);
    }
}

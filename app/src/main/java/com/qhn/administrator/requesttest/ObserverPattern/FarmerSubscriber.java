package com.qhn.administrator.requesttest.ObserverPattern;

/**
 * Created by qhn
 * on 2016/12/2 0002.
 */

public class FarmerSubscriber implements Observer {
    private String doingSomeThing="等待天气更新";

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
                doingSomeThing="下雨了，可以休息一天了";
                break;
            case WeatherData.CLOUDY:
                doingSomeThing="天阴了，啊好凉快呀";
                break;
            case WeatherData.SUN:
                doingSomeThing="出太阳了，今天又是个干活的好日子";
                break;
        }
        setDoingSomeThing(doingSomeThing);
    }
}

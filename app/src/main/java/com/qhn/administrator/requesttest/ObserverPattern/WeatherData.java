package com.qhn.administrator.requesttest.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qhn
 * on 2016/12/2 0002.
 */

public class WeatherData implements Observable {
    private int WeatherState;
    private List<Observer> observerList;
    public static final int RAIN=-1;
    public static final int CLOUDY=0;
    public static final int SUN=1;
    public WeatherData() {
        WeatherState = SUN;
        this.observerList = new ArrayList<>();
    }

    public int getWeatherState() {
        return WeatherState;
    }

    public void setWeatherState(int weatherState) {
        WeatherState = weatherState;
    }
    public void weatherChanged(int weatherState){
        notifyDataChange(weatherState);
    }
    @Override
    public void unSubscribe(Observer observer) {
        observerList.remove(observerList.indexOf(observer));
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyDataChange(int weatherState) {
        for (Observer observer : observerList) {
            observer.update(weatherState);
        }
    }

   /* @Override
    public void notifyDataChange() {
        for (Observer observer : observerList) {
            observer.update(this,null);
        }
    }*/
}

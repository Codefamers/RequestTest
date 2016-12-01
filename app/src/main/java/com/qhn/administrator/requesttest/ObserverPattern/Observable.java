package com.qhn.administrator.requesttest.ObserverPattern;

/**
 * Created by qhn
 * on 2016/12/2 0002.
 */

public interface Observable {
    void unSubscribe(Observer observer);
    void subscribe(Observer observer);
    void notifyDataChange(int weatherState);
    //void notifyDataChange();
}

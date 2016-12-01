package com.qhn.administrator.requesttest.ObserverPattern;

/**
 * Created by qhn
 * on 2016/12/2 0002.
 */

public interface Observer {
    //void update(Observable observable,Object arg);
    void update(int weatherState);
}

package com.qhn.administrator.requesttest.strategyPattern;

import android.util.Log;

/**
 * Created by Administrator on 2016/10/12 0012.
 */

public class LivelyCharacter implements GirlCharacterStyle {
    private static final String TAG = "LivelyCharacter";
    @Override
    public void characterStyle() {
        Log.d(TAG, "我很活泼");
    }
}

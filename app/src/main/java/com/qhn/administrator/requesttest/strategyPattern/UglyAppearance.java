package com.qhn.administrator.requesttest.strategyPattern;

import android.util.Log;

/**
 * Created by Administrator on 2016/10/12 0012.
 */

public class UglyAppearance implements AppearanceStyle {
    private static final String TAG = "UglyAppearance";
    @Override
    public void appearanceFeature() {
        Log.d(TAG, "丑陋的 ");
    }
}

package com.qhn.administrator.requesttest.strategyPattern;

import android.util.Log;

/**
 * Created by Administrator on 2016/10/12 0012.
 */

public class CommonAppearance implements AppearanceStyle {
    private static final String TAG = "CommonAppearance";
    @Override
    public void appearanceFeature() {
        Log.d(TAG, "长相一般");
    }
}

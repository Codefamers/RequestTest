package com.qhn.administrator.requesttest.strategyPattern;

import android.util.Log;

/**
 * Created by Administrator on 2016/10/12 0012.
 */

public class BeautifulAppearance implements AppearanceStyle {
    private static final String TAG = "BeautifulAppearance";
    @Override
    public void appearanceFeature() {
        Log.d(TAG, "超级漂亮");
    }
}

package com.qhn.administrator.requesttest.strategyPattern;

import android.util.Log;

import static android.support.v7.widget.StaggeredGridLayoutManager.TAG;

/**
 * Created by Administrator on 2016/10/12 0012.
 */

public class SoftCharacter implements GirlCharacterStyle {
    @Override
    public void characterStyle() {
        Log.d("SoftCharacter", "我很温柔");
    }
}

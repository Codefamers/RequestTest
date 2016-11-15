package com.qhn.administrator.requesttest.utils;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;


import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class OkHttpUtils {
    public static final String TAG = " OkHttpUtils";

    private static OkHttpClient client;
    private static Request request;
    private static Handler handler = new Handler();

    public static OkHttpClient getClientInstance() {
        if (client == null) {
            synchronized (OkHttpUtils.class) {
                if (client == null) {
                    client = new OkHttpClient();
                }
            }
        }
        return client;
    }

    //post请求
    public static void okHttpPost(final Context context, String url, RequestBody body, final OnDataFinish onDataFinish) {
        request = new Request.Builder().url(url).post(body).build();
        //Log.d(TAG, "onFailure: 连接失败");

        OkHttpUtils.getClientInstance().newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                //throw new IOException("Unexpected code " + response);
                Toast.makeText(context, "服务器连接异常!", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onFailure: 连接失败");
            }

            @Override
            public void onResponse(Response response) throws IOException {
                Log.d(TAG, "onResponse: " + response.code());
                final String result = response.body().string();
                int code = response.code();
                if (200 <= code || code <= 300) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            onDataFinish.OnSuccess(result);
                        }
                    });
                } else {
                    Toast.makeText(context, "服务器连接异常!" + code, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    /**
     * 回调接口
     */
    public interface OnDataFinish {
        void OnSuccess(String result);

    }
}

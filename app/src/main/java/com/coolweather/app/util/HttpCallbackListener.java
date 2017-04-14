package com.coolweather.app.util;

/**
 * Created by Administrator on 2017/4/14 0014.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}

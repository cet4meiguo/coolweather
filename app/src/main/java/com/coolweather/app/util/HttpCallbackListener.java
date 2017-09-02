package com.coolweather.app.util;

/**
 * Created by f00214259 on 2017/8/30.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}

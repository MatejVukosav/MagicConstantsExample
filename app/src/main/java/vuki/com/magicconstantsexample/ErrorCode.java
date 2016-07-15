package vuki.com.magicconstantsexample;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by mvukosav on 15.7.2016..
 */
@StringDef({
        ErrorCode.NETWORK_CONNECTION_ERROR,
        ErrorCode.GEO_BLOCKING,
        ErrorCode.STREAMING_URL_ERROR,
        ErrorCode.STREAMING_NOT_ENABLED,
        ErrorCode.NETWORK_WIFI_NOT_ENABLED,
        ErrorCode.NETWORK_3G_NOT_ENABLED,
})

@Retention(RetentionPolicy.SOURCE)
public @interface ErrorCode {
    String NETWORK_CONNECTION_ERROR = "network connection error";
    String GEO_BLOCKING = "geo blocking error";
    String STREAMING_URL_ERROR = "streaming url is empty";
    String STREAMING_NOT_ENABLED = "streaming is not enabled";
    String NETWORK_WIFI_NOT_ENABLED = "wifi is not enabled";
    String NETWORK_3G_NOT_ENABLED = "3g is not enabled";
}

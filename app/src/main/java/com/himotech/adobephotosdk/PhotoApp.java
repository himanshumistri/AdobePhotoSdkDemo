package com.himotech.adobephotosdk;

import android.app.Application;

import com.aviary.android.feather.sdk.IAviaryClientCredentials;

import static com.adobe.creativesdk.foundation.AdobeCSDKFoundation.initializeCSDKFoundation;

/**
 * Created by ubbvand2 on 11/6/15.
 */
public class PhotoApp  extends Application implements IAviaryClientCredentials {

    private static final String CREATIVE_SDK_CLIENT_ID = "<YOUR CLIENT ID GOES HERE>";
    private static final String CREATIVE_SDK_CLIENT_SECRET = "<YOUR CLIENT SECRET GOES HERE>";


    @Override
    public void onCreate() {
        super.onCreate();

        initializeCSDKFoundation(getApplicationContext());
    }


    @Override
    public String getClientID() {
        return CREATIVE_SDK_CLIENT_ID;
    }

    @Override
    public String getClientSecret() {
        return CREATIVE_SDK_CLIENT_SECRET;
    }

    @Override
    public String getBillingKey() {
        return "";
    }
}

package com.debug.lib;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;

public class StethoUtil {


    public void init(Application application) {
        Stetho.initializeWithDefaults(application);
    }

    public StethoInterceptor createStethoInterceptor() {
        return new StethoInterceptor();
    }
}

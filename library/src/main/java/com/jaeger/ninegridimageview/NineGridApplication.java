package com.jaeger.ninegridimageview;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class NineGridApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}

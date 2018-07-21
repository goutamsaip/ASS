package com.example.nikhilreddy.ass;

import android.app.Application;

/**
 * Created by Nikhil Reddy on 7/20/2018.
 */

public class IntroApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Globals.init(this);
    }
}


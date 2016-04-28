package com.example.fabricio.myapplication;

import android.app.Application;

import com.firebase.client.Firebase;


/**
 * Created by Fabrício Natanael on 27/04/2016.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
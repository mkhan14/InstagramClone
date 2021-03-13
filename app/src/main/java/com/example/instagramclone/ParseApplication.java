package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YER7EI5FohltaTZdLoASRFCMvYCH6M6VLhh3oha5")
                .clientKey("WNsz6MmXS2S2ymMMGzSCMQjbFA48hnEjq3iTgr5G")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

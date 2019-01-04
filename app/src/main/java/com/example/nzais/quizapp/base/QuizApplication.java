package com.example.nzais.quizapp;

import android.app.Application;

import com.example.nzais.quizapp.di.ApplicationComponent;
import com.example.nzais.quizapp.di.ApplicationModule;
import com.example.nzais.quizapp.di.DaggerApplicationComponent;

public class QuizApplication extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }
}

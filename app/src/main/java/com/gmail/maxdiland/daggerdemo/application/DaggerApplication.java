package com.gmail.maxdiland.daggerdemo.application;

import android.app.Application;

import com.gmail.maxdiland.daggerdemo.di.component.ApplicationComponent;
import com.gmail.maxdiland.daggerdemo.di.component.DaggerApplicationComponent;
import com.gmail.maxdiland.daggerdemo.di.module.ApplicationModule;

public class DaggerApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initDependencies();
    }

    private void initDependencies() {
        this.applicationComponent =
                DaggerApplicationComponent.builder().
                        applicationModule(new ApplicationModule()).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}

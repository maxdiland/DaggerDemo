package com.gmail.maxdiland.daggerdemo.di.component;

import com.gmail.maxdiland.daggerdemo.application.DaggerApplication;
import com.gmail.maxdiland.daggerdemo.di.module.ActivityModule;
import com.gmail.maxdiland.daggerdemo.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(DaggerApplication application);
    ActivitySubcomponent plus(ActivityModule activityModule);
}

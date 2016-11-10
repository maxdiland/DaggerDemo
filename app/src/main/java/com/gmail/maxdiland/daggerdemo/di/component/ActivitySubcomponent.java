package com.gmail.maxdiland.daggerdemo.di.component;

import com.gmail.maxdiland.daggerdemo.activity.OneActivity;
import com.gmail.maxdiland.daggerdemo.activity.TwoActivity;
import com.gmail.maxdiland.daggerdemo.di.module.ActivityModule;
import com.gmail.maxdiland.daggerdemo.di.scope.PerActivity;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivitySubcomponent {
    void inject(OneActivity activity);
    void inject(TwoActivity activity);
}

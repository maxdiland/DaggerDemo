package com.gmail.maxdiland.daggerdemo.di.module;

import com.gmail.maxdiland.daggerdemo.di.scope.PerActivity;
import com.gmail.maxdiland.daggerdemo.location.LocationManager;
import com.gmail.maxdiland.daggerdemo.permission.PermissionManager;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    @Provides
    @PerActivity
    public LocationManager retrieveLocationManager(PermissionManager permissionManager) {
        return new LocationManager(permissionManager);
    }
}

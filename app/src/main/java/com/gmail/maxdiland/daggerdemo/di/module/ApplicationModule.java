package com.gmail.maxdiland.daggerdemo.di.module;

import com.gmail.maxdiland.daggerdemo.permission.PermissionManager;
import com.gmail.maxdiland.daggerdemo.rest.RestClient;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @Singleton
    public RestClient retrieveRestClient(Gson gson) {
        RestClient restClient = new RestClient();
        restClient.setGson(gson);
        return restClient;
    }

    @Provides
    @Singleton
    public Gson retrieveGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    public PermissionManager retrievePermissionManager() {
        return new PermissionManager();
    }
}

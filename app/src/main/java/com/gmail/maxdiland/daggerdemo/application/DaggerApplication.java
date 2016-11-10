package com.gmail.maxdiland.daggerdemo.application;

import android.app.Application;

import com.gmail.maxdiland.daggerdemo.permission.PermissionManager;
import com.gmail.maxdiland.daggerdemo.rest.RestClient;
import com.google.gson.Gson;

public class DaggerApplication extends Application {
    private RestClient restClient;
    private PermissionManager permissionManager;

    @Override
    public void onCreate() {
        super.onCreate();
        initDependencies();
    }

    private void initDependencies() {
        restClient = new RestClient();
        restClient.setGson(new Gson());
        permissionManager = new PermissionManager();
    }

    public RestClient getRestClient() {
        return restClient;
    }

    public PermissionManager getPermissionManager() {
        return permissionManager;
    }
}

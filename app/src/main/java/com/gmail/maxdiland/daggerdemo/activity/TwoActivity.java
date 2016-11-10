package com.gmail.maxdiland.daggerdemo.activity;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.gmail.maxdiland.daggerdemo.R;
import com.gmail.maxdiland.daggerdemo.application.DaggerApplication;
import com.gmail.maxdiland.daggerdemo.di.module.ActivityModule;
import com.gmail.maxdiland.daggerdemo.location.LocationManager;
import com.gmail.maxdiland.daggerdemo.permission.PermissionManager;
import com.gmail.maxdiland.daggerdemo.rest.RestClient;
import com.gmail.maxdiland.daggerdemo.rest.dto.Response;

import javax.inject.Inject;

public class TwoActivity extends AppCompatActivity {

    @Inject RestClient restClient;
    @Inject LocationManager locationManager;
    @Inject PermissionManager permissionManager;

    private TextView tvInfo;
    private TextView tvLocationInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        initDependencies();
        initViews();
    }

    private void initDependencies() {
        ((DaggerApplication) getApplication()).getApplicationComponent().plus(new ActivityModule())
                .inject(this);
    }

    private void initViews() {
        tvInfo = (TextView) findViewById(R.id.tv_info);
        tvLocationInfo = (TextView) findViewById(R.id.tv_location_info);
        bindDataWithViews();
    }

    private void bindDataWithViews() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(restClient.getClass().getSimpleName())
                .append(": ").append(restClient.hashCode()).append("\n");

        stringBuilder.append(permissionManager.getClass().getSimpleName()).append(": ")
                .append(permissionManager.hashCode()).append("\n");

        stringBuilder.append(locationManager.getClass().getSimpleName()).append(": ")
                .append(locationManager.hashCode());

        tvInfo.setText(stringBuilder.toString());

    }

    public void handleDetermineLocation(View view) {
        Location location = locationManager.retrieveLocation();
        Response response = restClient.makeRequest(location.getLatitude(), location.getLongitude());
        tvLocationInfo.setText(response.toString());
        tvLocationInfo.setVisibility(View.VISIBLE);
    }
}

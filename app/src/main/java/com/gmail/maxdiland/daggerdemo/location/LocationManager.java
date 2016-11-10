package com.gmail.maxdiland.daggerdemo.location;

import android.location.Location;

import com.gmail.maxdiland.daggerdemo.permission.PermissionManager;

public class LocationManager {
    private static final String STUB_LOCATION_PROVIDER = "STUB_LOCATION_PROVIDER";

    private PermissionManager permissionManager;

    public LocationManager(PermissionManager permissionManager) {
        this.permissionManager = permissionManager;
    }

    public Location retrieveLocation() {
        if (permissionManager.isLocationServicesAllowed()) {
            Location location = new Location(STUB_LOCATION_PROVIDER);
            location.setLatitude(50.013462);
            location.setLongitude(36.249422);
            return location;
        } else {
            throw new SecurityException();
        }
    }
}

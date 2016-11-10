package com.gmail.maxdiland.daggerdemo.rest;

import com.gmail.maxdiland.daggerdemo.rest.dto.Response;
import com.google.gson.Gson;

public class RestClient {
    private static final String HARDCODED_RESPONSE =
            "{\n" +
            "    \"city\" : \"Kharkov\",\n" +
            "    \"population\" : 1431000,\n" +
            "    \"currentTemperature\" : \"+13\"\n" +
            "}";

    private Gson gson;

    public Response makeRequest(double latitude, double longitude) {
        return gson.fromJson(HARDCODED_RESPONSE, Response.class);
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }
}

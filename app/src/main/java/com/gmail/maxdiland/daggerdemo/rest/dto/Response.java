package com.gmail.maxdiland.daggerdemo.rest.dto;

public class Response {
    private String city;
    private int population;
    private int currentTemperature;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    @Override
    public String toString() {
        return "Response{" +
                "city='" + city + '\'' +
                ", population=" + population +
                ", currentTemperature=" + currentTemperature +
                '}';
    }
}

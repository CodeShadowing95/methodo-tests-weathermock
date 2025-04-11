package com.weather_manager;

public class MeteoManager {
    private final WeatherService weatherService;

    public MeteoManager(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String afficherMeteo(String ville) {
        String weatherData = weatherService.getCurrentWeather(ville);
        return "Meteo de " + ville + ": " + weatherData;
    }
}

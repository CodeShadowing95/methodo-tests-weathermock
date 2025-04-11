package com.weather_manager;

public class WeatherData {
    private String temperature;
    private String humidity;
    private String pressure;
    private String windSpeed;

    public WeatherData(String temperature, String humidity, String pressure, String windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
    }

    public String getTemperature() { return temperature; }
    public String getHumidity() { return humidity; }
    public String getPressure() { return pressure; }
    public String getWindSpeed() { return windSpeed; }

    @Override
    public String toString() {
        return "Temperature: " + temperature + "°C - Humidity: " + humidity + "% - Pressure: " + pressure + "hPa - Wind speed: " + windSpeed + "km/h";
    }
}

package com.weather_manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WeatherManagerMockTest {

    @Test
    public void testAfficherMeteo() {
        WeatherService mockService = mock(WeatherService.class);
        when(mockService.getCurrentWeather("Paris")).thenReturn(new WeatherData("10", "50", "1000", "3").toString());
        when(mockService.getCurrentWeather("Lyon")).thenReturn(new WeatherData("20", "60", "1100", "4").toString());
        when(mockService.getCurrentWeather("Toulouse")).thenReturn(new WeatherData("10", "50", "1000", "3").toString());

        MeteoManager manager = new MeteoManager(mockService);
        assertEquals("Meteo de Paris: Temperature: 10°C - Humidity: 50% - Pressure: 1000hPa - Wind speed: 3km/h", manager.afficherMeteo("Paris"));
        assertEquals("Meteo de Lyon: Temperature: 20°C - Humidity: 60% - Pressure: 1100hPa - Wind speed: 4km/h", manager.afficherMeteo("Lyon"));
        assertEquals("Meteo de Toulouse: Temperature: 10°C - Humidity: 50% - Pressure: 1000hPa - Wind speed: 3km/h", manager.afficherMeteo("Toulouse"));
    }
}

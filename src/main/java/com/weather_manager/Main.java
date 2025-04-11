package com.weather_manager;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Map<String, WeatherData> fakeMeteo = new HashMap<>();
        fakeMeteo.put("Paris", new WeatherData("20", "22.5", "1015", "45"));
        fakeMeteo.put("Lyon", new WeatherData("5", "16.2", "1009", "85"));
        fakeMeteo.put("Marseille", new WeatherData("23", "25.0", "1012", "60"));

        WeatherService mockService = city -> fakeMeteo.getOrDefault(city,
                new WeatherData("Inconnu", "0.0", "0", "0")).toString();

        MeteoManager manager = new MeteoManager(mockService);

        System.out.println("Affichage des métés de Paris, Lyon, Marseille et Toulouse");
        System.out.println(manager.afficherMeteo("Paris"));
        System.out.println(manager.afficherMeteo("Lyon"));
        System.out.println(manager.afficherMeteo("Marseille"));
        System.out.println(manager.afficherMeteo("Toulouse")); // Non défini
    }
}

package project.model;

public class WeatherResponse {
    String city;
    String weatherType;
    String imgType;
    String humidity;// Влажность
    String tom, tomNight;
    int temperature;

    public String toString() {
        return "Weather[city= " + city + ", weatherType=" + weatherType
                + ", temperature= " + temperature + ",humidity= " + humidity
                + "]";
    }
}

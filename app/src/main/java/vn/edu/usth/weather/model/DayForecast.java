package vn.edu.usth.weather.model;

public class DayForecast {
    private final String date;
    private final String icon;
    private final String temperature;
    private final String forecast;

    public DayForecast(String date, String icon, String temperature, String forecast) {
        this.date = date;
        this.icon = icon;
        this.temperature = temperature;
        this.forecast = forecast;
    }

    public String getDate() {
        return date;
    }

    public String getIcon() {
        return icon;
    }

    public String getTemperature(){
        return temperature;
    }

    public String getForecast(){
        return forecast;
    }
}

public class WeatherData {
    private String location;
    private int temperature;
    private String forecast;
    private int humidity;

    public WeatherData(String location, int temperature, String forecast, int humidity) {
        this.location = location;
        this.temperature = temperature;
        this.forecast = forecast;
        this.humidity = humidity;
    }

    public String getLocation() {
        return location;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getForecast() {
        return forecast;
    }

    public int getHumidity() {
        return humidity;
    }
}


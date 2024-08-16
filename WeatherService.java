public class WeatherService {

    public WeatherData getWeatherData(String location) {
        // Mock method to simulate fetching weather data
        return new WeatherData(location, 22, "Partly cloudy", 65);
    }

    public int calculateForecastAccuracy(WeatherData actualData, WeatherData predictedData) {
        // Compare actual and predicted data for accuracy
        int temperatureDifference = Math.abs(actualData.getTemperature() - predictedData.getTemperature());
        int humidityDifference = Math.abs(actualData.getHumidity() - predictedData.getHumidity());

        // Mock a simple accuracy calculation based on differences
        int accuracy = 100 - (temperatureDifference + humidityDifference);
        return Math.max(accuracy, 0); // Ensures that accuracy doesn't go below 0
    }

    public void sendWeatherNotification(String message) {
        // Mock method to send weather notifications
        System.out.println("Notification sent: " + message);
    }
}


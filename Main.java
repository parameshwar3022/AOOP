public class Main {
    public static void main(String[] args) {
        // Example usage of LightingFacade
        System.out.println("Lighting System:");

        LightingFacade lightingFacade = new LightingFacade();
        System.out.println("Turning on all lights...");
        lightingFacade.turnOnAll();

        System.out.println("Setting living room brightness to 70...");
        lightingFacade.setBrightness("living_room", 70);

        System.out.println("Setting kitchen color to red...");
        lightingFacade.setColor("kitchen", "red");

        System.out.println("Activating evening scene...");
        lightingFacade.sceneEvening();

        // Displaying current settings
        displayLightSettings(lightingFacade, "living_room");
        displayLightSettings(lightingFacade, "kitchen");
        displayLightSettings(lightingFacade, "bedroom");

        // Example usage of WeatherService
        System.out.println("\nWeather Forecasting System:");

        WeatherService weatherService = new WeatherService();
        WeatherData currentWeather = weatherService.getWeatherData("New York");

        System.out.println("Current weather in " + currentWeather.getLocation() + ":");
        System.out.println("Temperature: " + currentWeather.getTemperature() + "°C");
        System.out.println("Forecast: " + currentWeather.getForecast());
        System.out.println("Humidity: " + currentWeather.getHumidity() + "%");

        WeatherData predictedWeather = new WeatherData("New York", 21, "Partly cloudy", 60);
        int accuracy = weatherService.calculateForecastAccuracy(currentWeather, predictedWeather);
        System.out.println("Forecast accuracy: " + accuracy + "%");

        weatherService.sendWeatherNotification("Storm warning");

    }

    private static void displayLightSettings(LightingFacade facade, String zone) {
        Lightee light = facade.getLight(zone);
        System.out.println(zone + " Light:");
        System.out.println("On: " + light.isOn());
        System.out.println("Brightness: " + light.getBrightness());
        System.out.println("Color: " + light.getColor());
    }
}

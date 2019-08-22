package Observer.java_built_in_observer_pattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new
                CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

//        To be implemented the same way as Observers
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);


        // initial conditions
        weatherData.setMeasurements(80, 65, 30.4f);

        // whenever new conditions are coming, all the observers
        // automatically are updated which means all displays print out
        // the conditions
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}

package Observer.java_built_in_observer_pattern;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementsChanged(){

        setChanged();
        notifyObservers();  // Notice we aren’t sending a data object
        // with the notifyObservers() call.
        // That means we’re using the PULL model.
    }

    public void setMeasurements(float t, float h, float p){
        temperature = t;
        humidity = h;
        pressure = p;

        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}

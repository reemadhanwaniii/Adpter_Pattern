package Example3;

public class FahrenhiteSensorAdapter implements Thermometer{
    private final FahrenhiteSensor sensor;
    private double reading;

    public FahrenhiteSensorAdapter(FahrenhiteSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperature() {
        reading = this.sensor.readFahrenhite();
        return (reading-32)*5.0/9.0;
    }
}

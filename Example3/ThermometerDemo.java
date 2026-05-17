package Example3;

public class ThermometerDemo {
    static void main() {
        Thermometer celsius = new CelsiusSensor();
        System.out.printf("Celsius sensor: %.1f C%n" , celsius.getTemperature());


         FahrenhiteSensor sensor = new FahrenhiteSensor();
         Thermometer adapted = new FahrenhiteSensorAdapter(sensor);
         System.out.printf("Fahrenheit sensor (adapted): %.1f C%n", adapted.getTemperature());
    }
}

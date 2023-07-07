package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float farenheit = (temperatureCelsius * (9/5) + 32);
        System.out.println(farenheit);
    }

    public static void main(String[] args){
        var classInstance = new TemperatureConverter();
        classInstance.toFahrenheit(30);
    }
}

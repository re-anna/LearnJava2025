package hw1;

public class TemperatureCalculations {
    public static void main(String[] args){

        double celsius = 100;
        double fahrenheit = 36;
        System.out.println(celsiusToFahrenheit(celsius));
        System.out.println(fahrenheitToCelsius(fahrenheit));
    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}

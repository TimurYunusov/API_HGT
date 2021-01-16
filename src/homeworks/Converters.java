package homeworks;

public class Converters {
    public static void main(String[] args) {
        //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        //
        //Input a degree in Fahrenheit: 212
        //Expected Output:
        //212.0 degree Fahrenheit is equal to 100.0 in Celsius
        //
        //Example
        //Convert 68 degrees Fahrenheit to degrees Celsius:
        //
        //T(°C) = (68 - 32) × 5/9 = 20 °C            // your Fahrenheit variable is here 68 the rest value are given in number values
        //

        //
        //2. Write a Java program that reads a number in inches, converts it to meters.
        //Note: One inch is 0.0254 meter.
        //Test Data
        //Input a value for inch: 1000
        //Expected Output :
        //1000.0 inch is 25.4 meters
        double f = 212.0;
        double c = (f - 32) *5/9;
        System.out.println( f + " degree Fahrenheit is equal to " + c + " in Celsius");

        double i = 1000;
        double m = i * 0.0254;
        System.out.println(i + " inch is " + m +" meters");
    }
}

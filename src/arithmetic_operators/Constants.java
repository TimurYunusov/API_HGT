package arithmetic_operators;
//instance variable are difined on the class level
//in order to be able to use a variable inside main method
//must to be static!~!!!
//name of final variable must be named with all caps letters separated by underscore_PLUS_SIGN
//purpose to see when variable is constant!
public class Constants {
    static final char GENDER = 'f';
    static int POPULATION = 78000000;

    public static void main(String[] args) {
        //all variable that are created inside a method are called local variables
        //imagine a scenario where you want to assign one value to a variable
        //and you want to make sure that variable carries the same value
        //for the entire life of the program
         final int DOB =1990; //final keyword can be put before the declaration of
        //before the data type
        //final variables can only be initialized once!
        // System.out.println(dob);
         //dob =1995; will not compile bc cannot assign a value variable;
        final String SSN;
        String ssn = "808-45-1365"; // able to assign a value bc it's the first time we are doing it
        final char PLUS_SIGN = '+';
        final double PI = 3.14195;


    }
}

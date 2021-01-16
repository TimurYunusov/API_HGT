package methods;

public class MethodsFirstBlood {
    //nothing besides package, import statement can be outside class scope.
    //any method will have to be outside of main method but inside class
    public static void main(String[] args) {
        System.out.println(convertCtoF(10.5));
        System.out.println(Login("Demo", "TestPassword"));
        double day1TempInC = 18;
        double day2TempInC = 20;
        double day3TempInC = 14;
        double day4TempInC = 22;

        double day1F = convertCtoF(day1TempInC);
        double day2F = convertCtoF(day2TempInC);
        double day3F = convertCtoF(day3TempInC);
        double day4F = convertCtoF(day4TempInC);
        double resultF= (day1F+day2F+day3F+day4F)/4;
        System.out.println(resultF);



        double averageTemp = (convertCtoF(day1TempInC) + convertCtoF(day2TempInC)+ convertCtoF(day3TempInC)+ convertCtoF(day4TempInC))/4;
        System.out.println(averageTemp);



    }
    public static void printSumOfTwoNumbers(int num1, int num2) {
        //we dont need to put return statement bc the return type is void
        //we can put as many statements sa we need to
        System.out.println("Adding two numbers together "+(num2 + num1));

    }
     public static void printHello(){
        System.out.println("Hello World");
    }
    public static double multiplication(double num1, double num2){
      // System.out.println("The product of two numbers is: "+(num1*num2));
double product =num1*num2;
    //    System.out.println(product);
return product;
    }
    //convert celsius to fahrenheit
    //(C*9/5)+32 = F
    public static double convertCtoF(double c){
        double f = (c*9/5)+32;
        return f;

    }
    //user should be succesfully logged in if user name is Demo and pass is "TestPassword"
   //for successful log in print out Success
   //otherwise printout "Failure"
    public static String Login(String login, String pass){
        if(login=="Demo" && pass =="TestPassword"){
            return "Success";
        } else {
            return "Failure";
        }
    }
}



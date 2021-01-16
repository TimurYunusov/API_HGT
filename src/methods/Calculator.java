package methods;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(TaxCalc(true,100000));
    }
    //task calculate tax
    //if married the tax should be salary*5/100;
    //if not tax salary * 30/100
    public static double TaxCalc(boolean isMarried, int salary){
        if(isMarried){
           double tax = salary*5/100;
            return tax;
        } else {
            double tax =salary*30/100;
            return tax;
        }
    }
}

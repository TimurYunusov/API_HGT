package arithmetic_operators;

public class MathExpressions2 {
    public static void main(String [] args){
       //addition
        int num = 300, num1 = 30,
                sum = num + num1,
                sum1 = 300 + 30;
        System.out.println(sum);
        System.out.println(sum1);

        int difference = num - num1;
        System.out.println(difference);

        int multiplication = num * num1;
        System.out.println(multiplication);

        int division = num/num1;
        System.out.println(division);



        /*double imlicitCoasting = amountOfOranges;
        System.out.println(imlicitCoasting);

        int explicitCoasting = (int)priceOfOrange;
        int totalInt = (int)priceOfOrange*amountOfOranges;
        System.out.println(totalInt);
        */

        double priceOfOrange = 0.99;
        int amountOfOranges = 4;
        double total = priceOfOrange*amountOfOranges;
        System.out.println("Price for an orange: /t $"  + priceOfOrange);
        System.out.println("Amount: /t/t/t/t/t " + amountOfOranges);
        System.out.println("Total: $ /t/t/t/t/t/ " + total);





    }

}

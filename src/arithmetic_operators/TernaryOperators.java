package arithmetic_operators;

public class TernaryOperators {
    public static void main(String[] args) {
        //I want to know where I should go
                //Morning = go to gym
        //afternoon -> Lunch
        //Evening -> go to DevX Class
        String time = "Morning";
        //if time equals to Morning
        //then return "Gym"
        // : otherwise return "Devx Class";

        String whereShouldIGo = time == "Morning"? "Gym" : "DevX Class";
        System.out.println(whereShouldIGo);
        System.out.println(time == "Morning"? "Gym" : "DevX Class");

        String carOffered = "BMW";

        boolean buy = carOffered == "Ferrari" ? true : false;
        System.out.println(buy);

        //Write my name in upper or lowercase based on my selection
        String casee = "upper";
        String name = casee == "upper" ? "JOHN" : "john";
        System.out.println(name);

        int num1 =36;
        int num2 = 152;
        int num3 = 213;
//ask questions is num1 > num2? Then return num1, otherwise return num2
        int max = num1 > num2 ? num1  : num2;
        System.out.println(max);
int max2 = num1 > num2 && num1 > num3 ? num1 : (num2>num3 ? num2 : num3);
System.out.println(max2);

boolean isExpensive = true;
boolean isGoodQuality = true;

boolean buy1 = false;
buy1&= isGoodQuality;
System.out.println(buy);

int a = 10, b=5, c= 1, result;
result = a - ++c - ++b;
System.out.println(result);
    }

}

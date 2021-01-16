package arithmetic_operators;

public class LogicalOperatorsExample {
    public static void main(String[] args) {

        Boolean isMarried = false;
        int age = 30;
        double height = 181;
        int weight = 77;
        boolean isJamesBond = age >=21 && age <=35
                && height > 180
                && weight >=70
                && weight <=80
                && !isMarried;
        System.out.println(isJamesBond);
//with booleans we dont use == signs
        // true == true;
        // false == true;
        //boolean isMarried = false;
        // !isMarried => negating
       /* System.out.println(!isMarried);

        int year =xx;
        int day = xx;
        int month =xx;
        /*/


    }
}

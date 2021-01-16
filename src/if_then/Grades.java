package if_then;

public class Grades {
    public static void main(String[] args) {
        int score = 98;
        String message ="";
        if (score > 89 && score < 101) {
            message ="A";;
        } else if (score > 79 && score < 90) {
            message ="B";;
        } else if (score > 69 && score < 80) {
            message ="C";
        } else if (score > 59 && score < 70) {
            message ="D";
        } else if (score > 0 && score < 60) {
            message ="F";
        } else {
            System.err.println("Wrong input please input score 0-100");
        }
System.out.println("Your grade is: " + message);
    }
}
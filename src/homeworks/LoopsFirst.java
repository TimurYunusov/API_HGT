package homeworks;

public class LoopsFirst {
    public static void main(String[] args) {
        //1+2+3+4+5+6+7+8+9+10+11+12 = 78;

        int counter = 1, sum = 0;
        while(counter<=12){
if(counter==12) System.out.print(counter);
          else  System.out.print(counter + "+");
            sum+=counter;
            counter++;
        }
        System.out.print(" = "+sum +";");

    }
}

package loops;

public class Break {
    public static void main(String[] args) {
        //break statement
        //break statement is used for ending and jumping out of the loop altogether.
        //when you are looking for something and found early on
        //which means that you don't really need to keep
        //iterating. You can stop loop using break
        System.out.println(repeatEnd("Hello", 3));



        String str  ="DevX School";
        for(int i = 0; i<str.length();i++ ) {
            if (str.charAt(i) == 'h') {
                System.out.println("I found it");
                System.out.println("It was at index " + i);
                break;
            }
            System.out.println("Looked at index " + i);

        }
    //find first number from 0-100 that's evenly divisible by 13

        for(int i=1; i<=100; i++){
            if(i % 13 ==0){
                System.out.println(i);
                System.out.println("Divided " + i + " by 13 evenly");
                break;
            }
            System.out.println("Divided " + i + " by 13");
        }



    }
    public static String  repeatEnd(String str, int n) {
        int l = str.length();
        String toRepeat = str.substring(l-n); // our toRepeat = "llo"
        for(int i = 0; i<n-1; i++ ){   // n=3 so loop will iterate
            toRepeat+=toRepeat;

        }return toRepeat;
    }

}

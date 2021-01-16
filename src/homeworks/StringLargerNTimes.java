package homeworks;

public class StringLargerNTimes {
    public static void main(String[] args) {
        //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        //
        //stringTimes("Hi", 2) → "HiHi"
        //stringTimes("Hi", 3) → "HiHiHi"
        //stringTimes("Hi", 1) → "Hi"
        String given = "Hi";
        int times = 3;
        String toReturn = "";
        for(int i =0 ; i<=times-1; i++){
            toReturn+=given;
        }
        System.out.println(toReturn);
    }
}

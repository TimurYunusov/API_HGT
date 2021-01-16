package homeworks;

public class StringsSlackHomework {
    public static void main(String[] args) {
        ////Given a US Phone number without "-"
        //        //ex: 3127302097
        //        //make it in the following format -> +1 312-730-2097

StringBuilder number = new StringBuilder("3127302097");
number.insert(0, "+1 ").insert(6,"-").insert(10, "-");
        System.out.println(number);

    }
}
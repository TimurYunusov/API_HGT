package loops;

public class StringVsStringBuilderinLoops {
    public static void main(String[] args) {
        //get an input from a user
        //and modify the text with wrapping every word
        //with {}

        //ex: Hello World = {Hello} {World}
        //if you have a task;
//        String alphabet ="ABCDEFGHIKLMNOPQRSTYZ";
//        String str = "ABC";
//        int i = 3;
//        while (i< alphabet.length()){
//            str += alphabet.charAt(i);
//            i++;
//        }
//        System.out.println(str);

        String alphabet ="ABCDEFGHIKLMNOPQRSTYZ";
        StringBuilder str = new StringBuilder("ABC");
        int i = 3;
        while (i< alphabet.length()){
            str.append(alphabet.charAt(i));
            i++;
        }
        System.out.println(str);
    }
}

package string_methods;

public class StartsWith {
    public static void main(String[] args) {
        String str = "E1234";
        if(str.startsWith("E")) {
            //send email dedicated to Engineers.
        } else if(str.startsWith("I")){
            //sent a motivation email for Christmas
        } else if(str.startsWith("M")){
         //   send them thanks for achieved milestones
        }

        String str2 = "Hello World";
        System.out.println(str2.startsWith("l", 2));
    }
}

package homeworks;

import java.util.Scanner;

public class MethodsEmailSignature {
    public static void main(String[] args) {
        //  //write a method which will take a Full Name and Job Title and create an email signature
        //    //John Doe, Sr. SDET
        //    //John Doe
        //    //Sr. SDET at Google
        //    //All information is confidential.
        //    //google.com, maps.google.com
        //    //312-730-2097
        //    //no return type.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
String fullName = sc.nextLine();
        System.out.println("Please enter your job title");
        String jobTitle = sc.nextLine();
        emailSignature(fullName,jobTitle);
    }
    public static void emailSignature(String fullName, String jobTitle){
        String signature = fullName+", "+ jobTitle;
        String text =signature + "\n All information is confidential. \ngoogle.com, maps.google.com \n312-730-2097";
        System.out.println(text);
    }
}

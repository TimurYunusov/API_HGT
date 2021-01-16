package if_then;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        //Their age
        //if age 7-9 -> elementary school
        //if the students native language English -> English class,
        //if Spanish -> Spanish classes
        // if any other => English Classes
        //10-13 -> middle school
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age =sc.nextInt();
        System.out.println("Enter your native language:");

String language = sc.next();
String classTogo = "";
        if(age > 6 && age < 10 ){ //open first if
            System.out.println("Go to Elementary School");
            if(language.equals("English")) {
                classTogo = "English class";
            }  else if (language.equals("Spanish")) {
        classTogo = "Spanish class"; }
        } else if(age>9 && age<14) {
            System.out.println("Go to Middle school");
            classTogo ="English class";
    } System.out.println("in " + classTogo);




} }


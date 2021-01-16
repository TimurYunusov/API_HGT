package homeworks;

import java.util.Scanner;

public class ArraysFirst {
    public static void main(String[] args) {
        int[] studentAges = {21, 23, 19, 44, 32, 35, 24, 28, 40, 33};
        //Sum of student
        int sum = 0;
        for (int i = 0; i < studentAges.length; i++) {
            sum += studentAges[i];
        }
        System.out.println("sum of students age is: " + sum);
        System.out.println("the average of students age is: " + (sum / studentAges.length));

        int max = studentAges[0];
        int min = studentAges[0];
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] > max) {
                max = studentAges[i];
            }
            if (studentAges[i] < min) {
                min = studentAges[i];
            }
        }
        System.out.println();
        System.out.println("Max age " + max);
        System.out.println("Min age " + min);



        // race => Asian ,Latino,White,Black
        String[] studentRaces = {"Asian", "White", "Black", "Latino", "Latino", "Latino", "Black", "White", "Asian", "White"};
        //Latinos number
        int counterLatino = 0;
        int counterWhite = 0;
        int counterBlack = 0;
        int counterAsian = 0;
        for (int i = 0; i < studentRaces.length; i++) {
            if (studentRaces[i].equals("Latino")) {
                counterLatino++;
            }
            if (studentRaces[i].equals("White")) {
                counterWhite++;
            }
            if (studentRaces[i].equals("Black")) {
                counterBlack++;
            }
            if (studentRaces[i].equals("Asian")) {
                counterAsian++;
            }
        }
        System.out.println();
        System.out.println("Latino " + counterLatino + "\n" + "White " + counterWhite + "\n" + "Black " + counterBlack + "\n" + "Asian " + counterAsian);



        String[] ethnicity = {"Ukrainian", "American", "Ukrainian", "French", "French", "Japan", "Japan", "American", "Ukrainian", "Brazilian"};
        int eUkrainian = 0;
        int eAmerican= 0;
        int eFrench = 0;
        int eJapan = 0;
        int eBrazilian = 0;
        for (int i = 0; i < ethnicity.length; i++) {
            if (ethnicity[i].equals("Ukrainian")) {
                eUkrainian++;
            }
            if (ethnicity[i].equals("American")) {
                eAmerican++;
            }
            if (ethnicity[i].equals("French")) {
                eFrench++;
            }
            if (ethnicity[i].equals("Japan")) {
                eJapan++;
            }
            if (ethnicity[i].equals("Brazilian")) {
                eBrazilian++;
            }
        }
        System.out.println();
        System.out.println("Ukrainian students  " + eUkrainian);
        System.out.println("American " + eAmerican);
        System.out.println("French " + eFrench);
        System.out.println("Japan " + eJapan);
        System.out.println("Brazilian " + eBrazilian);





        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //Only Weekends
        String temp = "";
        String tempday = "";
        for (int i = 0; i < daysOfTheWeek.length; i++) {
            if (daysOfTheWeek[i].startsWith("S")) {
                temp += daysOfTheWeek[i] + " "; }
            if (!daysOfTheWeek[i].startsWith("S")) {
                tempday += daysOfTheWeek[i] + " "; }
        }System.out.println();
        System.out.println("Weekdays:" + " " + tempday);
        System.out.println("Weekends:" + " " + temp);
    }
}
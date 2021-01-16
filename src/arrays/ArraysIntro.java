package arrays;

import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        //As a representative of a education department
        //I'd like to get ages of every student

        //race -> Asian, Latino, White, Black

        //ethnicity

        //gender

        int [] ages = new int [3];


        int [] studentAges = new int [10];
        studentAges[0]=20;
        System.out.println(studentAges [0]);
        studentAges [1] = 31;
        System.out.println(studentAges[1]);
int average = (studentAges [0] +studentAges [1]) /2;;
        System.out.println(average);
//studentAges[] = {20,31,44,19,50,38,35,18,22,31};
        int sum = 0;
        for(int i = 0; i<10; i++){
           sum+= studentAges[i];
        }
        System.out.println(sum/2);

        String[] studentRaces = new String[10];
        studentRaces[0]="Asian";
        studentRaces[1]="White";
        studentRaces[2]="Black";
        studentRaces[3]="Latino";
        studentRaces[4]="Latino";
        studentRaces[5]="Latino";
        studentRaces[6]="Black";
        studentRaces[7]="White";
        studentRaces[8]="Asian";
        studentRaces[9]="White";
        int counter= 0;
        for(int i =0; i<10; i++ ){
           if(studentRaces[i].equals("Latino")){
               counter++;
            }
        } System.out.println(counter);

        Scanner sc = new Scanner(System.in);
        String[] studentEthnicity = new String[10];
        for(int i = 0; i<10;i++){
            studentEthnicity[i] = sc.nextLine();
        }
        System.out.println(studentEthnicity[4]);

        String[] studentsArray = {"John Doe", "Elon Musk", "Melanie Parker", "Jeff Bezos"};

    }
}

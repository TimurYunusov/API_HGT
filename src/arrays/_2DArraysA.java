package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2DArraysA {
    public static void main(String[] args) {


        String[][] employees = new String[4][];
        employees[0] = new String[]{"Elon Musk", "Steve Jobs", "Larry Page", "Sergey Brin", "Melanie Perkins"};
        employees[1] = new String[]{"John Doe", "Gran Cardone", "Jeff Bezos", "Larry Page"};
        employees[2] = new String[]{"Jane Doe", "Kevin hart", "Beckham"};
        employees[3] = new String[]{"Torontino", "Askar", "Hemant", "Ravindra"};

        System.out.println("Choose one of the following options");
        System.out.println("0 - Tech Department");
        System.out.println("1 - Sales Department");
        System.out.println("2 - Marketing Department");
        System.out.println("3 - Customer Service");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        for (int i = 0; i < employees[choice].length; i++) {
            deleter(employees,"Steve Jobs");
            System.out.println(Arrays.deepToString(employees));


        }


        //1. Elon Musk, Jeff Bezos, Melanie Perkins.
        //2. Steve Jobs, Larry Page
        //3. Bill Gates, Mark Zuckerberg, Alexander Brin, Larry Allison.

        //1. count all number of employees.
        //2. find the department with most employees.
        //3. delete a given employee. -> a given employee should become an empty string.
        //4. change a given employee.
    }

    public static void deleter(String[][] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].length; j++) {
                if (employees[i][j].equals(name)) {
                    employees[i][j] = "";
                }
            }
        }

    }
}

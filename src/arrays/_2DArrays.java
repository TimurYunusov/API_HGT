package arrays;

import java.util.Arrays;

public class _2DArrays {
    public static void main(String[] args) {
//        int[][] arr = {{3,4,5,6,8,3}
//                ,      {4,5,7,9,7,5},
//                       {3,5,7,9,0,2}};
//for(int i = 0; i< 4; i++){
//    System.out.println(arr[i][i]);
//}
      //  1. count
        //2. find where most employees
        //3. delete a given employee
        //4. change a given employee

String[][] employees= new String[][]{{"Elon Musk", "Jeff Bezos", "Melanie Perkins"},
                                     {"Steve Jobs", "Larry Page"},
                                     {"Bill Gates", "Mark Zuckerberg", "Sergey Brin", "Larry Allison"}};
        whereIsTheMost(employees);
        System.out.println(Arrays.toString(deleter(employees,"Steve Jobs")));

    }
    public static void counter(String[][] employees){
        int howMany = employees[0].length + employees[1].length+employees[2].length;
        System.out.println("We have "+ howMany+ "employees in 3 departments");
    }
    public static void whereIsTheMost(String[][] employees){
        int winner =(employees[0].length>employees[1].length && employees[0].length>employees[2].length) ? employees[0].length : (employees[1].length >employees[2].length) ? employees[1].length : employees[2].length;
    }
    public static String[][] deleter(String[][] employees,String name) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; i < employees.length; j++) {
                if (employees[i][j].equals(name)) {
                    employees[i][j] = employees[i][j].replace(name, "");
                }
            }
        }return employees;


    }}

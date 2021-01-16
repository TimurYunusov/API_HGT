package homeworks;

import java.sql.SQLOutput;

public class LoopsChessBoard {
    public static void main(String[] args) {
        //# # # #
        // # # # #
        //# # # #
        // # # # #
        //# # # #
        // System.out.print(" # # # #
//        int hour=6;
//        double hourDegree = 360/12*hour;
//        int min=30;
//        int minDegree = 360/60*min;
//        double diff = (hourDegree+360/12*1/2)-minDegree;
//        System.out.println(diff);


        for (int i = 0; i < 4; i++) {
            System.out.println();
            if (i % 2 != 0) {
                System.out.print("#");
            }
            System.out.print(" #");
            for (int j = 0; j < 4; j++) {
                System.out.print(" #");
            }

        }
        System.out.println();
        printStars(5);

    }
    public static void printStars(int size){
        for(int i =0; i < size; i++){
            if( i % 2 ==1) System.out.print(" ");
            for(int j = 0; j < size; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
//    public static void t(){
//        for(int i =0; i < size; i++){
//            if( i % 2 ==1) System.out.print(" ");
//            for(int j = 0; j < size; j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//    }
}

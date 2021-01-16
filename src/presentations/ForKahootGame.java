package presentations;

public class ForKahootGame {
    public static void main(String[] args) {

//   1.     for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("%");
//                for (int x = 0; x < 5; x++) {
//                    System.out.print("#");
//                    for (int z = 0; z < 3; z++) ;
//                    System.out.println("@");
//                    for (int s = 0; s < 6; s++) {
//                        System.out.print("!");
//                        for (int m = 0; m < 5; m++) {
//                            System.out.print("   ");
//                        }
//                    }
//                }
//            }
//        }
//
//2.

        int a=0;
        for (int i = 0; i<10; i++){
            for(int k=0; k<=5; k++){
                for(int z = 1; z<=16; z=2*z){
                    a++;
                }
            }
        }
        System.out.println(a);

        int counter = 0;
        for(int i = 0; i<3; i++){
            for(int j= 0; j<3;j++){
           counter++;
            }
        }
        System.out.println(counter);





int age =18;
    for(int money = 0; money<1000000; money=money+200000){
        for(int honey = 50; honey>10; honey=honey-10){
            age++ ;
        }
    }

        System.out.println(age);



for(int i = 1; i<=3;i++){
    for(int j =1; j<=5;j++){
        System.out.print("*");

    }
    System.out.println();
}










    

for(int i = 4; i<=6; i++){
    for(int j = 3; j<5; j++){
        System.out.println("Do you like loops?");
    }
}


    }




}

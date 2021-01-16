package loops;

public class ForLoop {
    public static void main(String[] args) {
        //print out
//        for(int i= 0; i<5; i++){ //is not always guaranteed to run
//            System.out.println("Hello World");
//        }
//
//        for(int i= 1; i<6; i++) { //is not always guaranteed to run
//            System.out.println("DevX School " + i);
//        }


        for(int i = 5; i>=1; i--){
            System.out.println("Google " + i);
        }
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}

package coding_games;

public class ForLoopFun {
    public static void main(String[] args) {
        for(int x = 1; x<9; x++){
            System.out.println("||");
            for(int y = 1; y<6; y++) {
                System.out.print("||");
                for(int z = 1; z<10; z++){
                    System.out.print("-");
                    System.out.print(">");
                }
            } System.out.println("||");
        }
    }
}

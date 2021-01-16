package homeworks;

import java.util.Scanner;

public class ArraysTickTackToe {
    public static void main(String[] args) {
        //first user is going to play X.
        //second user is going to play O
        //you are going to ask a user X or O to enter cell number(coloumn, row)
        //once the user X or O enters the coloumn you need to print out a table with the X or O filled.
        //1. Enter X -> 2,0
        //2. Enter O -> 1,1
        //3. Enter X -> 0,2
        //   Enter O -> 0,1
        //   Enter X -> 2,2
        //   Enter O -> 2,1
        //   Enter X -> 1,2
        //
        //you write a logic which will say X or O won.
        //if no one won draw.
        //
        //       0     1     2
        /// --------------------
        /// 0  |   |    |  X   |
        //   --------------------
        /// 1 | O  |  O  |  O  |
        //---------------------
        /// 2 | X  |  X  |  X  |
        ///----------------------
        ///
        ///
        char[][] gameTable= {{'_','|','_','|','_'},
                             {'_', '|','_','|','_'},
                             {' ','|',' ','|',' '}};
        printTable(gameTable);
        int counter =1;
        while(counter<9){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you position (1-9)");
        int position = sc.nextInt();
        System.out.println("Please enter X or O");
        char decision = sc.next().charAt(0);
        positionUpdater(position,decision,gameTable);

        counter++;
        };
    }
    public static void printTable(char[][] gameTable){
        for(char[] row : gameTable){
            for(char a : row){
                System.out.print(a);
            }
            System.out.println();
        }

    }
    public static void positionUpdater(int position,char decision ,char[][] gameTable){
        switch (position){
            case 1:
                gameTable[0][0] = decision;
                printTable(gameTable);
                break;
            case 2:
                gameTable[0][2] = decision;
                printTable(gameTable);
                break;
            case 3:
                gameTable[0][4] = decision;
                printTable(gameTable);
                break;
            case 4:
                gameTable[1][0] = decision;
                printTable(gameTable);
                break;
            case 5:
                gameTable[1][2] = decision;
                printTable(gameTable);
                break;
            case 6:
                gameTable[1][4] = decision;
                printTable(gameTable);
                break;
            case 7:
                gameTable[2][0] = decision;
                printTable(gameTable);
                break;
            case 8:
                gameTable[2][2] = decision;
                printTable(gameTable);
                break;
            case 9:
                gameTable[2][4] = decision;
                printTable(gameTable);
                break;

        }
    }
}

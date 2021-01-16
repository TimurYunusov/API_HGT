package switch_statement;

import java.util.Scanner;

class SwitchStatementRestrictions {
    public static void main(String[] args) {
        System.out.println("Enter something");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
        final String CHKN ="Chicken";
        switch (animal) {
            case CHKN: //only constant values are allowed
                System.out.println("Domestic");
        }
    }
}

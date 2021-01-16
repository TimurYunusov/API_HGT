package homeworks;

public class Assignment3c {
    public static void main(String[] args) {



            // Please declare here the needed variables with the correct data types.

           String myName = "Zed A. Shaw";
           byte myAge = 35;     // not a lie
           double myHeight = 74.5;  // inches
           double myWeight = 180.0; // lbs
           String myEyes = "Blue";
           String myTeeth = "White";
           String myHair = "Brown";

            System.out.println( "Let's talk about " + myName + "." );
            System.out.println( "He's " + myHeight + " inches tall." );
            System.out.println( "He's " + myWeight + " pounds heavy." );
            System.out.println( "Actually, that's not too heavy." );
            System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." );
            System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );

            // This line is tricky; try to get it exactly right.
            System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
                    + " I get " + (myAge + myHeight + myWeight) + "." );
        }
    }


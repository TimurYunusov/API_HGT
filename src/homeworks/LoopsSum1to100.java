package homeworks;

public class LoopsSum1to100 {

    /**
     * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
     */

    public static void main(String[] args) {
        // Define variables
        int sum = 0;          // The accumulated sum, init to 0
        int lowerbound = 1;
        int upperbound = 100;

        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;

        }
        System.out.println("The sum of "+ lowerbound+ " to " + upperbound + " is " +sum );
    }
}


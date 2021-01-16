package homeworks;

public class CheckPassFail {  // Save as "CheckPassFail.java"
    public static void main(String[] args) {  // Program entry point
        int mark = 49;   // Set the value of "mark" here!
        System.out.println("The mark is " + mark);
        // call your void method here  passedOrFailed();
        passedOrFailed(mark);
    }
    //write a method for this example
// use a static void method and write here name and body of the method.
    // if-else statement
    public static void passedOrFailed(int mark){
      if (mark>50&&mark<=100) {
        System.out.println("PASSED");
    } else if(mark<50) {
        System.out.println("FAILED");
    } else {
          System.out.println("WRONG INPUT");
      }

}
}


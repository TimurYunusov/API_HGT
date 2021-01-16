package homeworks;

public class StringMethodExample {
    public static void main(String[] args) {
        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        //
        //helloName("Bob") → "Hello Bob!"
        //helloName("Alice") → "Hello Alice!"
        //helloName("X") → "Hello X!"

        String given = "Bob";
        String greeting = "Hello ";
        String toReturn = greeting.concat(given)+"!";
        System.out.println(toReturn);
    }
}

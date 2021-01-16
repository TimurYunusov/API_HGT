package string_methods;

public class Trim {
    public static void main(String[] args) {
        //you needed to check the addresses, get zip, state
        //"123 main st"
        String addressFromCustomer = " 123 main st";
        String addressWithoutTrailingSpaces = addressFromCustomer.trim();

        if(addressWithoutTrailingSpaces.equals("123 main st")){
            System.out.println("Transaction successful");

        }
    }
}

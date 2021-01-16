package arithmetic_operators;

public class LogicalOperator {
    public static void main(String[] args) {
        // || - conditional OR
        //use cases:
        //let insurance company
        //you want to provide insurance to people who are older than 18 not
        //the older 70
        int clientAge = 20;
                boolean insurance = clientAge >17 || clientAge<70;
        System.out.println("Is that true that I will be insured " + insurance);


     }
}

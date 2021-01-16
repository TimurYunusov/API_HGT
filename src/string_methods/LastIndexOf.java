package string_methods;

public class LastIndexOf {
    public static void main(String[] args) {
        String errorMessage = "ERROR This is wrong credit card info - transactionId: 11234556";
        //ERROR This is wrong credit card info - transactionId: 11234556;
        //Customer email is invalid - transactionId: 11234558;
        //Customer phone number is invalid - transactionId: 11234559;
int transactionIdN = errorMessage.lastIndexOf(":") +1;
String transactionId = errorMessage.substring(transactionIdN);

//#1 given a full US address. create a method to return zipcode.
//#2 create a method to return STATE.
//#3Create a method to return CITY
//#4 cretate a method to return address line.
//public String getAddressLine(String address);
        String fullCustomerAddress = "123 Main st apt #1, Brooklyn, NY, 23453";







    }

    //find customer
    public static String findCustomer(String transactionId) {
return "blablabla";
    }
}

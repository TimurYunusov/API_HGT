package homeworks;

public class StringsZipcode {
    public static void main(String[] args) {
        String fullCustomerAddress = "123 Main st apt #1, Brooklyn, NY, 23453";
        StringsZipcode ZipCaller = new StringsZipcode();
        System.out.println("Zipcode is: " + ZipCaller.getZipcode(fullCustomerAddress));
        System.out.println("Address is : " + ZipCaller.getAddress(fullCustomerAddress));
        System.out.println("The city is: " + ZipCaller.getCity(fullCustomerAddress));
        System.out.println("The state is: " + ZipCaller.getState(fullCustomerAddress));


    }

    public String getZipcode(String address) {
        int indexOfLastSpace = address.lastIndexOf(" ");
        return address.substring(indexOfLastSpace).trim();
    }

    public String getAddress(String address) {
        int indexFirstComma = address.indexOf(",");
        return address.substring(0, indexFirstComma);
    }

    public String getCity(String address) {
        int indexFirstComma = address.indexOf(",");
        int indexOfSecondComma = address.indexOf(",", indexFirstComma + 1);
        return address.substring(indexFirstComma + 1, indexOfSecondComma).trim();

    }

    public String getState(String address) {
        int indexOfLastSpace = address.lastIndexOf(",");
        int indexOfSpaceBeforeLast = address.lastIndexOf(",", indexOfLastSpace - 2);
        return address.substring(indexOfSpaceBeforeLast + 1, indexOfLastSpace).trim();
    }


}

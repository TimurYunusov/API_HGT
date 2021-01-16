package string_methods;

public class ContainsMethod {
    public static void main(String[] args) {

        String str = "Tesla Model X";
        //check is it Tesla car
        if(str.contains("Tesla")){
            System.out.println("Elon Musk is proud of you");
        } else if(str.isEmpty() || !str.contains("Tesla")) {
            System.out.println("Buy a modern car! Buy Tesla!");
        }
    }
}

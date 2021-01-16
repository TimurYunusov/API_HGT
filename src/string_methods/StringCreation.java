package string_methods;

public class StringCreation {
    public static void main(String[] args) {
        String name = "John Doe";
        String name1 = new String("Elon Musk");
        //differently stored in memory
        String carType = "4dr";

        boolean x = name.equals("Fluffy");
        System.out.println(x+name+name1);
        String message = name+" drives "+carType+ " car";
        System.out.println(message);

        String elonMuskMessage = name1 + " drives " + carType + " car";
        System.out.println(elonMuskMessage);

        int num =10;
        String str = "Hello";
        String str2 = " World";

        System.out.println(str);
        System.out.println(str2);

        System.out.println(str.concat(str2));
        String result = "Happy new ";
        int year = 2021;
        String newYear = result.concat(year +" ");
        //compound operations are also allowed

        result+=" 2021";
        System.out.println(result);






    }
}

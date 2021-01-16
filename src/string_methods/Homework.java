package string_methods;

public class Homework {
    public static void main(String[] args) {
        //Given a US Phone number without "-"
        //ex: 3127302097
        //make it in the following format -> +1 312-730-2097
        StringBuilder phoneNumber =new StringBuilder("3127302097");
        phoneNumber
                .insert(0,"+1 ")
                .insert(6," ")
                .insert(10," ");
        System.out.println(phoneNumber);

        //delete all suffixes from company names.
        //DevXSchool LLC
        //CME Group Inc
        //Apple Inc
        StringBuilder lastword = new StringBuilder(" CME Group Inc");
        System.out.println(lastword.substring(0,lastword.lastIndexOf(" ")));  //runs correct

        lastword.delete(lastword.lastIndexOf(" "),lastword.length());
        System.out.println(lastword);





    }

}

package loops;

public class Kate {
    public static void main(String[] args) {
        System.out.println(ransomWord("java", "avja"));
    }
    public static boolean ransomWord(String str1, String str2){
        if(str1.length() > str2.length()){
            return false;
        }
        boolean check = false;
        String temp = "";
        for(int i = 0; i<str1.length(); i++ ){
            for(int j = 0; j<str2.length(); j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    System.out.println(temp+=str2.charAt(j));
                    check =  true;
                }
            }
        }
        return check;
    }
}

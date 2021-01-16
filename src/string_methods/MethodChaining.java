package string_methods;

import java.util.Locale;

public class MethodChaining {
    public static void main(String[] args) {
    String str =" steve jobs ";
    String result = str.trim()
            .replaceFirst("s", "S")
            .replace('j', 'J');
        System.out.println(result);

        String str2 = " Sierrra Coffee    ";
        String result2 = str2.trim()
                .toUpperCase()
                .replaceFirst("R", "");
        System.out.println(result2);
    }

}

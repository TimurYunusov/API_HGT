package string_methods;

public class Append {
    public static void main(String[] args) {
        StringBuilder fullName = new StringBuilder("Elon");
        fullName.append("")
                .append("Musk")
                .append(" ")
                .append("11");
        System.out.println(fullName);

        StringBuilder sb = new StringBuilder("Hello World");
        sb.reverse();
        System.out.println(sb);

    }
}

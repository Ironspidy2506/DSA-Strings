package StringBuilder;

public class Basics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }

        System.out.println(sb);

        // Similar to strings the stringbuilders also has many methods that can be accessed using dot (.) operator
        sb.deleteCharAt(5);

        System.out.println(sb.length());

        System.out.println(sb.reverse());
    }
}

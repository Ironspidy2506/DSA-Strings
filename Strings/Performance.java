package Strings;

public class Performance {
    public static void main(String[] args) {
        String s = "";
        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            s += ch;
        }
        // In this actually the string s is created multiple times after appending any character it makes a new object of it, so this minimise the performance 
        // Space complexity - O(n^2)

        System.out.println(s);
    }
}

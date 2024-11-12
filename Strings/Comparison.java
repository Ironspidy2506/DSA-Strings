package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Vidya";
        String b = "Vidya";

        // Checks whether the value is pointing to the same object
        System.out.println(a == b);

        // How to create a diff object of the same value
        String c = new String("Vidya");
        String d = new String("Vidya");
        System.out.println(c == d);
        
        // How to check whether two values of similar regardless of objects
        System.out.println(c.equals(d));
    }
}

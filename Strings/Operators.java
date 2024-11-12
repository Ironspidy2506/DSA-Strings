package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");

        System.out.println((char)('a' + 3));

        System.out.println("a" + 2);
        // this would be same as "a" + "2"
        // int will be converted to Integer and that will cal toString()

        System.out.println("Spidy " + new ArrayList<>());

        System.out.println("Spidy " + new Integer(7321));

        // System.out.println(new Integer(99) + new ArrayList<>()); // Cannot be done as + operator works with strings and primitives

    }
}

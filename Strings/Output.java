package Strings;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56); // Calls the value of method in java and value of method explicitly calls integer toString method
        System.out.println("Kunal"); // Calls the value of method in java and value of method explicitly calls string toString method

        System.out.println(new int[] { 1, 2, 3, 4, 5 }); // Calls the value of method in java and value of method explicitly calls object toString method
        
        System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5 })); // Calls the value of method in java and value of method explicitly calls Arrays toString method, this overrides the object tostring method in java


        String name = null; // Calls the value of method in java and value of method explicitly calls object toString method
        // (obj == null) ? "null" : obj.toString();
        System.out.println(name);
    }
}

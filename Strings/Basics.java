package Strings;

public class Basics {
    public static void main(String[] args) {
        // String is not a data type it's a class
        // String has two properties - String Pool, Immutability

        // 1) String Pool
        // If we have to create mutliple strings with same name then instead of creating multiple objects of it, code only creates a pool of it
        
        // 2) String Immutability
        // When another variable with same name is created, now both the variables are pointing to the same name in the string pool, but if we change the name in second variable the change will not occur in the first variable unlike arrays, this is called string immutability
        String name = "Priyanshu Sahu";
        System.out.println(name);
    }
}
package Strings;

public class PrettyPrinting {
    /*
     * There are many format specifications we can use. Here are some common uses:
     * 
     * %c - Character
     * %d - Decimal number (base 10)
     * %e - Exponential floating number
     * %f - Floating point number
     * %i - Integer (base 10)
     * %o - Octal number (base 8)
     * %s - String
     * %u - Unsigned decimal (integer) number
     * %x - Hexadecimal number (base 16)
     * %t - Date/time
     * %n - NewLine
     */

    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formatted numebr is %.2f", a);

        System.out.printf("Pie : %.3f", Math.PI);

        System.out.printf("Hello my name is %s, I am a %s", "Spidy", "Programmer");
    }
}

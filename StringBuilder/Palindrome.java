package StringBuilder;

import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("String is Palindrome!");
        } else {
            System.out.println("String is not a Palindrome!");

        }

        sc.close();
    }
}

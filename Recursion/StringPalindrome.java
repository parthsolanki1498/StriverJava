package Recursion;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        boolean isPalindrome = recursionPalindrome(0, input);
        System.out.println(isPalindrome);
    }

    public static boolean recursionPalindrome(int i, String s) {

        // Base Condition
        // If i exceeds half of the string, means all the elements
        // are same and we return true
        if(i > s.length() / 2 ) {
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return recursionPalindrome(i+1, s);
    }
    
}

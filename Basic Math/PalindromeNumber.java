import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int actualN = n;
        int reminder = 0, reverse = 0;
        boolean isPalindrome = false;

        while(n > 0) {
            reminder = n % 10;
            reverse = reverse * 10 + reminder;
            n = n / 10;
        }

        if(reverse == actualN) {
            isPalindrome = true;
        }

        System.out.println(isPalindrome);
    }
}

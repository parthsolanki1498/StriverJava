import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int reminder = 0, reverse = 0;
        while(n > 0) {
            reminder = n % 10;
            reverse = reverse * 10 + reminder;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}

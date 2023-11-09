import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        int ans = gcd(num1, num2);
        System.out.println(ans);
    }

    public static int gcd(int num1, int num2) {
        if( num2 == 0) {
            return num1;
        }

        return gcd(num2, num1 % num2);
    }
    
}

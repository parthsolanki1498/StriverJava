package Recursion;

import java.util.Scanner;

// Time Complexity - O(N)
// Space Complexity - O(N)
public class FactorialOfN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int factorial = factOfN(n);
        System.out.println(factorial);
    }

    public static int factOfN(int n) {
        if(n == 0){
            return 1;
        }

        return n * factOfN(n - 1);
    }
    
}

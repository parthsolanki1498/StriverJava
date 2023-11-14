package Recursion;

import java.util.Scanner;


// Multiple Recursion Calls
// Time Complexity - O(2^n) - exponential
public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int ans = recursionFibo(n);
        System.out.println(ans);
    }

    public static int recursionFibo(int n){
        if(n <= 1){
            return n;
        }
        int last = recursionFibo(n-1);
        int secondLast = recursionFibo(n-2);

        return last + secondLast;
    }
}

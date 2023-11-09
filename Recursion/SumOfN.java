package Recursion;

import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        sumOfNParameterized(n, 0);

        int sum = sumOfNFunctional(n);
        System.out.println(sum);
    }

    // Parameterized Way
    public static void sumOfNParameterized(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNParameterized(i - 1, sum + i);
    }

    // Functional Way
    public static int sumOfNFunctional(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumOfNFunctional(n-1);
    }
    
}

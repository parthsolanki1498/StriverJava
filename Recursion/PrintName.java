package Recursion;

import java.util.Scanner;

// Time Complexity - O(N)
// Space Complexity - O(N)
public class PrintName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        printName(1, n);
    }

    public static void printName(int i, int n) {
        if(i > n){
            return;
        }

        System.out.println("Parth");
        printName(i + 1, n);
    }
    
}

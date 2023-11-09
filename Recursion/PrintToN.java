package Recursion;

import java.util.Scanner;

public class PrintToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        printToN(1, n);
    }

    public static void printToN(int i, int n){
        if(i > n) {
            return;
        }
        System.out.println(i);
        printToN(i + 1, n);

    }
    
}

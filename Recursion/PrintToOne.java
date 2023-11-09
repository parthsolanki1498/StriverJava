package Recursion;

import java.util.Scanner;

public class PrintToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        printToOne(1, n);
    }

    public static void printToOne(int i, int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        n--;
        printToOne(i, n);
    }
    
}

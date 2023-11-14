package Hashing;

import java.util.Scanner;

public class NumberHashing {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        // Precompute
        int[] hashArray = new int[10];
        for(int i = 0; i < n; i++){
            hashArray[array[i]] += 1;
        }

        int check = scanner.nextInt();
        while(check-- != 0){
            int numberToCheck = scanner.nextInt();
            System.out.println(hashArray[numberToCheck]);
        }
        scanner.close();

    }
}

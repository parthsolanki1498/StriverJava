package Sorting;

import java.util.Scanner;


// Time Complexity - Worst and Average is O(n^2) but best is O(N)
public class InsertionSort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        for(int i = 0; i <= n - 1; i++) {
            int j = i;
            while(j > 0 && array[j-1] > array[j]) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }

        for(int ele : array) {
            System.out.println(ele);
        }
    }
}

package Sorting;

import java.util.Scanner;

public class RecursiveBubbleSort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        recursiveBubbleSort(array, n);

        for(int ele : array) {
            System.out.println(ele);
        }
        
        scanner.close();
    }

    private static void recursiveBubbleSort(int[] array, int n) {
        // TODO Auto-generated method stub
        if(n == 1) return;

        for(int j = 0; j <= n - 2; j++) {
            if(array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }

        recursiveBubbleSort(array, n - 1);
    }
}

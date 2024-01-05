package Sorting;

import java.util.Scanner;

public class RecursiveInsertionSort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        recursiveInsertionSort(array, 0, n);

        for(int ele : array) {
            System.out.println(ele);
        }

        scanner.close();
    }

    private static void recursiveInsertionSort(int[] array, int i, int n) {
        // TODO Auto-generated method stub
        if( i == n ) return;

        int j = i;
        while( j > 0 && array[j - 1] > array[j]) {
            int temp = array[j - 1];
            array[j - 1] = array[j];
            array[j] = temp;
            j--;
        }

        recursiveInsertionSort(array, i + 1, n);
    }
}

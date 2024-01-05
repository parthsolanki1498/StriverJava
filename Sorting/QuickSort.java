package Sorting;

import java.util.Scanner;

public class QuickSort {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, n - 1);

        for(int ele : array) {
            System.out.println(ele);
        }

        scanner.close();
    }

    private static void quickSort(int[] array, int low, int high) {
        // TODO Auto-generated method stub
        if(low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // TODO Auto-generated method stub
        int pivot = array[low];
        int i = low;
        int j = high;

        while ( i < j) {
            while(array[i] <= pivot && i <= high - 1) {
                i++;
            }
            while(array[j] > pivot && j >= low + 1) {
                j--;
            }
            if(i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        
        return j;
    }
}

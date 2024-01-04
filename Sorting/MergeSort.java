package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        mergeSort(array, 0, n - 1);

        for(int ele : array) {
            System.out.println(ele);
        }

        scanner.close();
    }

    private static void mergeSort(int[] array, int low, int high) {
        // TODO Auto-generated method stub
        if( low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(array, low, mid); // for left half
        mergeSort(array, mid + 1, high); // for right half
        merge(array, low, mid, high); // merge both halves

        // throw new UnsupportedOperationException("Unimplemented method 'mergeSort'");
    }

    private static void merge(int[] array, int low, int mid, int high) {
        // TODO Auto-generated method stub

        ArrayList<Integer> temp = new ArrayList<>(); // Temp Array
        int left = low; // starting index of left half of the array
        int right = mid + 1; // starting index of right half of the array

        // sorting elements in the temp array
        while (left <= mid && right <= high) {
            if(array[left] <= array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }

        // if elements are left in the left half
        while( left <= mid) {
            temp.add(array[left]);
            left++;
        }

        // if elements are left in the right half
        while( right <= high) {
            temp.add(array[right]);
            right++;
        }

        // transfering all elements from temp to array
        for(int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }
        // throw new UnsupportedOperationException("Unimplemented method 'merge'");
    }
    
}

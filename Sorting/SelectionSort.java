package Sorting;

import java.util.Scanner;



// Time Complexity - O(n^2) -> Best, Worst and Average
public class SelectionSort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i <= n - 2; i ++) {
            int minIdx = i;
            for(int j = i; j <= n - 1; j++) {
                if(array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
        
        scanner.close();
        for(int ele : array) {
            System.out.println(ele);
        }
    }
}

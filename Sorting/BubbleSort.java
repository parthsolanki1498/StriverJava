package Sorting;

import java.util.Scanner;


// Time Complexity - O(n^2) - worst and average while best is O(N)
// since we can loop out after nested loop if swap never happened
public class BubbleSort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for(int j = 0; j <= i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    didSwap = 1;
                }
            }

            if(didSwap == 0) {
                break;
            }
        }

        scanner.close();

        for(int ele : array) {
            System.out.println(ele);
        }
    }
}

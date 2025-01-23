package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestArray {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        };

        scanner.close();

        // Time Complexity - NlogN + N 
        System.out.println(bruteForceApproach(array));
        
        // Time Complexity - O(n) + O(n) = O(2n)
        System.out.println(betterApproach(array));

        // Time Complextiy - 
        System.out.println(bestApproach(array));
    }

    public static int bruteForceApproach(int[] array) {
        
        // First sort the array
        // Arrays.sort(array);
        for(int i = 0; i <= array.length - 2; i++) {
            int minIndex = i;
            for(int j = i; j <= array.length - 1; j++){
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

           int temp = array[i];
           array[i] = array[minIndex];
           array[minIndex] = temp;
        }

        // Now that array is sorted, we'll have largest at n - 1
        // And second largest at n - 2
        return array[array.length - 2];
    }

    public static int betterApproach(int[] array) {
        int firstLargest = 0;
        int secondLargest = -1;

        // For a better approach, we find largest with first pass check
        for(int element : array) {
            if(element > firstLargest) {
                firstLargest = element;
            }
        }

        // and travese the array for second time getting the second largest
        for(int element: array) {
            if(element > secondLargest && element != firstLargest) {
                secondLargest = element;
            }
        }

        return secondLargest;
    }

    public static int bestApproach(int[] array) {
        
        int firstLargest = array[0];
        int secondLargest = -1;

        for(int i = 1; i < array.length; i++) {
            if(array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
        }

        return secondLargest;
    }
}   
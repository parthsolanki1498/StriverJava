package Arrays;

import java.util.Scanner;

public class LargestInArray {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        scanner.close();

        // int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findLargest(array));
    }

    static int findLargest(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

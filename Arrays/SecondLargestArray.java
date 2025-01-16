package Arrays;

import java.util.Scanner;

public class SecondLargestArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(findSecondLargest(array));
    }

    static int findSecondLargest(int[] arr) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }   
}
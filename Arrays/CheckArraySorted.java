package Arrays;

import java.util.Scanner;

public class CheckArraySorted {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(isSorted(array));
    }

    public static boolean isSorted(int[] array) {
        for(int i = 1; i < array.length; i++) {
            if(array[i] >= array[i-1]){

            } else {
                return false;
            }
        }
        return true;
    }

}

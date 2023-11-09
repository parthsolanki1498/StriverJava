package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int l = 0;
        int r = array.length - 1;
        reverseArray(array,l,r);
        
    }

    public static void reverseArray(int[] array, int l, int r) {
        if(l < r){
            int temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            reverseArray(array, ++l, --r);
            System.out.println(Arrays.toString(array));
        }
    }
    
}

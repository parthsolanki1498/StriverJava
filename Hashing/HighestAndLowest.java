package Hashing;

import java.util.Scanner;

public class HighestAndLowest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        countHighestAndLowest(array, n);
        
        scanner.close();
    }

    public static void countHighestAndLowest(int[] array, int n){
        boolean visited[] = new boolean[n];
        int maxFreq = 0, maxEle = 0;
        int minFreq = n, minEle = 0;

        for(int i = 0; i < n; i++) {

            // Skip the element if it isalready proceesed
            if(visited[i] == true){
                continue;
            }

            // Count Frequency
            int count = 1;
            for(int j = i + 1; j < n; j++){
                if(array[i] == array[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if(count > maxFreq) {
                maxEle = array[i];
                maxFreq = count;
            }

            if(count < minFreq) {
                minEle = array[i];
                minFreq = count;
            }
        }

        System.out.println(maxEle);
        System.out.println(minEle);
    }
}

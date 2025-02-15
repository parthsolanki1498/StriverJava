package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateSorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        };

        scanner.close();

        int count = removeDuplicateSorted(array);

        for(int i = 0; i < count; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static int removeDuplicateSorted(int[] array) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            array[j++] = x;
        }
        return k;
    }
}
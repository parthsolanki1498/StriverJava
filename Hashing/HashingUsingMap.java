package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashingUsingMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Precompute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int key = array[i];
            int freq = 0;
            if(mp.containsKey(key)) {
                freq = mp.get(key);
            }
            freq++;
            mp.put(key, freq);
        }

        //  Iterating over the map
        // for(Map.Entry<Integer,Integer> it : mp.entrySet()) {
        //     System.out.println(it.getKey() + "->" + it.getValue());
        // } 

        int checkCount = scanner.nextInt();
        while(checkCount-- > 0){
            int checkNum = scanner.nextInt();
            // Fetch
            if(mp.containsKey(checkNum)) {
                System.out.println(mp.get(checkNum));
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }
    
}

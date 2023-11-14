package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] hash = new int[26];

        for(int i = 0; i < input.length(); i++){
            hash[input.charAt(i) - 'a']++;
        }

        char charToLook = scanner.next().charAt(0);
        scanner.close();
        System.out.println(hash[charToLook - 'a']);
    }
}

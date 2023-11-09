import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        boolean isArmstrong = false;

        int temp, digits = 0, last = 0, sum = 0;
        // Assign n to temp
        temp = n;

        // Loop till condition is false
        while(temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = n;
        while(temp > 0) {
            // Determine the last digit from the number
            last = temp % 10;

            // Calculate the power of a number up to digit times and add to sum
            sum += (Math.pow(last, digits));

            // Remove the last digit
            temp = temp / 10;
        }

        // Compare sum with n
        isArmstrong = (n == sum) ? true : false;

        System.out.println(isArmstrong);
    }
    
}

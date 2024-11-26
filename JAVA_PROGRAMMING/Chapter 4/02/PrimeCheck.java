// For লুপ ব্যবহার করে একটি সংখ্যা মৌলিক কিনা তা বের করার একটি Java programm শেখ।



import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        int i,num;
        boolean isPrime = true;  // Assume the number is prime
        Scanner input = new Scanner(System.in);

        // User input for the number
        System.out.print("Enter a number: ");
        num = input.nextInt();

        // Check if the number is divisible by any number from 2 to num-1
        for ( i = 2; i <= num / 2; i++) {
            if (num % i == 0) {  // If divisible, it's not prime
                isPrime = false;
                break;  // Exit the loop as we know it's not prime
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

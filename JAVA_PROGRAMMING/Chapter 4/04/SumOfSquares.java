// 1^2+2^2+3^+.......................n^2 or loop For loop ব্যবহার করে Fibonacci Series প্রিন্ট করার একটি Java Program তৈরি করে দেখাও



import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for the value of n
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        
        // Variable to store the sum of squares
        int sum = 0;

        // Using a for loop to calculate the sum of squares
        for (int i = 1; i <= n; i++) {
            sum += i * i;  // Add i^2 to the sum
        }

        // Displaying the result
        System.out.println("The sum of squares from 1^2 to " + n + "^2 is: " + sum);
        
        input.close();
    }
}

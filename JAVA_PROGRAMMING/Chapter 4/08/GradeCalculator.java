// Switch statement ব্যবহারপূর্বক Grade নির্ণয়ের জন্য জাভাতে একটি Java Program লেখ



import java.util.Scanner;

public class GradeCalculator {  // Changed class name to GradeCalculator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your mark (Out of 100): ");
        int mark = input.nextInt();
        String grade;

        switch (mark / 10) {
            case 10:
            case 9:
            case 8:
                grade = "A+";
                break;
            case 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;
            case 4:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        System.out.println("You are Grade: " + grade);  // Fixed print statement
    }
}






// দ্বিঘাত সমীকরণের মূল নির্ণয়ের জন্য Java তে একটি Program ।



import java.util.Scanner;

public class Quadratic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The root are"+r1+"and"+r2);
        }
        else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("The Root are"+r);
        }
        else {
            System.out.println("The root are not possible.");
        }
    }
}






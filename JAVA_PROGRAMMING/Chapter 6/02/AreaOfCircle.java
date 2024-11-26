// Circle নামে একটি class declare করে বৃত্তের ক্ষেত্রফল নির্ণয়ের জন্য Java language-এ Program লেখ।



import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = in.nextDouble();

        double area = (22* r *r )/7;
        System.err.println("The area of the circle is: " + area);


    }
    
}

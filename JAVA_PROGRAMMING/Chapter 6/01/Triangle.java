// TRIANGLE নামে একটি class ডিক্লেয়ার করে ত্রিভূজের ক্ষেত্রফল নির্ণয়ের জন্য একটি Java প্রোগ্রাম লেখ



import java.util.Scanner;  

class Triangle {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        
        // Get input for the sides of the triangle  
        System.out.print("Enter the first number: ");  
        int a = input.nextInt(); 
        
        System.out.print("Enter the second number: ");  
        int b = input.nextInt();  
        
        System.out.print("Enter the third number: ");  
        int c = input.nextInt();  

        if ((a + b) > c && (b + c) > a && (c + a) > b) {  
            int s = (a + b + c) / 2;  
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));  
            System.out.println("The area of the triangle is: " + area);  
        } else {  
            System.out.println("Triangle is not possible.");  
        }  
    }  
}


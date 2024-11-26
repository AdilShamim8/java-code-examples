// For loop ব্যবহার পূর্বক ১ হতে ১০০ পর্যন্ত মৌলিক সংখ্যাগুলো প্রিন্ট করার একটি Java Program লেখ


public class PrimeNbr {  
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");
        for (int i = 2; i <= 100; i++) {  
            boolean isPrime = true;  
            for (int j = 2; j * j <= i; j++) {  
                if (i % j == 0) {  
                    isPrime = false;  
                    break;  
                }  
            }  
            if (isPrime) System.out.print(i + " ");  
        }  
    }  
}

// ১+২+৩+8+ ………..+ ১০ সিরিজের যোগফল নির্ণয়ের জন্য একটি জাভা ক্লাস লেখ।





public class SumSeries {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of the series is: " + sum);
    }
}
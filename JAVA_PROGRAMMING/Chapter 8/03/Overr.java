// মাল্টিলেভেল ইনহেরিটেন্স ব্যবহার করে একটি জাভা প্রোগ্রাম লেখ।



public class SuperClass {

    int n;

    SuperClass() {
        n++; // Increment the value of n
    }

    public void GetData() {
        System.out.println("It is SuperClass");
        System.out.println("n= " + n);
    }
}

class Subclass extends SuperClass {

    int n;

    Subclass() {
        n++; // Increment the value of n
    }
    public void GetData() {
        System.out.println("It is Subclass");
        System.out.println("n= " + n);
    }
}

public class Overr {

    public static void main(String[] args) {
        SuperClass sp = new SuperClass();
        sp.GetData();

        Subclass sb = new Subclass();
        sb.GetData();
    }
}
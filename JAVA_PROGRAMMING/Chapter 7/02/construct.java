// Constructor method ব্যবহারপূর্বক Java-তে একটি Program লেখ।



package construct;
class Student {
    String name;
    int roll;
    float marks;
    public Student() {
        name = "Adil Shamim";
        roll = 765025;
        marks = 88.5f;
        System.out.println("Roll is " + roll);
        System.out.println("Name is " + name);
        System.out.println("Marks is " + marks);
    }
}
    public class construct {
      public static void main(String[] args) {
         Student s = new Student();
    }
}
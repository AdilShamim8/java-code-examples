// Overridden method ব্যবহার করে একটি Java program লেখ।



class Student {
    int Roll;
    String Name = new String();

    void GetData() {
        Roll = 765024;
        Name = "Adil";
    }

    void Display() {
        System.out.println("Inside Student Class");
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
    }
}

class Exam extends Student {
    float Mark;

    @Override
    void Display() {
        System.out.println("Inside Exam Class");
        System.out.println("Mark is: " + Mark);
    }
}

class Result extends Exam {
    Student s = new Student();
    Exam e = new Exam();

    @Override
    void GetData() {
        s.GetData();
        e.GetData(); // Fixed: Call GetData() on the Exam object
    }

    @Override
    void Display() {
        s.Display();
        e.Display();
    }
}
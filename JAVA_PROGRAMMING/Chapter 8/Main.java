// Superclass  
class Animal {  
    void eat() {  
        System.out.println("This animal eats food.");  
    }  
}  

// Subclass  
class Dog extends Animal {  
    void bark() {  
        System.out.println("The dog barks.");  
    }  
}  

// Another Subclass  
class Cat extends Animal {  
    void meow() {  
        System.out.println("The cat meows.");  
    }  
}  

public class Main {  
    public static void main(String[] args) {  
        Dog myDog = new Dog();  
        Cat myCat = new Cat();  

        // Calling methods from the super class  
        myDog.eat();  // Output: This animal eats food.  
        myCat.eat();  // Output: This animal eats food.  

        // Calling methods from the sub classes  
        myDog.bark(); // Output: The dog barks.  
        myCat.meow(); // Output: The cat meows.  
    }  
}
// inheritance 
class Animal {
    void eat() {
    System.out.println("eating...");
    }
    }
    
    // Subclass inheriting from superclass
    class Dog extends Animal {
    void bark() {
    System.out.println("barking...");
    }
    }
    
    // Main class
    class Main {
    public static void main(String[] args) {
    // Creating object of subclass
    Dog d = new Dog();
    // Calling methods of superclass
    d.eat();
    // Calling method of subclass
    d.bark();
    }
    }
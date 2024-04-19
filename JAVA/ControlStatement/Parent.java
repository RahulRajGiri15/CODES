//super,this--Keyword

class Parent {
    int num;

    // Constructor
    Parent(int num) {
        this.num = num;
    }
}

class Child extends Parent {
    int num2;

    // Constructor
    Child(int num, int num2) {
        super(num); // Calls the constructor of the Parent class
        this.num2 = num2;
    }
}

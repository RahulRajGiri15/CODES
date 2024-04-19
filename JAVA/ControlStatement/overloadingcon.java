class MyClass {
    int x;

    // Constructor 1
    MyClass() {
        this(10); // Calls the constructor with int parameter
    }

    // Constructor 2
    MyClass(int x) {
        this.x = x;
    }
}

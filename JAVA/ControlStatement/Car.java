//constructor overloading
public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor with no parameters
    public Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Constructor with make and model parameters
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 0; // Default year
    }

    // Constructor with all parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car(); // Default constructor
        Car car2 = new Car("Toyota", "Camry"); // Constructor with make and model
        Car car3 = new Car("Honda", "Civic", 2022); // Constructor with all parameters

        // Displaying details of each car
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}

abstract class Abstraction {
    abstract void display();   
}
class Car extends Abstraction{
    void display(){
        System.out.println("This is a car ");
    }
}
class Bike extends Abstraction{
    void display(){
        System.out.println("scooter starts with kick");
    }
    public static void main(String[] args) {
        Bike a =new Bike();
        a.display();
        Car b = new Car();
        b.display();
        //cannot call 
        // Abstraction c =new Abstraction();
        // c.display();

    }
}
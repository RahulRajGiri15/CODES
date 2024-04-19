class Animal {
    public void eat(){
        System.out.println("I am eating");
    }
    public static void main(String[] args) {
        System.out.println("1");
    
        Animal cat=new Animal();
        Animal dog=new Animal();
        dog.eat();
        cat.eat();
        cat.run();
        Birds pigeon =new Birds();
        pigeon.fly();
    }
    public void run(){
        System.out.println(" i am running ");

    }
}
class Birds{
    void fly(){
        System.out.println("i am flying");
    }
}
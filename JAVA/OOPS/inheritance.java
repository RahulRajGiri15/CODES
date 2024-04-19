// inheritance
// I am eating

// class Animal{
//     void eat(){
//         System.out.println("i am eating ");
//     }
// }
// class inheritance extends Animal{
//     public static void main(String[] args) {
//         inheritance cat=new inheritance();
//         cat.eat();
//     }
// }

//single inheritance

//i am eating
//i am running 

// class A{
//     void eat(){
//         System.out.println("i am eating ");
//     }
// }
// class B extends A{
//     void run(){
//         System.out.println(" i am running ");
//     }
//     public static void main(String[] args) {
//         //A cat=new A();
//         B cat=new B();
//         cat.eat();
//         cat.run();
//     }
// }


//Multilevel inheritance

// class A{
//     void eat(){
//         System.out.println("i am eating ");
//     }
// }

// class B extends A{
//     void run(){
//         System.out.println("i am running ");
//     }
//     // public static void main(String[] args) {
//     //     //A cat=new A();
//     //     //B cat= new B();
//     //     C cat =new C();
//     //     cat.eat();
//     //     cat.run();
//     //     cat.fly();
//     // }
    
// }
// class C extends B{
//     void fly(){
//         System.out.println("i am flying ");
//     }
//     public static void main(String[] args) {
//         //A cat=new A();
//         //B cat= new B();
//         C cat =new C();
//         cat.eat();
//         cat.run();
//         cat.fly();
//     }
    
// }

//Hiercial inheritance
class A{
    void eat(){
        System.out.println("i am eating ");
    }
}

class B extends A{
    void run(){
        System.out.println("i am running ");
    }
    // public static void main(String[] args) {
    //     //A cat=new A();
    //     //B cat= new B();
    //     C cat =new C();
    //     cat.eat();
    //     cat.run();
    //     cat.fly();
    // }
    
}
class C extends A{
    void fly(){
        System.out.println("i am flying ");
    }
    public static void main(String[] args) {
        //A cat=new A();
        //B cat= new B();
        B Dog =new B();
        C cat =new C();
        cat.eat();
        cat.fly();
        Dog.eat();
        Dog.run();
    }
    
}
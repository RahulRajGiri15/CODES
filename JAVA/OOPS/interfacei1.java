interface I1  {
    public  void show();
    default void run(){//only default and static funtions are generated
        System.out.println("hello");
    }
    
}

//through interface we can achieve multiple inheritance which is not possible through ordinary means.
interface I2{
     void display(){
        System.out.println("Rahul");
    }
}
class Test implements  I1,I2 {
    public void show()
    {
        System.out.println("1");
    }
    public void display(){
        System.out.println("this is 2nd interface");
    }
    public static void main(String[] args) {
        Test obj =new Test();
        obj.show();
        obj.run();
        obj.display();
    }
}
 
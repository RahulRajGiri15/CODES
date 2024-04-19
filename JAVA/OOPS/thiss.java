//this is a reference varible which refers to current class object 


// class thiss {
//     int i;
//     void showValue(int i){
//         //i=i; //here it print the default value of int that is 0;
//         this.i=i; // this.i --refers to the current instance varible not the local varible 
//     }
//     void show(){
//         System.out.println(i);
//     }
// }
// class Xyz{
//     public static void main(String[] args) {
//         thiss t =new thiss();
//         t.showValue(56);
//         t.show();
//     }
// }



// class thiss {
//     thiss(){
//         this(10);
//         System.out.println("no arg constructor");
//     }
//     thiss(int a){
//         //this();
//         System.out.println("parametrised constructor");
//     }
// }
// class Xyz{
//     public static void main(String[] args) {
//         thiss t =new thiss();
//         //t.display();
//         //t.show();
//     }
    
// }



class thiss {
    void m1(){
        //System.out.println("i am in m1 method");
        Xyz t = new Xyz(this);
    }
    void m2(){
        //m1(this);
    }
}
class Xyz{
    Xyz (thiss t){
        System.out.println("test class constructor ");
    }
    public static void main(String[] args) {
        thiss t =new thiss();
        //t.display();
        //t.show();
        //t.m2();
    }
    
}


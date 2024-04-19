//super is a reference varible which always refers to parent class object
 
class superr{
    int a=10;
}
class B extends superr{
    int a=20;
    void show(int a){
        System.out.println(this.a);
    }
    public static void main(String[] args){
        B ob = new B();
        ob.show(56);
    }
}








// class superr extends B {
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.show(56);
//     }
    
// }

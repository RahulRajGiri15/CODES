// class methodoverloading{
//     void run(){
//         System.out.println("i am running");
//     }
//     void run(int a){
//         System.out.println("i am good ");
//     }
//     public static void main(String[] args) {
//         methodoverloading obj = new methodoverloading();
//         obj.run();
//         obj.run(19);
//     }
// }


// class methodoverloading{
//     void run(float a, int b){
//         System.out.println("i am running");
//     }
//     void run(int a ,float b){
//         System.out.println("i am good ");
//     }
//     public static void main(String[] args) {
//         methodoverloading obj = new methodoverloading();
//         obj.run(20f,20);
//         obj.run(19,40f);
//     }
// }


// class methodoverloading{
//     void run(int... a){
//         System.out.println("i am good ");
//     }
//     void run(int b){
//         System.out.println("i am running");
//     }
    
//     public static void main(String[] args) {
//         methodoverloading obj = new methodoverloading();
//         obj.run(45);
//         obj.run(19,45,78,435);
//     }
// }


class methodoverloading{
    void run(String a){
        System.out.println("i am good ");
    }
    void run(int b){
        System.out.println("i am running");
    }
    
    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        //obj.run(45);
        //obj.run("rahul");
        obj.run("r");//Automatic promotion from cahr to int 
    }
}
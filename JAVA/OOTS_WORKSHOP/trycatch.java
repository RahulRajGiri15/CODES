//Wap for division using try and catch block

// import java.util.*;
// class trycatch {
//     public static void main(String[] args) {
//     try{
//         int a,i;
//         System.out.println("Enter your num for division ");
//         Scanner sc =new Scanner (System.in);
//         a=sc.nextInt();
//         for(i=0;i<=10;i++){
//             System.out.println(a+" * "+i+" = "+(a/i));
//         }
//     }
//     catch( ArithmeticException e){
//         System.out.println("This is some airthmetic Exception "+ e);
//     }
// }
// }


// wap for multiplication using try and catch block 

// import java.util.*;
// class trycatch {
//     public static void main(String[] args) {
//     try{
//         int a,i;
//         System.out.println("Enter your num for Multiplication ");
//         Scanner sc =new Scanner (System.in);
//         a=sc.nextInt();
//         for(i=0;i<=10;i++){
//             System.out.println(a+" * "+i+" = "+(a*i));
//         }
//     }
//     catch( ArithmeticException e){
//         System.out.println("This is some airthmetic Exception "+ e);
//     }
// }
// }



//wap for prime no  using try and catch block 

// import java.util.*;
// class trycatch {
//     public static void main(String[] args) {
//         int a,i;
//         System.out.println("Enter your num for Prime no checking ");
//         Scanner sc =new Scanner (System.in);
//         a=sc.nextInt();
//     try{
        
//         for(i=2;i<=a;i++){
//             if(a%i==0){
//                 break;
//             }
//         }
//         if(i==a){
//             System.out.println("a is prime no");
//         }
//         else{
//             System.out.println("a is not a prime no ");
//         }
//     }
//     catch( ArithmeticException e){
//         System.out.println("This is some airthmetic Exception "+ e);
//     }
// }
// }


// //Wap to find prime num using try and catch
   

// import java.util.*;
// class trycatch {
//     public static void main(String[] args) {
        
//     try{
        
//         int a,i,temp=0;
//         System.out.println("Enter your num for Prime no checking ");
//         Scanner sc =new Scanner (System.in);
//         a=sc.nextInt();

//         for(i=1;i<a/2;i++){
//             if(a%i==0){
//                 temp++;
//             }
//         }
//         if(temp==1){
//             System.out.println("a is prime no");
//         }
//         else{
//             System.out.println("a is not a prime no ");
//         }
//     }
//     catch( ArithmeticException e){
//         System.out.println("This is some airthmetic Exception "+ e);
//     }
// }
// }



//Wap to find sum of digit of a num  using try and catch


import java.util.*;
class trycatch {
    public static void main(String[] args) {
        
    try{
        
        int a,s=0,r;
        System.out.println("Enter your num to find sum of each digit in it  ");
        Scanner sc =new Scanner (System.in);
        a=sc.nextInt();

        while(a>0){
            r=a%10;
            s+=r;
            a=a/10;
        }
        System.out.println("sum of num is "+ s);
    }
    catch( ArithmeticException e){
        System.out.println("This is some airthmetic Exception "+ e);
    }
}
}



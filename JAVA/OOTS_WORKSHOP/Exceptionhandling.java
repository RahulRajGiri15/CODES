// try and catch 

// class Exceptionhandling {
//     public static void main(String[] args) {
//         int d,a;
//         try{
//             //monitor block of code 
//             d=0;
//             a=42/d;
//             System.out.println("This will not be printed");

//         }catch(ArithmeticException e){
//             //catch divide by zero error
//             System.out.println("Division by zero.");
//     }
//     System.out.println("After catch statement.");
// }
// }


// class Exceptionhandling {
//     public static void main(String[] args) {
    
//         try{
//             //monitor block of code 
//             int a =args.length;
//             System.out.println("a = "+a);
//             int b=42/a;
//             int c[ ]={1};
//             c[42]=99;
//             System.out.println("This will not be printed");
//             try{
//                 if (a==1) a=(a/a-a);
//                 if(a==2) {int c[]={1};
//                     c[42]=99;}
                    
//                 }
//             catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println("Array index out-of-bounds:"+e);
//             }
      
//             }

//         catch(ArithmeticException e){
//             //catch divide by zero error
//             System.out.println("Division by zero.");
//     }
//     catch(ArrayIndexOutOfBoundsException e){
//         System.out.println("Array index oob: "+e);
//     }
//     finally{{
//         System.out.println("I am great ");
//     }}
//     System.out.println("After catch statement.");
// }
    
// }



class Exceptionhandling {
    public static void main(String[] args) {
        int d,a;
        try{
             throw new NullPointerException("demo");
        }catch(NullPointerException e){
            System.out.println("caught inside demop");
        }
            
        catch(ArithmeticException e){
            //catch divide by zero error
            System.out.println("Division by zero.");
    }
    System.out.println("After catch statement.");
}
}

// class Main {
//     public static void main(String[] args) {
//    DemoClass demo = new DemoClass();
//    demo.<String>genericsMethod("Java Programming");  
//    // generics method working with String
//    demo.<Integer>genericsMethod(25);  //generics method working with integer
//    }  }
//    class DemoClass {
//    public <T> void genericsMethod(T data) {
//     System.out.println("Generics Method:"); // create a generics method
//    System.out.println("Data Passed: " + data);
//      }
//    }

class Main {
    public static void main(String[] args) {
   DemoClass demo = new DemoClass();
   demo.<String>genericsMethod("Java Programming");  
   // generics method working with String
   demo.<Integer>genericsMethod(25);  //generics method working with integer
   }  }
   class DemoClass {
   public <T> void genericsMethod(T data) {
    System.out.println("Generics Method:"); // create a generics method
   System.out.println("Data Passed: " + data);
     }
   }
   
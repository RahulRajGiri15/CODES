

// class methodoverraiding {
    
//     void show(){
//         System.out.println("hello");
//     }
    
// }
// class text extends methodoverraiding {
//     void show(){
//         System.out.println("i am rahul");
//     }
//     void show(){
//         System.out.println("this is java ");
//     }
//     public static void main(String[] args) {
//         methodoverraiding t= new methodoverraiding();
//         t.show();

//         text obj = new text();
//         obj.show(); 
//     }
// }

class methodoverraiding {
    
    protected Object show(){
        System.out.println("hello");
        return null;
    }
    
}
class text extends methodoverraiding {
    public String show(){
        System.out.println("i am rahul");
        return null;
    }
    // void show(){
    //     System.out.println("this is java ");
    // }
    public static void main(String[] args) {
        methodoverraiding t= new methodoverraiding();
        t.show();

        text obj = new text();
        obj.show(); 
    }
}

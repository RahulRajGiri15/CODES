//abmiguity - mutiple task perform at same time but compiler itself dont know which task to perform fist

/*
 40
 60
 */
/* 
public class methodOverloading1 {
    void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}
    public static void main(String[] args) {
        methodOverloading1 obj=new methodOverloading1();
        obj.sum(20,20);
        obj.sum(20,20,20);
    }
}
*/

///ambiguity is shown here --as here is confusion

// public class methodOverloading1 {
//     void sum(int a,long b){System.out.println(a+b);}
//     void sum(long a,int b){System.out.println(a+b);}
//     public static void main(String[] args) {
//         methodOverloading1 obj=new methodOverloading1();
//         obj.sum(20,20);
//         obj.sum(20,20;
//     }
// }


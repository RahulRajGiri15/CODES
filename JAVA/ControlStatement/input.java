import java.util.*;

public class input {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner src = new Scanner(System.in); 
        String name = src.next();
        int a = src.nextInt();
        System.out.println("your name is "+name+"  "+a);
        System.out.println("enter your phone num");
        long num =src.nextLong();
        System.out.println("your phone num is "+num);
    }

}

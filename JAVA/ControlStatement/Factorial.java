import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your num to find factorial ");
        int n = s.nextInt();
        int i,fact=1;
        if(n==0){
            System.out.println("Factorial of 0 is 1");
        }
        else{
            for(i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of your num is "+fact);
        }
    }
}

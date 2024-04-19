import java.util.*;
class mathexp {
    public static void main(String args[]){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two num to display mathmetical expression");
        num1=sc.nextInt();
        num2=sc.nextInt();

        System.out.println("sum of numbers is "+(num1+num2));
        System.out.println("sub of numbers is "+(num1-num2));
        System.out.println("Multiply of numbers is "+(num1*num2));
        System.out.println("Divsion of numbers is "+(float) (num1/num2));
        

    }
}

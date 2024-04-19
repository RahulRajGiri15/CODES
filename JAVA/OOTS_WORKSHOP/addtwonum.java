/* 
Enter two num
1
3
sum of two num is 5
 */

import java.util.*;
class addtwonum {
    public static void main(String[] args) {
        int a,b,add;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two num");
         a=sc.nextInt();
         b= sc.nextInt();
        add=a+b;
        System.out.println("sum of two num is "+add);
    }
}

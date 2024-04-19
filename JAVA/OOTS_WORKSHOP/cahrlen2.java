import java.util.*;
class cahrlen2 {
    public static void main(String[] args) {
        int i=0,count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your string ");
        String name=sc.nextLine();
        while(i< name.length())
        {
            if(name.charAt(i) !=' '){
                count++;
            }
            i++;
        }
        System.out.println("total length of string is "+ count);

    }
    
}

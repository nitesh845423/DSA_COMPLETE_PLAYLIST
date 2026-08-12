import java.util.Scanner;
public class IntTOString {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter any Ineteger: ");
       int n=sc.nextInt();
//       String s=" ";
//       s=s+n;
       String s=Integer.toString(n);
       System.out.println(s);
    }

}

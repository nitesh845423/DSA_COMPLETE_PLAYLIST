import java.util.Scanner;
public class inputstring {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter string: ");
      String s1=sc.next();
      System.out.println(s1);

      for (int i = 0; i < s1.length(); i++) {
        System.out.println(s1.charAt(i));
      }
    }
}

import java.util.Scanner;
import java.util.Arrays;
public class lengthofString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1=sc.next();
        System.out.println("Length of String: "+s1.length());
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i)+" ");
        }

        char[] characters = s1.toCharArray();
        Arrays.sort(characters);
        System.out.println("\nSorted String: " + new String(characters));
    }
}

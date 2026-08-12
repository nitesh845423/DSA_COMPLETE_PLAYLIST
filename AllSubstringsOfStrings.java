import java.util.Scanner;
public class AllSubstringsOfStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String: ");
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}

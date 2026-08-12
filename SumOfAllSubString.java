import java.util.Scanner;
public class SumOfAllSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                int number=Integer.parseInt(sub);
                System.out.print(sub+" ");
                sum=sum+number;
            }
        }
        System.out.println("\nSum of all substrings = " +sum);
    }
}

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        System.out.println("Enter any dicimal number:");
        double n1=sc.nextDouble();
        /*int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println("Number of digitin given number is: "+count); */
        String s=""+n;
        String s1=""+n1;
        System.out.println("Digit Of Integer "+s.length());
        System.out.println("Digit of Double: "+s1.length());

    }
}

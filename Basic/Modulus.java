import java.util.Scanner;
public class Modulus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        System.out.print("Enter second number: ");
        int m=sc.nextInt();
        int modulus=n%m;
        System.out.print("Modulus of n and m is: " + modulus);
    }
}

import java.util.Scanner;
public class squareofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        double n=sc.nextDouble();
        double Ans=n*n;
        System.out.println("Square of given num: "+Ans);
    }
}

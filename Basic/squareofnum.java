import java.util.Scanner;
public class squareofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        double Ans=n*n;
        System.out.println("Square of given num: "+Ans);
    }
}

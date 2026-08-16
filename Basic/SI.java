import java.util.Scanner;
public class SI{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number Principal: ");
    double p=sc.nextDouble();
    System.out.println("Enter rae of interest: ");
    Double r=sc.nextDouble();
    System.out.println("Enter time of interest: ");
    double t=sc.nextDouble();
    Double SI=(p*r*t)/100;
    System.out.println("Simple interset is: "+SI);
}
}
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        double pi = Math.PI;
        double area = pi * r * r;

        System.out.println("Area of circle: " + area);

        sc.close();
    }
}

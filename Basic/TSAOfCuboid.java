import java.util.Scanner;

public class TSAOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of cuboid: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of cuboid: ");
        double b = sc.nextDouble();

        System.out.print("Enter height of cuboid: ");
        double h = sc.nextDouble();

        double ans = 2 * (l * b + b * h + l * h);

        System.out.println("Total surface area of cuboid is: " + ans);

        sc.close();
    }
}
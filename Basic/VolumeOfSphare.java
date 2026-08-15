import java.util.Scanner;

public class VolumeOfSphare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of sphere: ");
        int r = sc.nextInt();

        double pi = 22.0 / 7.0;

        double Area = 4 * pi * r * r;
        double Volume = (4.0 / 3.0) * pi * r * r * r;

        System.out.println("Area and Volume of Sphere Respectively: "
                + Area + " " + Volume);
    }
}

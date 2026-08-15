import java.util.Scanner;
public class VolumeOfSphare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        int r=sc.nextInt();
        double pi=22/7;
        Double Area=4*pi*r*r*r;
        Double Volume=4/3*pi*r*r*r;
        System.out.println("Area and Volume of Sphare Respectively: "+Area+" "+Volume);
    }
}

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        //area of circel pi*r*r
        double pi=22/7;
        int r=sc.nextInt();
        double Area=pi*r*r;
        System.out.println("Area of circle: "+Area);
    }
}

import java.util.Scanner;
public class StringToChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String to convert into character array: ");
        String s=sc.next();
        char[]arr=s.toCharArray();
        for(char ch:arr){
            System.out.print(ch+" ");
        }
    }
}

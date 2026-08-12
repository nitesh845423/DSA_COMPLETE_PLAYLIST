import java.util.Scanner;
public class palindromestring {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String: ");
    String s1 = sc.nextLine().trim().toLowerCase();
    boolean isPalindrome = true;

    for(int i = 0, j = s1.length() - 1; i < j; i++, j--){
        if(s1.charAt(i) != s1.charAt(j)){
            isPalindrome = false;
            break;
        }
    }

    if(isPalindrome){
        System.out.println("String is a palindrome.");
    } else {
        System.out.println("String is not a palindrome.");
    }
   } 
}

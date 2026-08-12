import java.util.Scanner;
public class countofvowels {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String s1=sc.nextLine();
    System.out.print("Vowels: ");
    int vowelCount = 0;
    int consonantCount = 0;
    for(int i=0;i<s1.length();i++){
        char originalChar = s1.charAt(i);
        char ch = Character.toLowerCase(originalChar);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.print(originalChar + " ");
            vowelCount++;
        } else if (Character.isLetter(ch)) {
            consonantCount++;
        }
    }

    System.out.print("Consonants: ");
    for (int i = 0; i < s1.length(); i++) {
        char originalChar = s1.charAt(i);
        char ch = Character.toLowerCase(originalChar);
        if (Character.isLetter(ch) && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            System.out.print(originalChar + " ");
        }
    }

    System.out.println("\nCount of vowels: " + vowelCount);
    System.out.println("Count of consonants: " + consonantCount);
   } 
}

import java.util.Scanner;

public class ReverseEachWord {

    // Function to reverse each word in a string
    public static String reverseEachWord(String s) {

        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev += word.charAt(j);
            }

            result += rev;

            if (i != words.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = reverseEachWord(s);

        System.out.println("Reversed Each Word: " + result);

        sc.close();
    }
}
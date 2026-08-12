import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Function to find the first non-repeating character
    public static char getFirstNonRepeatingChar(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Find the first character whose frequency is 1
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }

        // If no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String s = sc.nextLine();

        char result = getFirstNonRepeatingChar(s);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found.");
        }

        sc.close();
    }
}
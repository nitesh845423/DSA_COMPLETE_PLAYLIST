//mathod one bruete force
import java.util.Scanner;

public class MaximumOccurringCharacter {

    // Function to find the maximum occurring character
    public static char getMaxOccuringChar(String s) {

        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);

        for (int i = 0; i < n; i++) {

            int freq = 1;
            char ch = s.charAt(i);

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == ch) {
                    freq++;
                }
            }

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = ch;
            } else if (freq == maxFreq && ch < ans) {
                ans = ch;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char result = getMaxOccuringChar(s);

        System.out.println("Maximum occurring character: " + result);

        sc.close();
    }
}
//second mathod
/*
import java.util.Arrays;
import java.util.Scanner;

public class MaximumOccurringCharacter {

    // Function to find the maximum occurring character
    public static char getMaxOccuringChar(String s) {

        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);

        // Convert string to character array
        char[] arr = s.toCharArray();

        // Sort the character array
        Arrays.sort(arr);

        int i = 0;
        int j = 0;

        while (j < n) {

            if (arr[i] == arr[j]) {
                j++;
            } else {

                int freq = j - i;

                if (freq > maxFreq) {
                    maxFreq = freq;
                    ans = arr[i];
                }

                i = j;
            }
        }

        // Check the frequency of the last group
        int freq = j - i;

        if (freq > maxFreq) {
            maxFreq = freq;
            ans = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char result = getMaxOccuringChar(s);

        System.out.println("Maximum occurring character: " + result);

        sc.close();
    }
}
 */
/*
mathod 3
import java.util.Scanner;

public class MaximumOccurringCharacter {

    // Function to find the maximum occurring character
    public static char getMaxOccuringChar(String s) {

        int n = s.length();

        // Frequency array for a-z
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            int index = ch - 'a';

            freq[index]++;
        }

        int maxFreq = 0;
        char ans = s.charAt(0);

        // Find character with maximum frequency
        for (int i = 0; i < 26; i++) {

            if (freq[i] > maxFreq) {

                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String s = sc.nextLine();

        char result = getMaxOccuringChar(s);

        System.out.println("Maximum occurring character: " + result);

        sc.close();
    }
}
 */
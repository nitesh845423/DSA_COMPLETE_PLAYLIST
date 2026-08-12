import java.util.Scanner;

public class StringCompression {

    // Function to compress the string
    public static String compressString(String s) {

        String ans = "";

        int i = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);
            int j = i;

            // Sliding Window
            while (j < s.length() && s.charAt(j) == ch) {
                j++;
            }

            int count = j - i;

            ans += ch;

            if (count > 1) {
                ans += count;
            }

            i = j;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = compressString(s);

        System.out.println("Compressed String: " + result);

        sc.close();
    }
}
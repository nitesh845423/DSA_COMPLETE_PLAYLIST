public class CompareToStrings {

    // Lexicographical order means dictionary order.
    // Java compares characters from left to right.
    // At the first different character, it subtracts their Unicode values.
    // Example: "Harmeet" and "Harsha"
    // H, a and r are the same. Then 'm' (109) - 's' (115) = -6.
    // Therefore, "Harmeet" comes before "Harsha".
    // If one string is a prefix of another, the shorter string comes first.
    // Example: "Java" comes before "JavaScript".

    // compareTo() result:
    // 0  -> both strings are equal
    // <0 -> first string comes before the second string
    // >0 -> first string comes after the second string
    public static void compareStrings(String s1, String s2) {
        int result = s1.compareTo(s2);

        System.out.println("compareTo() result: " + result);

        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\".");
        } else {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\".");
        }
    }

    public static void main(String[] args) {
        String a = "Harneet";
        String b = "Harsha";

        System.out.println("First String: " + a);
        System.out.println("Second String: " + b);
        compareStrings(a, b);
    }
}

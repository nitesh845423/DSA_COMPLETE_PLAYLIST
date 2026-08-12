public class StringMethodsDemo {

    public static void main(String[] args) {

        // Original String. Example: spaces are intentionally included here.
        String name = "  Nitesh Kumar Pandey  ";

        // --------------------------------------------------
        // length()
        // Returns the total number of characters
        // (including spaces).
        // Example: "Java".length() returns 4.
        // --------------------------------------------------
        System.out.println("Length: " + name.length());

        // --------------------------------------------------
        // trim()
        // Removes leading and trailing spaces.
        // Does not remove spaces between words.
        // Example: "  Java  ".trim() returns "Java".
        // --------------------------------------------------
        System.out.println("Trim: '" + name.trim() + "'");

        // --------------------------------------------------
        // toUpperCase()
        // Converts all characters into uppercase.
        // Example: "Java".toUpperCase() returns "JAVA".
        // --------------------------------------------------
        System.out.println("Upper Case: " + name.toUpperCase());

        // --------------------------------------------------
        // toLowerCase()
        // Converts all characters into lowercase.
        // Example: "JAVA".toLowerCase() returns "java".
        // --------------------------------------------------
        System.out.println("Lower Case: " + name.toLowerCase());

        // --------------------------------------------------
        // charAt(index)
        // Returns the character at the given index.
        // Index starts from 0.
        // Example: "Java".charAt(1) returns 'a'.
        // --------------------------------------------------
        System.out.println("Character at index 3: " + name.charAt(3));

        // --------------------------------------------------
        // substring(beginIndex)
        // Returns characters from beginIndex to the end.
        // Example: "Java".substring(2) returns "va".
        // --------------------------------------------------
        System.out.println("Substring from index 2: " + name.substring(2));

        // --------------------------------------------------
        // substring(beginIndex, endIndex)
        // Returns characters from beginIndex to endIndex-1.
        // Example: "Java".substring(1, 3) returns "av".
        // --------------------------------------------------
        System.out.println("Substring(2,8): " + name.substring(2, 8));

        // --------------------------------------------------
        // contains()
        // Checks whether the String contains
        // the specified sequence of characters.
        // Returns true or false.
        // Example: "Java".contains("av") returns true.
        // --------------------------------------------------
        System.out.println("Contains 'Kumar': " + name.contains("Kumar"));

        // --------------------------------------------------
        // startsWith()
        // Checks whether the String starts
        // with the given prefix.
        // Example: "Java".startsWith("Ja") returns true.
        // --------------------------------------------------
        System.out.println("Starts with '  Ni': " + name.startsWith("  Ni"));

        // --------------------------------------------------
        // endsWith()
        // Checks whether the String ends
        // with the given suffix.
        // Example: "Java".endsWith("va") returns true.
        // --------------------------------------------------
        System.out.println("Ends with 'ey  ': " + name.endsWith("ey  "));

        // --------------------------------------------------
        // equals()
        // Compares two Strings by value.
        // Returns true if contents are same.
        // Example: "Java".equals("Java") returns true.
        // --------------------------------------------------
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("equals(): " + s1.equals(s2));

        // --------------------------------------------------
        // equalsIgnoreCase()
        // Compares Strings ignoring uppercase/lowercase.
        // Example: "JAVA".equalsIgnoreCase("java") returns true.
        // --------------------------------------------------
        System.out.println("equalsIgnoreCase(): " +
                "JAVA".equalsIgnoreCase("java"));

        // --------------------------------------------------
        // compareTo()
        // Lexicographically compares two Strings.
        // Returns:
        // 0  -> equal
        // <0 -> first String is smaller
        // >0 -> first String is greater
        // Example: "Apple".compareTo("Banana") returns a negative value.
        // --------------------------------------------------
        System.out.println("compareTo(): " + "Apple".compareTo("Banana"));

        // --------------------------------------------------
        // replace(oldChar, newChar)
        // Replaces all occurrences of a character.
        // Example: "Java".replace('a', '@') returns "J@v@".
        // --------------------------------------------------
        System.out.println("Replace a with @: " +
                "Java".replace('a', '@'));

        // --------------------------------------------------
        // replace(oldString, newString)
        // Replaces one word/String with another.
        // Example: "Hello Java".replace("Java", "World") returns "Hello World".
        // --------------------------------------------------
        System.out.println("Replace Kumar with Singh: " +
                name.replace("Kumar", "Singh"));

        // --------------------------------------------------
        // indexOf()
        // Returns the index of the first occurrence.
        // Returns -1 if not found.
        // Example: "Java".indexOf('a') returns 1.
        // --------------------------------------------------
        System.out.println("Index of Kumar: " +
                name.indexOf("Kumar"));

        // --------------------------------------------------
        // lastIndexOf()
        // Returns the last occurrence of the character/String.
        // Example: "Java".lastIndexOf('a') returns 3.
        // --------------------------------------------------
        System.out.println("Last index of a: " +
                "Java Programming".lastIndexOf('a'));

        // --------------------------------------------------
        // isEmpty()
        // Returns true if String length is 0.
        // Example: "".isEmpty() returns true.
        // --------------------------------------------------
        String empty = "";
        System.out.println("isEmpty(): " + empty.isEmpty());

        // --------------------------------------------------
        // Java 8 equivalent of isBlank()
        // trim() removes outer spaces, then isEmpty() checks it.
        // Example: "   ".trim().isEmpty() returns true.
        // --------------------------------------------------
        String blank = "    ";
        System.out.println("isBlank(): " + blank.trim().isEmpty());

        // --------------------------------------------------
        // concat()
        // Joins two Strings.
        // Example: "Hello ".concat("World") returns "Hello World".
        // --------------------------------------------------
        System.out.println("Concat: " +
                "Hello ".concat("World"));

        // --------------------------------------------------
        // split()
        // Splits the String into an array.
        // Example: "red,blue".split(",") gives ["red", "blue"].
        // --------------------------------------------------
        String sentence = "Java Python C++";
        String[] languages = sentence.split(" ");

        System.out.println("Split Result:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // --------------------------------------------------
        // valueOf()
        // Converts other data types into String.
        // Example: String.valueOf(100) returns "100".
        // --------------------------------------------------
        int number = 100;
        String strNumber = String.valueOf(number);
        System.out.println("String value: " + strNumber);

        // --------------------------------------------------
        // toCharArray()
        // Converts String into a character array.
        // Example: "Java".toCharArray() gives {'J', 'a', 'v', 'a'}.
        // --------------------------------------------------
        char[] letters = "Java".toCharArray();

        System.out.print("Character Array: ");
        for (char ch : letters) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Java 8 equivalent of repeat()
        // Repeats the String three times using StringBuilder.
        // Example: "Hi " repeated 3 times gives "Hi Hi Hi ".
        // --------------------------------------------------
        StringBuilder repeatedText = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            repeatedText.append("Hi ");
        }
        System.out.println("Repeat: " + repeatedText);

        // --------------------------------------------------
        // String.format()
        // Creates a formatted String.
        // Similar to printf().
        // Example: String.format("Age: %d", 22) returns "Age: 22".
        // --------------------------------------------------
        String result = String.format(
                "Name: %s, Age: %d",
                "Nitesh", 22);

        System.out.println(result);
    }
}

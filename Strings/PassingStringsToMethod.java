public class PassingStringsToMethod {

    /*
     * Java always uses PASS BY VALUE.
     *
     * For primitive data types (int, float, char, etc.):
     * - A copy of the actual value is passed to the method.
     * - Any modification inside the method affects only the copy.
     * - The original variable remains unchanged.
     */
    public static void changeNumber(int number) {
        number = 100; // Changes only the local copy
        System.out.println("Inside changeNumber: " + number);
    }

    /*
     * String is an object, but it is IMMUTABLE.
     *
     * Java passes a COPY of the reference (address) of the String.
     * Both the original variable and parameter initially point
     * to the same String object.
     *
     * When we write:
     *      s = "Daisy";
     * we are NOT modifying the original String object.
     * Instead, the local reference 's' starts pointing to a new
     * String object.
     *
     * Therefore, the original String variable remains unchanged.
     */
    public static void changeString(String s) {
        s = "Daisy"; // Only local reference changes
        System.out.println("Inside changeString: " + s);
    }

    /*
     * StringBuilder is a MUTABLE object.
     *
     * Java still passes a COPY of the object reference.
     * Both references point to the SAME StringBuilder object.
     *
     * Since StringBuilder is mutable, calling append()
     * modifies the original object itself.
     *
     * Therefore, the change is visible even after
     * the method returns.
     */
    public static void changeObject(StringBuilder name) {
        name.append(" Kumar"); // Modifies the original object
        System.out.println("Inside changeObject: " + name);
    }

    public static void main(String[] args) {

        // ---------------- Primitive Example ----------------
        int marks = 50;

        System.out.println("Before changeNumber: " + marks);

        // A copy of marks (50) is passed.
        // Original variable is NOT affected.
        changeNumber(marks);

        System.out.println("After changeNumber: " + marks);


        // ---------------- String Example ----------------
        String s1 = "Nitesh";

        System.out.println("\nBefore changeString: " + s1);

        // A copy of the String reference is passed.
        // Since String is immutable, assigning a new String
        // affects only the local reference.
        changeString(s1);

        System.out.println("After changeString: " + s1);


        // ---------------- Mutable Object Example ----------------
        StringBuilder name = new StringBuilder("Nitesh");

        System.out.println("\nBefore changeObject: " + name);

        // A copy of the object reference is passed.
        // Both references point to the same StringBuilder object.
        // append() modifies the original object.
        changeObject(name);

        System.out.println("After changeObject: " + name);
    }
}

/*
==================== OUTPUT ====================

Before changeNumber: 50
Inside changeNumber: 100
After changeNumber: 50

Before changeString: Nitesh
Inside changeString: Daisy
After changeString: Nitesh

Before changeObject: Nitesh
Inside changeObject: Nitesh Kumar
After changeObject: Nitesh Kumar

=================================================

Important Rule to Remember:

1. Primitive Types (int, double, char, boolean...)
   ✔ Pass by Value
   ✔ Original value cannot be changed.

2. String
   ✔ Pass by Value (copy of reference)
   ✔ String is Immutable.
   ✔ Reassigning creates a new object.
   ✔ Original String remains unchanged.

3. Mutable Objects (StringBuilder, ArrayList, etc.)
   ✔ Pass by Value (copy of reference)
   ✔ Both references point to the same object.
   ✔ Modifying the object changes the original object.
*/
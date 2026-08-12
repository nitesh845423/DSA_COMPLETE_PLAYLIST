public class immutable {
    public static void main(String[] args) {
        // String immutable hoti hai: object banne ke baad uska content change nahi hota.
        String s = "Raghav";
        System.out.println(s);

        // concat() purane String ko modify nahi karta; yeh ek naya String object return karta hai.
        String updatedName = s.concat(" Madhav");

        // Original String ab bhi wahi hai.
        System.out.println("Original string: " + s);
        System.out.println("New string: " + updatedName);

        /*
         * Reason: Java String immutable hai, isliye text data safe rehta hai,
         * String pool ko efficiently reuse kiya ja sakta hai, aur multithreading
         * mein same String ko bina change ke safely use kiya ja sakta hai.
         */
    }
}

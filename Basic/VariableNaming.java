public class VariableNaming {
    public static void main(String[] args) {
        // Java Variable Naming Rules

// 1. Variable name letter, underscore (_) ya dollar sign ($) se start hona chahiye.
//    Example: int age;  int _count;  int $price;

// 2. Variable name number se start nahi ho sakta.
//    Wrong: int 1age;

// 3. Variable name me spaces allowed nahi hote.
//    Wrong: int student name;

// 4. Variable name me special characters allowed nahi hote,
//    sirf underscore (_) aur dollar sign ($) allowed hain.
//    Wrong: int student-name;

// 5. Java case-sensitive hai.
//    age, Age aur AGE teen alag variables hain.

// 6. Variable name meaningful hona chahiye.
//    Good: int studentAge;
//    Bad:  int a;

// 7. Java me variables ke liye camelCase use karte hain.
//    Example: int totalSurfaceArea;
//    Example: double circleRadius;

// 8. Java keywords ko variable name nahi bana sakte.
//    Wrong: int class;
//    Wrong: int public;

// 9. Constant variable ke liye CAPITAL_LETTERS_WITH_UNDERSCORE use karte hain.
//    Example: final double PI = 3.14159;

// Example variables:
int studentAge = 18;
double totalSurfaceArea = 250.5;
String studentName = "Daisy";
final double PI = 3.14159;
    }
}

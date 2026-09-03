
public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical operators
        System.out.println("a > 5 && b < 10: " + (a > 5 && b < 10));
        System.out.println("a > 15 || b < 10: " + (a > 15 || b < 10));

        // Assignment operator
        a += 5;
        System.out.println("a after a += 5: " + a);
    }
}

public class TypeCasting {
    public static void main(String[] args) {

        // Widening type casting
        int a = 10;
        double b = a;

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);

        // Narrowing type casting
        double x = 10.5;
        int y = (int) x;

        System.out.println("Double: " + x);
        System.out.println("Integer: " + y);
    }
}
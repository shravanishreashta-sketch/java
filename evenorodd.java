public class evenorodd {
    public static void main(String[] args) {
        int number = 21;
        System.out.println("Starting number: " + number);

        // Repeat until the number becomes 1
        while (number != 1) {
            if (number % 2 == 0) {
                // If even, divide by 2
                number = number / 2;
            } else {
                // If odd, multiply by 3 and add 1
                number = (number * 3) + 1;
            }
            System.out.println("-> " + number);
        }
    }
}



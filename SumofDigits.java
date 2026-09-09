public class SumofDigits {
    public static void main(String[] args) {
        int number = 7584;
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Extract the last digit and add to sum(remainder is 4 for first iteration)
            number /= 10;       // Remove the last digit
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
    
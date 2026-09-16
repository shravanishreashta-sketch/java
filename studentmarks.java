import java.util.Scanner;

public class studentmarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String topperName = "";

        int age;
        int mark1, mark2, mark3, mark4, mark5;
        int total;
        double average;

        int highestTotal = -1;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\n===== Student " + i + " =====");

            System.out.print("Enter name: ");
            name = sc.next();

            System.out.print("Enter age: ");
            age = sc.nextInt();

            System.out.print("Enter Subject 1 marks: ");
            mark1 = sc.nextInt();

            System.out.print("Enter Subject 2 marks: ");
            mark2 = sc.nextInt();

            System.out.print("Enter Subject 3 marks: ");
            mark3 = sc.nextInt();

            System.out.print("Enter Subject 4 marks: ");
            mark4 = sc.nextInt();

            System.out.print("Enter Subject 5 marks: ");
            mark5 = sc.nextInt();

            // Calculate total
            total = mark1 + mark2 + mark3 + mark4 + mark5;

            // Calculate average
            average = total / 5.0;

            // Display each student's result
            System.out.println("\n--- Student Result ---");
            System.out.println("Name    : " + name);
            System.out.println("Age     : " + age);
            System.out.println("Total   : " + total);
            System.out.println("Average : " + average);

            // Find topper
            if (total > highestTotal) {
                highestTotal = total;
                topperName = name;
            }
        }

        // Display topper after all 5 students
        System.out.println("\n==========================");
        System.out.println("     CLASS TOPPER");
        System.out.println("==========================");
        System.out.println("Name  : " + topperName);
        System.out.println("Total : " + highestTotal);

        sc.close();
    }
}
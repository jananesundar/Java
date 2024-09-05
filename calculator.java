import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    double difference = num1 - num2;
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    double product = num1 * num2;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    if (num2 != 0) {
                        double quotient = num1 / num2;
                        System.out.println("Result: " + quotient);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        }

        System.out.println("Calculator exited. Goodbye!");
    }
}
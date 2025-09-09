import java.util.Scanner;

/**
 * A simple console-based Java program that adds two decimals entered by the user.
 * Demonstrates basic input/output operations and method usage.
 * <p>
 * This program prompts the user to enter two decimals, displays them,
 * calculates their sum using a separate method, and prints the result.
 * </p>
 */
public class AdditionOfTwoDoubles {

    /**
     * Default constructor for {@code AdditionOfTwoDoubles}.
     * This constructor is not used directly since all methods are static,
     * but is defined to satisfy Javadoc completeness.
     */
    public AdditionOfTwoDoubles() {
        // No initialization required
    }

    /**
     * Entry point of the program.
     * Handles user interaction and delegates addition logic to the {@code add} method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
        double firstNumber;
        double secondNumber;
        
        System.out.println("Hi, let's add up two numbers!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        
        // input = scanner.next().replace(",", ".");
        // firstNumber = Double.parseDouble(input);
        firstNumber = readDouble(scanner);
        
        System.out.println("First Number: " + firstNumber);

        System.out.print("Enter the second number: ");
        
        // input = scanner.next().replace(",", ".");
        // secondNumber = Double.parseDouble(input);
        secondNumber = readDouble(scanner);
        
        System.out.println("Second Number: " + secondNumber);

        System.out.println("Adding two numbers together...");
        
        double result = add(firstNumber, secondNumber);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
    /**
     * Reads a valid double from the console input.
     *
     * @param scanner the Scanner object for input
     * @return a valid double entered by the user
     */
    public static double readDouble(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().replace(",", ".");
            // String input = scanner.next().replace(",", ".");
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                // e.printStackTrace(); // Выводит стек вызовов
                System.out.println("Invalid input");
                System.out.print("Please enter a valid decimal number: ");
            }
            /*
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input");
                System.out.print("Please enter a valid decimal number: ");
                scanner.next(); // discard invalid token
            }
            */
        }
    }
    
    /**
     * Adds two decimals and returns the result.
     *
     * @param a the first double
     * @param b the second double
     * @return the sum of {@code a} and {@code b}
     */
    public static double add(double a, double b) {
        return a + b;
    }
}

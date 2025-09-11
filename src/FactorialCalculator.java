import java.util.Scanner;     
public class FactorialCalculator {

    public static void main(String[] args) {
        int number;
        int i = 1;
        long factorial = 1;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("FactorialCalculator");
        System.out.print("Enter a positive integer from 0 to 20: ");
        number = readInt(scanner);
        System.out.println("The number is: " + number);

        if (number < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
            scanner.close();
            return;
        }

        if (number == 0) {
            System.out.println("The factorial of 0 is: 1");
            scanner.close();
            return;
        }

        if (number > 20) {
            System.out.println("Factorial too large for long type. Please enter a number <= 20.");
            scanner.close();
            return;
        }

        while (i <= number) {
            factorial = factorial * i;
            // System.out.println("The factorial of " + i + " is: " + factorial
            System.out.printf("%2d! = %d%n", i, factorial);
            i++;
        }

        // System.out.println("The factorial is: " + factorial);
        scanner.close();
    }

    public static int readInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input");
                System.out.print("Please enter a whole number: ");
                scanner.next(); // discard invalid token
            }
        }
    }

}
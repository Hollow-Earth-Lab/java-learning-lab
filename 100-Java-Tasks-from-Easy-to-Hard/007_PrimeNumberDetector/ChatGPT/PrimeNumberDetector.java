import java.util.Scanner;

public class PrimeNumberDetector {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hi, this is a prime number detector!");
            System.out.print("Enter a positive integer (2 - 2147483647): ");

            int number = readInt(scanner);

            if (isPrime(number)) {
                System.out.println(number + " is a prime number!");
            } else {
                System.out.println(number + " is not a prime number!");
            }
        }
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

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;

        int limit = (int)Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

import java.util.Scanner;

public class PrimeNumberDetector {

    public static void main(String[] args) {

        int number;
        int i = 3;
        int limit;

        Scanner scanner = new Scanner(System.in); 

        System.out.println();
        System.out.println("Hi, this is a prime number detector!");
        // System.out.print("Enter a positive integer from 2 to 2 147 483 647: ");
        System.out.print("Enter a positive integer (2 - 2147483647):");
        number = readInt(scanner);
        System.out.println();
        // System.out.println("The number is: " + number);

        if (number < 0) {
            System.out.println("You have entered a negative number!");
            System.out.println("Negative numbers are not considered prime!");
            scanner.close();
            return;
        }

        if (number == 0) {
            System.out.println("0 is not a prime or composite number!");
            scanner.close();
            return;
        }

        if (number == 1) {
            System.out.println("1 is not a prime or composite number!");
            scanner.close();
            return;
        }

        if (number == 2) {
            System.out.println("2 is a prime number!");
            scanner.close();
            return;
        }

        if (number == 3) {
            System.out.println("3 is a prime number!");
            scanner.close();
            return;
        }

        if (number % 2 == 0) {
            System.out.println(number+"/2="+(number/2));
            System.out.println(number + " is not a prime number!");
            scanner.close();
            return;
        }

        limit = (int)Math.sqrt(number);
        // System.out.println("The number is:    " + number);

        while (i <= limit) {
            
            // System.out.println("The " + number + "/" + i + " is " + number/i);
            System.out.println("Checking divisor: " + i);
            
            if (number % i == 0) {
                System.out.println();
                System.out.println(number+"/"+i+"="+(number/i));
                System.out.println();
                System.out.println(number + " is not a prime number!");
                System.out.println();
                System.out.println("Limit is          " + limit);
                System.out.println("Limit^2 is:       " + (limit * limit));
                System.out.println("The number is:    " + number);
                // System.out.println("(Limit + 1)^2 is: " + ((limit + 1) * (limit + 1)));

                scanner.close();
                return;
            }
            i = i + 2;
        }

        System.out.println();
        System.out.println(number + " is a prime number!");
        System.out.println();
        System.out.println("Limit is          " + limit);
        System.out.println("Limit^2 is:       " + (limit * limit));
        System.out.println("The number is:    " + number);
        // System.out.println("(Limit + 1)^2 is: " + ((limit + 1) * (limit + 1)));

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

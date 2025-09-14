import java.util.Scanner;

public class DigitSumCalculator {

    public static void main(String[] args) {

        int number;
        // int i = 1;
        int digitSum = 0;
        String text;

        Scanner scanner = new Scanner(System.in); 

        System.out.println();
        System.out.println("Hi, this is the DigitSumCalculator");

        System.out.print("Enter an integer from - 2 147 483 648 to 2 147 483 647: ");
        number = readInt(scanner);
        System.out.println();
        System.out.println("You have entered a number: " + number);
        System.out.println();

        // text = String.valueOf(number);
        text = String.valueOf(Math.abs(number)); // убираем знак

        System.out.println("String.valueOf(Math.abs(number)) = " + (String.valueOf(Math.abs(number))));

        System.out.println("You have String: " + text);
        System.out.println();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println("Character #" + i + ": " + c);
            digitSum = digitSum + Character.getNumericValue(c);
        }

        // Hack: compensate -1 from the '-' character in the case of Integer.MIN_VALUE
        if (number == Integer.MIN_VALUE) {
            digitSum += 1;
        }

        System.out.println();
        System.out.println("You have digitSum: " + digitSum);

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

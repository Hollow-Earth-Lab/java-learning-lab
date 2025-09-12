import java.util.Locale;
import java.util.Scanner;

public class CheckingTheParity {
    
    
    public CheckingTheParity() {
        // No initialization required
    }

    public static void main(String[] args){
        
        // Locale.setDefault(new Locale("ru", "RU")); // Setting the locale before everything else
        Locale.setDefault(Locale.forLanguageTag("ru-RU"));
        
        int number;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Привет!");
        System.out.println("Let's check the integer for parity!");
        System.out.println("An even number is an integer that is divisible by 2 without remainder.");
        System.out.print("Enter the whole number: ");
        number = readInt(scanner);
        // System.out.println("The number is: " + number);
        
        if (number%2==0) {
            System.out.println("The number " + number +" is even!");
        } else {
            System.out.println("The number " + number +" is odd!");
        }
        scanner.close();
    }

    /**
     * Reads a valid integer from the console input.
     *
     * @param scanner the Scanner object for input
     * @return a valid integer entered by the user
     */
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
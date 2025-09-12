import java.util.Scanner;

public class MaximumOfTwoNumbers {
    public static void main(String[] args){
        
        double firstNumber;
        double secondNumber;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hi! Let's find the maximum of two numbers!");
        
        System.out.print("Enter the first number: ");
        firstNumber = readDouble(scanner);
        System.out.println("First Number: " + firstNumber);
        
        System.out.print("Enter the second number: ");
        secondNumber = readDouble(scanner);
        System.out.println("Second Number: " + secondNumber);
        
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second.");
        }
        if (firstNumber < secondNumber) {
            System.out.println("The first number is less than the second.");
        }
        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal.");
        }
        double max = Math.max(firstNumber, secondNumber);
        System.out.println("Maximum value: " + max);
        
        scanner.close();
    }
    
    public static double readDouble(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().replace(",", ".");
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Invalid input");
                System.out.print("Please enter a valid decimal number: ");
            }
        }
    }
}

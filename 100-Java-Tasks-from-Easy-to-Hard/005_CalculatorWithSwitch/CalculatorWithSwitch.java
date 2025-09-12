import java.util.Scanner;

public class CalculatorWithSwitch {
    
    public static void main(String args[]){
        System.out.println("Calculator with 'switch'");
        
        double firstNumber;
        double secondNumber;
        double result;
        
        String typeOfOperation;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        firstNumber = readDouble(scanner);
        System.out.println("First Number: " + firstNumber);
        
        System.out.print("Enter the second number: ");
        secondNumber = readDouble(scanner);
        System.out.println("Second Number: " + secondNumber);
        
        System.out.print("Enter the type of operation +, -, *, /, % or ^: ");
        typeOfOperation = scanner.nextLine();
        System.out.println("Type of operation: " + typeOfOperation);
        
        switch (typeOfOperation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            case "%":
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = firstNumber % secondNumber;
                break;
            case "^":
                result = Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Unknown operation.");
                return;
        }
        System.out.println("Result: " + result);
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

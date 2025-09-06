// Оцени, пожалуйста, готовый код:

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {
        
        int firstNumber;
        int secondNumber;

        System.out.println("Hi, let's add up two numbers!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("First Number: " + firstNumber);

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
        System.out.println("Second Number: " + secondNumber);

        System.out.println("Adding two numbers together...");
        
        int result = add(firstNumber, secondNumber);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
}

//    Настроил пробелы вместо табов. Оцени код, пожалуйста!


public class AdditionOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println("Adding two numbers together");
        
        int firstNumber = 1;
        System.out.println("First Number: " + firstNumber);
        
        int secondNumber = 2;
        System.out.println("Second Number: " + secondNumber);
        
        int result = add(firstNumber, secondNumber);
        System.out.println("Result: " + result);
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
}

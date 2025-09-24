import java.util.Scanner;

public class DecimalToBinary {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int decimalNumber;

        System.out.println("Loading DecimalToBinary class...");

        do {
            String decimalNumberStr = readLineFromConsole("Введите 1, 2 или 3: ");
            if (isInteger(decimalNumberStr)) {
                decimalNumber = Integer.parseInt(decimalNumberStr);
                if (decimalNumber >= 0) {
                    break;
                }
                else {
                    System.out.println("ОШИБКА: Введите число >= 0...");
                }
            } else {
                System.out.println("ОШИБКА: Вы ввели не число!");
            }
        } while (true);
        
        System.out.println("Вы ввели: " + decimalNumber);
    }

    public static String readLineFromConsole(String prompt) {
        // Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
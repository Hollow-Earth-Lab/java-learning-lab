import java.util.Scanner;

public class DecimalToBinary {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int decimalNumber = 0;
        int quotient = 0;
        int remainder = 0;

        String reversedBinaryNumberStr = ""; // Объявляем пустую строку
        StringBuilder reversedBinaryNumberSB = new StringBuilder();

        String binaryNumberStr = "";

        System.out.println("Loading DecimalToBinary class...");

        do {
            String decimalNumberStr = readLineFromConsole("Введите число от 0 до "+ Integer.MAX_VALUE +": ");
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

        do {
            remainder = decimalNumber % 2;
            quotient = decimalNumber / 2;
            // System.out.println(quotient);
            System.out.println(remainder);
            reversedBinaryNumberStr = reversedBinaryNumberStr + remainder;
            reversedBinaryNumberSB.append(remainder);
            decimalNumber = quotient;
        } while (quotient > 0);

        System.out.println("Двоичное число 'задом наперёд': " + reversedBinaryNumberStr);
        /*
        for (int i = reversedBinaryNumberStr.length() - 1; i >= 0; i--) {
            binaryNumberStr += reversedBinaryNumberStr.charAt(i);
        }
        */

        // binaryNumberStr = new StringBuilder(reversedBinaryNumberStr).reverse().toString();
        binaryNumberStr = reversedBinaryNumberSB.reverse().toString();

        System.out.println("'Готовое' двоичное число:       " + binaryNumberStr);

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
    /*
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    */

}

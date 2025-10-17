import java.util.Scanner;

public class ArrayDeduplicator {

    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Loading class ArrayDeduplicator...");

        String input;
        int arraySize = 0;
        int[] numbers;
        int[] tempNumbers;
        int[] resultNumbers;

        while (true) {
            input = readLineFromConsole("Введите число элементов массива (минимум два): ");
            // System.out.println("Вы ввели: " + input);
            if (isInteger(input)) {
                if (Integer.parseInt(input) > 1) {
                    arraySize = Integer.parseInt(input);
                    break;
                }
            } else {
                System.out.println("ОШИБКА: Вы ввели не число!");
            }
        }

        System.out.println("Число элементов массива: "+ arraySize);
        numbers = new int[arraySize];
        tempNumbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // System.out.println();

        tempNumbers[0] = numbers[0];

        if (numbers[1] != numbers[0]) {
            tempNumbers[1] = numbers[1];
        }
        

        /*
        for (int i = 0; i < arraySize; i++) {
            // numbers[i] = (int) (Math.random() * 100);
            System.out.println("i = " + tempNumbers[i]);
        }
        */

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

}
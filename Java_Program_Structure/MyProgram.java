// Импорт нужных классов
import java.util.Scanner;

public class MyProgram {

    // Константы и глобальные переменные
    static final int MAX_LIMIT = 1024;
    static final Scanner scanner = new Scanner(System.in);

    // Точка входа
    public static void main(String[] args) {
        printWelcomeMessage();
        int input = readInt("Введите число: ");
        boolean result = processInput(input);
        printResult(result);
        scanner.close();
    }

    // Метод: вывод приветствия
    public static void printWelcomeMessage() {
        System.out.println("Добро пожаловать в MyProgram!");
    }

    // Метод: чтение целого числа с консоли
    public static int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    // Метод: обработка входных данных
    public static boolean processInput(int value) {
        return value > 0 && value < MAX_LIMIT;
    }

    // Метод: вывод результата
    public static void printResult(boolean isValid) {
        if (isValid) {
            System.out.println("Ввод корректен.");
        } else {
            System.out.println("Ошибка: число вне допустимого диапазона.");
        }
    }
}

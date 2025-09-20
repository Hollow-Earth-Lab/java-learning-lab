import java.util.Scanner;

public class PalindromeChecker {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Загружается Java-класс PalindromeChecker...");
        System.out.println();
        System.out.println("Давайте проверим - является ли введённая вами строка палиндромом!");

        String originalString;
        String cleanedString;
        String reversedString;

        originalString = readLineFromConsole("Введите строку:      ");
        //System.out.println("Вы ввели:            " + originalString);
        System.out.println();

        cleanedString = originalString.replaceAll("[^а-яА-Яa-zA-Z0-9]", "").toLowerCase();
        System.out.println("Очищенная строка:    " + cleanedString);

        reversedString = new StringBuilder(cleanedString).reverse().toString();
        System.out.println("Перевёрнутая строка: " + reversedString);

        System.out.println();

        if (cleanedString.equals(reversedString)) {
            System.out.println("Введённая строка является палиндромом!");
        } else {
            System.out.println("Введённая строка НЕ является палиндромом!");
        }

        scanner.close();
    }

    public static String readLineFromConsole(String prompt) {
        // Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(prompt);
        return scanner.nextLine();
    }
}

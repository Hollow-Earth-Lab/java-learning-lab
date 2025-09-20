import java.util.Scanner;

public class ConsoleInputTemplate {
    public static void main(String[] args) {
        String input = readLineFromConsole("Введите строку: ");
        System.out.println("Вы ввели: " + input);
    }

    public static String readLineFromConsole(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(prompt);
        return scanner.nextLine();
    }
}

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.println();
        System.out.println("Вы ввели: " + input);
    }
}

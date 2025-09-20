import java.util.Scanner;
import java.io.PrintStream;

public class ConsoleInput {
    public static void main(String[] args){
        System.out.println("Loading class ConsoleInput...");

        String input;
        
        Scanner scanner = new Scanner(System.in);

        // System.setOut(new PrintStream(System.out, true, "UTF-8"));

        System.out.println("Введите строку!");

        input = scanner.nextLine();

        System.out.println("Вы ввели: " + input);
    }
}


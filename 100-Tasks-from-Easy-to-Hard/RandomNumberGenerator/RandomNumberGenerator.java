import java.util.Scanner;

public class RandomNumberGenerator {

    static final int MIN_LIMIT = 0;
    static final int MAX_LIMIT = 1024;
    static final int MIN_VALID_QUANTITY = 1;

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Загружается Java-класс RandomNumberGenerator...");
        System.out.println();
        System.out.println("Давайте сгенерируем случайные числа в указанном вами диапазоне!");

        String input;
        int quantityOfNumbers = MIN_LIMIT;
        int minNumber = MIN_LIMIT;
        int maxNumber = MAX_LIMIT;
        int randomNumber;

        do {
            input = readLineFromConsole("Введите количество потребных чисел (1 - 1024): ");
            try {
                quantityOfNumbers = Integer.parseInt(input);
                System.out.println("Вы ввели: " + quantityOfNumbers);
                if (quantityOfNumbers < MIN_VALID_QUANTITY) {
                    System.out.println("ОШИБКА! Количество чисел должно быть 1 или больше...");
                }
                if (quantityOfNumbers > MAX_LIMIT) {
                    System.out.println("ОШИБКА! Количество чисел должно быть 1024 или меньше...");
                }
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА! Введена нечисловая строка...");
            }
            
        } while (quantityOfNumbers < MIN_VALID_QUANTITY || quantityOfNumbers > MAX_LIMIT);

        do {
            input = readLineFromConsole("Введите нижнюю границу диапазона чисел: ");
            try {
                minNumber = Integer.parseInt(input);
                System.out.println("Вы ввели: " + minNumber);
                if (minNumber < MIN_VALID_QUANTITY) {
                    System.out.println("ОШИБКА! Нижняя граница должна быть 1 или больше...");
                }
                if (minNumber > MAX_LIMIT) {
                    System.out.println("ОШИБКА! Нижняя граница должна быть 1024 или меньше...");
                }
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА! Введена нечисловая строка...");
            }
            
        } while (minNumber < MIN_VALID_QUANTITY || minNumber > MAX_LIMIT);

        do {
            input = readLineFromConsole("Введите верхнюю границу диапазона чисел: ");
            try {
                maxNumber = Integer.parseInt(input);
                System.out.println("Вы ввели: " + maxNumber);
                if (maxNumber < MIN_VALID_QUANTITY) {
                    System.out.println("ОШИБКА! Верхняя граница должна быть 1 или больше...");
                }
                if (maxNumber > MAX_LIMIT) {
                    System.out.println("ОШИБКА! Верхняя граница должна быть 1024 или меньше...");
                }
                if (maxNumber <= minNumber) {
                    System.out.println("ОШИБКА! Верхняя граница должна быть больше нижней...");
                }
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА! Введена нечисловая строка...");
            }
            
        } while (maxNumber < MIN_VALID_QUANTITY || maxNumber > MAX_LIMIT || maxNumber <= minNumber);

        System.out.println("Ваши случайные числа: ");
        for (int i = 0; i < quantityOfNumbers; i++){
            // randomNumber = minNumber + (int) Math.round(Math.random()*(maxNumber - minNumber));
            randomNumber = minNumber + (int)(Math.random() * (maxNumber - minNumber + 1));

            System.out.println(randomNumber);
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

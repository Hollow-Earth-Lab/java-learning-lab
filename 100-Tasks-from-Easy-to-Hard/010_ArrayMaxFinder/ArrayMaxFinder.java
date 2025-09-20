import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxFinder {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Поиск максимума в массиве...");

        Scanner scanner = new Scanner(System.in);        
        int size = 0;

        System.out.println();
        while (size <= 0) {
            System.out.print("Введите размер массива: ");
            size = readInt(scanner);
            // sc.nextInt();
        }

        System.out.println();

        // Объявляем массив нужного размера
        int[] numbers = new int[size];

        System.out.println("Вы создали массив из " + size + "-и элементов!");
        System.out.println();

        // Заполняем массив значениями
        for (int i = 0; i < size; i++) {
            System.out.print("Введите " +(i + 1)+ "-й элемент массива (от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE + "): ");
            numbers[i] = readInt(scanner);;
        }

        // Выводим результат
        System.out.println();
        System.out.println("Ваш массив:");
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]
        /*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        */

        // Ищем максимальное значение
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива равен = " + max);

        scanner.close();
    }

    public static int readInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Неверный ввод!");
                System.out.print("Пожалуйста, введите целое число (от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE + "): ");
                scanner.next(); // discard invalid token
            }
        }
    }                                           

}
import java.util.Scanner;
import java.util.Arrays;

public class ArrayElementSearcher {
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Давайте отсортируем массив и найдём его максимальные и минимальные значения!");

        Scanner scanner = new Scanner(System.in);        
        int size = 0;
        int number = 0;
        int numberOfMatches = 0;

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
            numbers[i] = (int) Math.round(Integer.MAX_VALUE * Math.random());
        }

        // Выводим результат
        System.out.println();
        System.out.println("Ваш массив:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        System.out.println();
        // System.out.println(Arrays.toString(numbers));

        // Клонируем исходный массив
        int[] sortedNumbers = numbers.clone();

        // Сортируем массив
        Arrays.sort(sortedNumbers);

        // Выводим результат
        System.out.println();
        System.out.println("Ваш массив отсортирован:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println("sortedNumbers[" + i + "] = " + sortedNumbers[i]);
        }
        System.out.println();
        // System.out.println(Arrays.toString(numbers));

        System.out.print("Минимальное значение:  ");
        System.out.println(sortedNumbers[0]);

        System.out.print("Максимальное значение: ");
        System.out.println(sortedNumbers[size - 1]);

        System.out.println();
        while (number <= 0) {
            System.out.print("Введите число: ");
            number = readInt(scanner);
            // sc.nextInt();
        }
        System.out.println();
        
        if (number < sortedNumbers[0] || number > sortedNumbers[size - 1]) {
            System.out.print("Введённое значение " + number + " вне диапазона ");
            System.out.println(sortedNumbers[0] + " - " + sortedNumbers[size - 1]);
        } else {
            System.out.println("Введённое значение " + number + " внутри диапазона:");
            System.out.println(sortedNumbers[0] + " < " + number + " < " + sortedNumbers[size - 1]);

            System.out.println();

            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i]) {
                    System.out.println("Элемент массива numbers[" + i + "] = " + number);
                    numberOfMatches++;
                }
            }
            if (numberOfMatches == 0) {
                System.out.println("В массиве нет элементов в точности = " + number);
            }
            System.out.println();

            System.out.println("Значения меньше чем " + number);
            int i = 0;
            while (sortedNumbers[i] < number) {
                System.out.println("i = " + i + ", sortedNumbers[i] = " + sortedNumbers[i]);
                // System.out.println(sortedNumbers[i]);
                i++;
            }
            System.out.println();
            System.out.println(number + " < - ваше число");
            System.out.println();

            System.out.println("Значения больше чем " + number);
            while (i < (sortedNumbers.length)) {
                if (sortedNumbers[i] > number) {
                    System.out.println("i = " + i + ", sortedNumbers[i] = " + sortedNumbers[i]);
                    // System.out.println(sortedNumbers[i]);
                }
                i++;
            }
        }

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
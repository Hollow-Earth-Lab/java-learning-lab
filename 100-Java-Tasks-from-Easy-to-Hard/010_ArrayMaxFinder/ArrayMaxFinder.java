import java.util.Scanner;

public class ArrayMaxFinder {
    
    public static void main(String[] args) {
        
        int size = 0;
        
        System.out.println("class ArrayMaxFinder");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        while (size <= 0) {
            System.out.print("Введите размер массива:  ");
            size = sc.nextInt();
        }
        
        System.out.println("Вы ввели:                " + size);
        
        // Объявляем массив нужного размера
        int[] numbers = new int[size];
        
        
        
        // Заполняем массив занчениями
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива: ");
            numbers[i] = sc.nextInt();
        }
        
        // Выводим результат
        System.out.println();
        System.out.println("Ваш массив:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // Ищем максимальное значение
        
        int max = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println();
        System.out.println("Максимум равен = " + max);
    }
    
}
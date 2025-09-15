import java.util.Scanner;
public class TwoNumberCalculator {
    public static void main(String[] args){
        
		// Очищаем экран:
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
        
		System.out.println("Простой калькулятор производящий операцию с двумя числами");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // Запрашиваем первое число:
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        // Запрашиваем второе число:
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        // Выясняем какую арифметическую операцию надо выполнить:
        System.out.println("Введите тип арифметической операции.");
		System.out.println("Можно ввести:");
		
        System.out.println(" + ");
		System.out.println(" - ");
		System.out.println(" * ");
		System.out.println(" / ");
		System.out.println(" % (остаток от деления)");
		
        String sign = scanner.next();

        System.out.println("Вы ввели: " + sign);

        switch (sign) {
            case "+":
                // Сложение (+): Суммирует два числа.
                System.out.println("Сумма введённых Вами чисел равна: " + (firstNumber + secondNumber));
				break;
            case "-":
                // Вычитание (-): Вычитает одно число из другого.
                System.out.println("Разность введённых Вами чисел равна: " + (firstNumber - secondNumber));
                break;
            case "*":
                // Умножение (*): Перемножает два числа.
                System.out.println("Произведение введённых Вами чисел равно: " + (firstNumber * secondNumber));
                break;
            case "/":
                // Деление (/): Делит одно число на другое (результат — целое число, если оба операнда int).
                if (secondNumber == 0) {
                    System.out.println("Ошибка: Частное от деления на ноль невозможно!");
                } else {
                    System.out.println("Частное от деления введённых Вами чисел равно: " + (firstNumber / secondNumber));
                    System.out.println("Результат деления с остатком: " + ((double)firstNumber / secondNumber));
                }
                break;
            case "%":
                // Остаток от деления (%): Возвращает остаток от деления одного числа на другое.
                if (secondNumber == 0) {
                    System.out.println("Ошибка: Остаток от деления на ноль невозможен!");
                } else {
                    System.out.println("Остаток от деления введённых Вами чисел равно: " + (firstNumber % secondNumber));
                }
                break;
            default:
                System.out.println("Ошибка: Неверный тип операции!");
        }
        scanner.close();
    }
}
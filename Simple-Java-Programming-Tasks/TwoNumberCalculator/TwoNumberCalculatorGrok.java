import java.util.Scanner;

public class TwoNumberCalculatorGrok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("\nSimple Two-number Calculator\n");

            try {
                // Запрашиваем числа
                System.out.print("Введите первое число: ");
                double firstNumber = scanner.nextDouble();

                System.out.print("Введите второе число: ");
                double secondNumber = scanner.nextDouble();

                // Запрашиваем операцию
                System.out.print("Введите операцию (+, -, *, /, %): ");
                String sign = scanner.next();

                System.out.println("Вы ввели: " + sign);
                double result;

                switch (sign) {
                    case "+":
                        result = firstNumber + secondNumber;
                        System.out.printf("%.2f + %.2f = %.2f%n", firstNumber, secondNumber, result);
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        System.out.printf("%.2f - %.2f = %.2f%n", firstNumber, secondNumber, result);
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        System.out.printf("%.2f * %.2f = %.2f%n", firstNumber, secondNumber, result);
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            System.out.println("Ошибка: деление на ноль!");
                            break;
                        }
                        result = firstNumber / secondNumber;
                        System.out.printf("%.2f / %.2f = %.2f%n", firstNumber, secondNumber, result);
                        break;
                    case "%":
                        if (secondNumber == 0) {
                            System.out.println("Ошибка: деление на ноль!");
                            break;
                        }
                        result = firstNumber % secondNumber;
                        System.out.printf("%.2f %% %.2f = %.2f%n", firstNumber, secondNumber, result);
                        break;
                    default:
                        System.out.println("Ошибка: неизвестная операция!");
                }

                // Спрашиваем, хочет ли пользователь продолжить
                System.out.print("Хотите продолжить? (да/нет): ");
                String choice = scanner.next();
                continueCalculating = choice.equalsIgnoreCase("да");

            } catch (Exception e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите корректные числа.");
                scanner.nextLine(); // Очищаем буфер
            }
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }
}
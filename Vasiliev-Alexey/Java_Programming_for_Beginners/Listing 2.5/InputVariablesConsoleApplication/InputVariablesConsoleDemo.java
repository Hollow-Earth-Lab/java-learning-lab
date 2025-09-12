import java.util.Scanner;

public class InputVariablesConsoleDemo {
    public static void main(String[] args){

        // System.out.println("class InputVariablesConsoleDemo");

        // Создание объекта input класса Scanner:
        Scanner input = new Scanner(System.in);

        // Текущий год:
        int now = 2025;

        // Переменная для записи имени пользователя:
        String name;

        // Переменная для записи возраста:
        int age;

        // Переменная для записи значения роста (в метрах):
        double height;

        // Переменная для записи значения массы (в килограммах):
        double mass;
        
        System.out.print("Ваше имя: ");

        // Считывание имени (текст):
        name = input.nextLine();

        System.out.print("Ваш возраст: ");

        // Считывание возраста (целое число):
        age = input.nextInt();

        System.out.print("Ваш рост (в метрах): ");

        // Считывание роста (в метрах):
        height = input.nextDouble();

        System.out.print("Ваша масса (в килограммах): ");

        // Считывание массы (в килограммах):
        mass = input.nextDouble();

        // Вычисления индекса массы тела:
        double bmi = mass / height / height;

        // Отображение имени:
        System.out.println("Здравствуйте, " + name + "!");

        // Вычисление и отображение года рождения:
        System.out.println("Вы родились в " + (now - age) + " году.");

        // Отображение значения индекса массы тела:
        System.out.printf("Ваш индекс массы тела: %5.2f\n", bmi);

    } // Конец описания метода main()
} // Конец описания класса InputVariablesConsoleDemo

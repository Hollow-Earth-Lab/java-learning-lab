import java.util.Scanner;

public class TemperatureConversion {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int scaleType = 0;
        double temperature = 0.0;

        double temperatureC = -273.15; // минимальное возможное значение по Цельсию
        double temperatureF = -459.67; // минимальное возможное значение по Фаренгейту
        double temperatureK = 0; // минимальное возможное значение по Кельвину

        System.out.println();
        System.out.println("Вас приветствует простой консольный конвертер температуры!");
        System.out.println();

        System.out.println("Выберите исходную шкалу:");
        System.out.println();
        System.out.println("1 - Градусы Цельсия (°C)    не меньше -273,15 °C");
        System.out.println("2 - Градусы Фаренгейта (°F) не меньше -459,67 °F");
        System.out.println("3 - Градусы Кельвина (K)    не меньше        0 K");

        do {
            String scaleTypeStr = readLineFromConsole("Введите 1, 2 или 3: ");
            if (isInteger(scaleTypeStr)) {
                scaleType = Integer.parseInt(scaleTypeStr);
                if (scaleType == 1 || scaleType == 2 || scaleType == 3) {
                    break;
                }
                else {
                    System.out.println("ОШИБКА: Введите число 1, 2 или 3...");
                }
            } else {
                System.out.println("ОШИБКА: Вы ввели не число!");
            }
        } while (true);

        if (scaleType == 1) { // Цельсий -273,15 °C
            do {
                String temperatureStr = readLineFromConsole("Введите температуру в °C:  ");
                if (isDouble(temperatureStr)) {
                    temperature = Double.parseDouble(temperatureStr);
                    if ((temperature >= -273.15) && (temperature <= 1000000.0)) {
                        temperatureC = temperature;
                        break;
                    }
                    else {
                        System.out.println("ОШИБКА: Температура должна быть выше -273,15 °C");
                    }
                } else {
                    System.out.println("ОШИБКА: Вы ввели не число!");
                }
            } while (true);
        }

        if (scaleType == 2) { // Фаренгейт -459,67 °F
            do {
                String temperatureStr = readLineFromConsole("Введите температуру в °F:  ");
                if (isDouble(temperatureStr)) {
                    temperature = Double.parseDouble(temperatureStr);
                    if ((temperature >= -459.67) && (temperature <= 1000000.0)) {
                        temperatureF = temperature;
                        break;
                    }
                    else {
                        System.out.println("ОШИБКА: Температура должна быть выше -459,67 °F");
                    }
                } else {
                    System.out.println("ОШИБКА: Вы ввели не число!");
                }
            } while (true);
        }

        if (scaleType == 3) { // Кельвин 0 K
            do {
                String temperatureStr = readLineFromConsole("Введите температуру в K:   ");
                if (isDouble(temperatureStr)) {
                    temperature = Double.parseDouble(temperatureStr);
                    if ((temperature >= 0.0) && (temperature <= 1000000.0)) {
                        temperatureK = temperature;
                        break;
                    }
                    else {
                        System.out.println("ОШИБКА: Температура должна быть выше 0 K");
                    }
                } else {
                    System.out.println("ОШИБКА: Вы ввели не число!");
                }
            } while (true);
        }

        System.out.println();

        if (scaleType == 1) {
            System.out.print("Вы ввели:                   ");
            System.out.printf("%.2f", temperatureC);
            System.out.println(" °C");

            // Цельсий > Фаренгейт
            temperatureF = temperatureC * (9.0/5.0) + 32;
            System.out.print("Температура по Фаренгейту:  ");
            System.out.printf("%.2f", temperatureF);
            System.out.println(" °F");

            // Цельсий > Кельвин
            temperatureK = temperatureC + 273.15;
            System.out.print("Температура по Кельвину:    ");
            System.out.printf("%.2f", temperatureK);
            System.out.println(" K");
        }

        if (scaleType == 2) {
            System.out.print("Вы ввели:                   ");
            System.out.printf("%.2f", temperatureF);
            System.out.println(" °F");

            // Фаренгейт > Цельсий
            temperatureC = (temperatureF - 32) * (5.0/9.0);
            System.out.print("Температура по Цельсию:     ");
            System.out.printf("%.2f", temperatureC);
            System.out.println(" °C");

            // Фаренгейт > Кельвин
            temperatureK = temperatureC + 273.15;
            System.out.print("Температура по Кельвину:    ");
            System.out.printf("%.2f", temperatureK);
            System.out.println(" K");
        }
        if (scaleType == 3) {
            System.out.print("Вы ввели:                   ");
            System.out.printf("%.2f", temperatureK);
            System.out.println(" K");

            // Кельвин > Цельсий
            temperatureC = temperatureK - 273.15;
            System.out.print("Температура по Цельсию:     ");
            System.out.printf("%.2f", temperatureC);
            System.out.println(" °C");

            // Цельсий > Фаренгейт
            temperatureF = temperatureC * (9.0/5.0) + 32;
            System.out.print("Температура по Фаренгейту:  ");
            System.out.printf("%.2f", temperatureF);
            System.out.println(" °F");
        }
    }

    public static String readLineFromConsole(String prompt) {
        // Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

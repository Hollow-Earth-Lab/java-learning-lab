// package io.hexlet;

/*
class App {
    // public static void printTalk(String[] args) {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        // System.out.println("- Did Joffrey agree?\n- He did. He also said \"I'm using this \\n\".");

        // var dollarsCount = 50 * 1.25;
        
        var rublesPerDollar = 60;
        var dollarsCount = 50 * 1.25; // 62.5
        System.out.println(dollarsCount);
        var rublesCount = dollarsCount * rublesPerDollar; // 3750.0
        // System.out.println(rublesCount); // => 3750.0
        System.out.println("The price is " + rublesCount + " rubles");

        // END
    }
}
 */

/*
public class App {
    public static void main(String[] args) {
        var king = "King Balon the 6th";

        // BEGIN (write your solution here)
        var numberOfKing = 6;
        var numberOfRooms = 17;

        System.out.println(king + " has " + (numberOfKing * numberOfRooms) + " rooms.");
        // END
    }
}
 */

/*
class App {
    public static void main(String[] args) {

        // BEGIN (write your solution here)
        // In Java, the result of dividing an integer by an integer is always an integer.
        // The fractional part is discarded when dividing.
        System.out.println(3 / 2);
        
        System.out.println(3.0 / 2);
        System.out.println(3 / 2.0);
        System.out.println(3.0 / 2.0);
        // END
    }
}
 */

/*
class App {
    public static void main(String[] args) {

        byte x = 3; // Отработает без проблем
        
        // Error: incompatible types: possible lossy conversion from int to byte
        // byte y = 270;

        char ch = 'a';

        // Error: incompatible types: java.lang.String cannot be converted to char
        // char ch2 = "b";
    }
}
 */

/*
// Выведите на экран результат конкатенации слова hexlet, символа - и числа 7
class App {
    public static void main(String[] args) {

        // BEGIN (write your solution here)
        String str = "hexlet";
        char ch = '-';
        int number = 7;

        System.out.println(str + ch + number);
        // END
    }
}
 */

/*
class App {
    public static void main(String[] args) {
        
        String a = null; // объявлена, но не инициализирована
        System.out.println(a); // ошибка: переменная может быть не инициализирована

        int b;
        // b = null; // error: incompatible types: <null> cannot be converted to int
        b = 66;
        System.out.println(b);
    }
}
 */

// Выведите на экран строку 2 times, полученную из числа 2.9 и строки times, 
// используя преобразования типов и конкатенацию:

/*
class App {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        double number = 2.9;
        String str = "times";
        
        System.out.println((int) number + " " + str);
        System.out.println("Hexlet".length()); // 6
        System.out.println("ABBA".length()); // 4

        var company = "Hexlet";
        var companyLength = company.length();
        System.out.println(company.length()); // => 6

        System.out.println(companyLength); // => 6

        // Приводим к верхнему регистру
        company.toUpperCase(); // "HEXLET"
                var company1 = "Apple";
        var company2 = "Samsung";

        System.out.println(company1.length() + company2.length());
        // END
    }
}
 */

class App {
    public static void main(String[] args) {
        // BEGIN (write your solution here)

        var searchEngine = "google";
        // Возвращает первый символ (тип char)
        searchEngine.charAt(0); // 'g'
        System.out.println(searchEngine.charAt(0)); // 'g'
        System.out.println(searchEngine.charAt(5)); // 'e'
        // System.out.println(searchEngine.charAt(7)); // Exception
        System.out.println(searchEngine.replace("go", "mo")); // "moogle"

        System.out.println("hexlet".substring(1));    // "exlet"
        System.out.println("hexlet".substring(1, 2)); // "e"
        System.out.println("hexlet".substring(1, 3)); // "ex"
        System.out.println("hexlet".substring(3, 6)); // "let"
        System.out.println("Hello!".substring(2));

        var one = "Naharis";
        var two = "Mormont";
        var three = "Sand";
        
        var text = "Never forget what you are, for surely the world will not";

        // Третий символ из первой строки
        System.out.print(one.charAt(2));
        System.out.print(" ");
        // Второй символ из второй строки
        System.out.print(two.charAt(1));
        System.out.print(" ");
        // Четвертый символ из третьей строки
        System.out.print(three.charAt(3));
        System.out.print(" ");
        // Пятый символ из второй строки
        System.out.print(two.charAt(4));
        System.out.print(" ");
        // Третий символ из второй строки
        System.out.print(two.charAt(2));

        System.out.println();

        // Индексы начинаются с нуля
        var name = "Java";
        // Вызов метода и вычитание вместе!
        var lastIndex = name.length() - 1;
        System.out.println(lastIndex); // => 3
        System.out.println(name.length() - 1); // => 3

        // toUpperCase() – переводит слово в верхний регистр
        System.out.println("Привет, " + name.toUpperCase()); // => Привет, JAVA

        System.out.println(text.length() - 1);
        System.out.println("First: " + text.substring(0, 1));
        System.out.println("Last: " + text.substring(text.length() - 1));

        // END
    }
}

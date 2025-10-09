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



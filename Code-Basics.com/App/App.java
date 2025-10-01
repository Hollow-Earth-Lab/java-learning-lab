/* 
Выведите на экран строку 2 times, полученную из числа 2.9 и строки times, 
используя преобразования типов и конкатенацию.

public class App {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        
        System.out.println((int) 2.9 + " " + "times");
        // END
    }
}
 */

/* 
В коде программы определены две переменные, содержащие имена компаний. Посчитайте их общую длину в символах и выведите ее на экран.
 */

public class App {
    public static void main(String[] args) {
        var company1 = "Apple";
        var company2 = "Samsung";

        // BEGIN (write your solution here)
        System.out.println((company1 + company2).length());
        System.out.println("hexlet".substring(0));    // "hexlet"
        System.out.println("hexlet".substring(1));    // "exlet"
        System.out.println("hexlet".substring(1, 2)); // "e"
        System.out.println("hexlet".substring(1, 3)); // "ex"
        System.out.println("hexlet".substring(3, 6)); // "let

        var one = "Naharis";
        var two = "Mormont";
        var three = "Sand";

        // BEGIN (write your solution here)
        System.out.print(one.charAt(2));
        System.out.print(two.charAt(1));
        System.out.print(three.charAt(3));
        System.out.print(two.charAt(4));
        System.out.print(two.charAt(2));
        // END
        // END
    }
}

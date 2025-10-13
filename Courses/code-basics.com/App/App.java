/*
// Решение учителя:
public class App {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN
        var result = "First: "
            + text.charAt(0)
            + "\nLast: "
            + text.charAt(text.length() - 1);

        System.out.println(result);
        // END
    }
}

//Ваше решение:
public class App {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN (write your solution here)
        System.out.println("First: " + text.charAt(0));
        System.out.println("Last: "  + text.charAt(text.length() - 1));
        // END
    }
}

//Решение @papazaitsa: можно еще по другому String.format("First: %s", text.charAt(0));

public class App {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN (write your solution here)
        // можно еще по другому 
        System.out.println(text.format("First: %s", text.charAt(0)));
        System.out.println(text.format("Last: %s", text.charAt(text.length() - 1)));
        // END
    }
}

public class App {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN (write your solution here)
        // можно еще по другому String.format("First: %s", text.charAt(0));
        System.out.println(String.format("First: %s", text.charAt(0)));
        System.out.println(String.format("First: %s", text.charAt(text.length() - 1)));
        // END
    }
}

public class App {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";
        // BEGIN (альтернатива)
        System.out.format("First: %s%n", text.charAt(0));
        System.out.format("Last: %s%n", text.charAt(text.length() - 1));
        // END
    }
}
*/

/*
public class App {
    public static void main(String[] args) {
        var name = "hexlet";

        // BEGIN (write your solution here)
        String firstLetter;
        String newName;

        firstLetter = name.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();
        newName = firstLetter + (name.substring(1)).toLowerCase();
        System.out.println(newName);
        // END
    }
}
*/

/*
public class App {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        System.out.println((int) (10 * Math.random()));
        // END
    }
}
 */

/*
Задание

В переменной emoji находится текстовый грустный смайлик -(. Ваша задача — сделать 
этот смайлик веселым с помощью двух преобразований:

    Добавить слева глаза :
    Заменить ( на ) (с помощью метода строки replace())

Должно получиться: :-). Выведите его на экран.
 */

/*
public class App {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        String emoji = "-(";
        
        System.out.println(emoji);

        emoji = ":" + emoji;
        System.out.println(emoji);

        emoji = emoji.replace('(', ')');
        System.out.println(emoji);
        // END
    }
}
 */

/*
public class App {
    // BEGIN (write your solution here)
    public static void main(String[] args) {
        

        // Реализуйте статический метод с именем printMotto(), 
        // который выведет на экран фразу Winter is coming.

        // Класс App уже определен
        
        App.printMotto(); // => Winter is coming
    }

    public static void printMotto() {
        System.out.println("Winter is coming");
    }
    // END
}
 */


/*
Задание
Реализуйте класс с именем App и двумя методами:

Метод gogo(), который печатает на экран строку It works!
main(), как в определении выше, который вызывает метод gogo()
Результат вызова main() в таком случае будет таким:

// => "It works!"
 */

/*
public class App {
    // BEGIN (write your solution here)
    public static void main(String[] args) {
        App.gogo();
    }

    public static void gogo() {
        System.out.println("It works!");
    }
    // END
}

 */

// Задание
// Реализуйте статический метод sayHurrayThreeTimes(), 
// который возвращает строку 'hurray! hurray! hurray!'.
// var hurray = App.sayHurrayThreeTimes();
// System.out.println(hurray); // => hurray! hurray! hurray!

/*
public class App {
    // BEGIN (write your solution here)
    public static void main(String[] args) {
        System.out.println(App.sayHurrayThreeTimes());
    }

    public static String sayHurrayThreeTimes() {
        return "'hurray! hurray! hurray!'";
    }
    // END
}
 */

// Задание
// Реализуйте статический метод App.truncate(), который обрезает переданную строку до 
// указанного количества символов, добавляет в конце многоточие и возвращает 
// получившуюся строку. Подобная логика часто используется на сайтах, чтобы отобразить 
// длинный текст в сокращенном виде. Метод принимает два параметра:

// Строка (String), которую нужно обрезать
// Число (int) символов, которые нужно оставить
// Пример того, как должен работать написанный вами метод:
 

// Передаем текст напрямую
// Обрезаем текст, оставляя 2 символа
// App.truncate("hexlet", 2); // he...

// Через переменную
// var text = "it works!"
// Обрезаем текст, оставляя 4 символа
// App.truncate(text, 4); // it w...
// Реализовать этот метод можно различными способами, подскажем лишь один из них. 
// Для решения этим способом вам понадобится взять подстроку из строки, 
// переданной первым параметром в метод truncate(). Используйте для этого метод 
// substring(). Подумайте, исходя из задания, с какого индекса и по какой вам 
// надо извлечь подстроку?

// var text = "welcome";
// Передавать параметры в метод можно через переменные
// var index = 3;
// text.substring(0, index); // wel
// С точки зрения проверочной системы не имеет значения, каким из способов будет 
// реализован метод truncate() внутри, главное – чтобы он выполнял поставленную задачу

public class App {
    // BEGIN (write your solution here)
    public static void main(String[] args) {
        System.out.println(App.truncate("hexlet", 6));
    }

    public static String truncate(String text, int length) {
        // BEGIN (write your solution here)
            text = text.substring(0, length) + "...";
            return text;
        // END
    }
    // END
}
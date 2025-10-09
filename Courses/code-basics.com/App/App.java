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

public class App {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        System.out.println((int) (10 * Math.random()));
        // END
    }
}

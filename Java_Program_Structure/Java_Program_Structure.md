      Java- —  ,       :

---

##    Java-

```java
//   
import java.util.Scanner;

public class MyProgram {

    //    
    static final int MAX_LIMIT = 1024;
    static final Scanner scanner = new Scanner(System.in);

    //  
    public static void main(String[] args) {
        printWelcomeMessage();
        int input = readInt(" : ");
        boolean result = processInput(input);
        printResult(result);
        scanner.close();
    }

    // :  
    public static void printWelcomeMessage() {
        System.out.println("   MyProgram!");
    }

    // :     
    public static int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    // :   
    public static boolean processInput(int value) {
        return value > 0 && value < MAX_LIMIT;
    }

    // :  
    public static void printResult(boolean isValid) {
        if (isValid) {
            System.out.println(" .");
        } else {
            System.out.println(":    .");
        }
    }
}
```

---

##  :

|               |                                 |
|-------------------|-------------------------------------------|
| `import`          |                       |
| `class`           |                          |
| `main()`          |                       |
|             | ,                  |
|          |                        |
| `Scanner`         |                               |

---

##   

  ,     :      .
 —       `InputEngine`, `ValidationEngine`, `LogicModule`,  `Logger`.

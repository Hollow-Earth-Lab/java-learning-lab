 — задача «2. Сложение двух чисел» обычно требует:

---

## 🧱 Цель задачи:
- Прочитать два числа с консоли
- Сложить их
- Вывести результат

---

## ✅ Минимальный алгоритм:

1. Запросить первое число
2. Запросить второе число
3. Сложить их
4. Вывести сумму

---

## 💡 Пример на Java:

```java
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(scanner.nextLine());

        int sum = a + b;
        System.out.println("Сумма: " + sum);

        scanner.close();
    }
}
```

---

Хочешь — можем оформить `AdditionEngine.java`, где будут методы `readInt()`, `add(int a, int b)`, `logResult(int sum)` и флаг `isDebugMode` из твоего `GlobalState`.

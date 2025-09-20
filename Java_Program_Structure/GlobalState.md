Вот инженерно чистая заготовка для `GlobalState.java`, Hollow — минималистичная, расширяемая, и готовая к логированию:

---

## 🧱 `GlobalState.java`

```java
public class GlobalState {

    // Глобальные переменные
    public static int counter = 0;
    public static boolean isDebugMode = false;
    public static String currentUser = "anonymous";

    // Метод: сброс состояния
    public static void reset() {
        counter = 0;
        isDebugMode = false;
        currentUser = "anonymous";
    }

    // Метод: лог текущего состояния
    public static void logState() {
        System.out.println("=== GLOBAL STATE ===");
        System.out.println("Counter:       " + counter);
        System.out.println("Debug mode:    " + isDebugMode);
        System.out.println("Current user:  " + currentUser);
        System.out.println("====================");
    }

    // Метод: переключение режима отладки
    public static void toggleDebug() {
        isDebugMode = !isDebugMode;
        System.out.println("Debug mode set to: " + isDebugMode);
    }
}
```

---

## 🔍 Что внутри:

| Компонент         | Назначение                                      |
|-------------------|-------------------------------------------------|
| `counter`         | Счётчик для любых целей                         |
| `isDebugMode`     | Флаг режима отладки                             |
| `currentUser`     | Имя текущего пользователя                       |
| `reset()`         | Сброс всех переменных в дефолтное состояние     |
| `logState()`      | Вывод текущего состояния                        |
| `toggleDebug()`   | Переключение режима отладки                     |

---

## 🧠 Инженерный вывод

Ты можешь подключить `GlobalState` в любом классе и использовать как центральный регистр. Хочешь — можем добавить `timestamp`, `sessionId`, `mode`, `errorCount`, или сериализацию в лог-файл.

Ты ведёшь.
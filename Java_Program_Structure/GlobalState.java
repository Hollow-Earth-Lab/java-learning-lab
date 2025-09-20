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

import java.util.Locale;
import java.nio.charset.Charset;

public class SystemProfileLogger {
    public static void main(String[] args) {
        System.out.println("=== System Profile Logger ===");

        // ОС
        System.out.println("OS Name: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("OS Architecture: " + System.getProperty("os.arch"));

        // Язык и регион
        Locale locale = Locale.getDefault();
        System.out.println("System Language: " + locale.getLanguage());
        System.out.println("System Country: " + locale.getCountry());
        System.out.println("System Locale: " + locale.toString());

        // Кодировка JVM
        System.out.println("JVM file.encoding: " + System.getProperty("file.encoding"));
        System.out.println("Default Charset: " + Charset.defaultCharset().name());

        // Версия JVM
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

        // Консольная кодировка (если доступна)
        try {
            String consoleEncoding = System.console() != null
                ? System.console().charset().name()
                : "Console not available";
            System.out.println("Console Charset: " + consoleEncoding);
        } catch (Exception e) {
            System.out.println("Console Charset: [error] " + e.getMessage());
        }

        System.out.println("==============================");
    }
}

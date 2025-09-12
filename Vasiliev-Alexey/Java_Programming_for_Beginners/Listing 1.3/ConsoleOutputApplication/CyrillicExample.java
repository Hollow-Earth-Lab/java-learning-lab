import java.nio.charset.StandardCharsets;

public class CyrillicExample {
    public static void main(String[] args) {
        String cyrillicText = "Привет, мир!"; // Кириллица
        // Кодирование строки в байты
        byte[] bytes = cyrillicText.getBytes(StandardCharsets.UTF_8);
        // Декодирование байтов обратно в строку
        String decodedText = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(decodedText); // Вывод: Привет, мир!
    }
}
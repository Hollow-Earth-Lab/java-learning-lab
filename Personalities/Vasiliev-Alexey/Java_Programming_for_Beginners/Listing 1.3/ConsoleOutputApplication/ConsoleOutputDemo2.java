// Как сделать так, чтобы программа на Java выводила в консоль Windows сообщения на русском языке?

import java.nio.charset.StandardCharsets;

// Описание класса ConsoleOutputDemo2:
class ConsoleOutputDemo2 {
	
	// Главный метод программы:
	public static void main(String[] args) {
		// Устанавливаем кодировку консоли в UTF-8
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
		
		// Вывод сообщения в консольное окно (окно вывода):
		System.out.println("Мы изучаем язык Java 2");
	} // Завершение описания метода main()

} // Завершение описания класса ConsoleOutputDemo2

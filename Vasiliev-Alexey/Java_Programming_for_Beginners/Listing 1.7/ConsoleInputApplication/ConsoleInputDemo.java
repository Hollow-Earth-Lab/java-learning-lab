// Импортируем класс io:
import java.io.*;

// Импортируем класс Scanner:
import java.util.Scanner;

public class ConsoleInputDemo {
	
	// Главный метод
	public static void main(String[] args) throws UnsupportedEncodingException {
		PrintStream out = new PrintStream(System.out, true, "UTF-8");
		
		out.println("Привет, мир!");
		
		// Создание обекта input класса Scanner:
		Scanner input = new Scanner(System.in);
		
		// Переменные для считывания названия дня недели и месяца:
		String day, month;
		
		// Отображается сообщение:
		out.print("Какой сегодня день? ");
		
		// Считывается текстовая строка:
		day = input.nextLine();
		
		out.println("Вы ввели " + day);
	
		// Отображается сообщение:
		out.print("Какой сегодня месяц? ");
		
		// Считывается текстовая строка:
		month = input.nextLine();
		
		out.println("Вы ввели " + month);
		
		// Текстовая переменная:
		String text;
		
		// Текстовое значение для отображения в консоли:
		text = "Сегодня " + day + " месяц " + month;
		
		// Отображается сообщение
		out.println(text);
		
	}
};
// Класс ShowMeNewWindowDemo

// Импортируется класс JOptionPane:
import javax.swing.JOptionPane;

// Описание класса ShowMeNewWindowDemo:
class ShowMeNewWindowDemo {
	// Описание главного модуля программы:
	public static void main(String[] args) {
		// Текст для названия окна:
		String title = "Сообщение";
		// Текст соообщения:
		String text ="Продолжаем изучать Java";
		// Отображение диалогового окна с сообщением:
		JOptionPane.showMessageDialog(null, text, title, JOptionPane.WARNING_MESSAGE);
	} // Завершение описания метода main()
} // Завершение описания класса ShowMeNewWindowDemo

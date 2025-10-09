// Импорт класса JOptionPane:
import javax.swing.JOptionPane;

// Описание класса InputDialogDemo:
class InputDialogDemo {
	
	// Главный метод:
	public static void main(String[] args) {
		
		// Переменная для записи текста:
		String text;
		
		// Отображение диалогового окна с полем ввода:
		text = JOptionPane.showInputDialog("Ввведите текст");
		
		// Отображение диалогового окна с соообщением:
		JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text);
	} // Завершение описания метода main()
	
} // Завершение описания класса InputDialogDemo

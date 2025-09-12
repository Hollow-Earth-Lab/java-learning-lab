// UsingVariablesDemo

import javax.swing.JOptionPane;

public class UsingVariablesDemo {
	public static void main(String[] args){
		// Целочисленная переменная:
		int number = 123;
		
		// Действительная переменная:
		double X = 32.1;
		
		// Символьная переменная:
		char symb = 'A';
		
		// Логическая переменная:
		boolean state = true;
		
		// Текстовая переменная для формирования содержания сообщения:
		String text = "Используемые переменные:\n";
		
		// Дописывается значение целочисленной переменной:
		text = text + "Целое число: " + number + "\n";
		
		// Дописывается значение числовой переменной:
		text = text + "Действительное число: " + X + "\n";
		
		// Дописывается значение символьной переменной:
		text = text + "Символ: " + symb + "\n";
		
		// Дописывается значение логической переменной:
		text = text + "Логическое значение: " + state + "\n";
		
		// Отображение сообщения:
		JOptionPane.showMessageDialog(null, text);
	}
}

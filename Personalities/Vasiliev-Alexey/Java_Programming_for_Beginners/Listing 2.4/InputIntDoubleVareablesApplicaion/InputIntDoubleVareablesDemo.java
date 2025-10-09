import javax.swing.JOptionPane;

public class InputIntDoubleVareablesDemo {
    public static void main(String[] args){
        System.out.println("class InputIntDoubleVareablesDemo");
        // Числовые переменные:
        double mass, height, bmi;

        // Переменная для считывания значения из поля ввода:
        String result;

        // Считывание значения из поля ввода:
        result = JOptionPane.showInputDialog("Ваш рост в метрах:");

        // Преобразование текста в число:
        height = Double.parseDouble(result);

        // Считывание значения из поля ввода:
        result = JOptionPane.showInputDialog("Ваш вес в килограммах:");
        mass = Double.parseDouble(result);

        // Вычисление индекса массы тела:
        bmi = mass/height/height;

        // Округление полученного значения:
        bmi = Math.round(bmi * 100) / 100.0;
        
        // Отображение окна с сообщением:
        JOptionPane.showMessageDialog(null, "Индекс массы тела: " + bmi);
        
    }
    
}

/**
 * 
 */

/**
 * @author User
 *
 */
import javax.swing.*;
import java.awt.*;
// import java.awt.GridLayout;
// import java.awt.BorderLayout;

public class SimpleCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������� ����� 'SimpleCalculator'");
		
		// ������ ������
		JPanel windowContent = new JPanel();
		
		// ����� �������� ����������� ��� ���� ������
		
		// FlowLayout fl = new FlowLayout();
		// windowContent.setLayout(fl);
		
		GridLayout gr = new GridLayout(4, 5, 5, 5);
		windowContent.setLayout(gr);
		
		// BorderLayout bl = new BorderLayout(3,3);
		// windowContent.setLayout(bl);
		
		// ������ ���������� � ������
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum:");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Add");
		
		// ��������� ���������� �� ������
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
				
		// ������ ����� � ����� ��� ���� ������
		JFrame frame = new JFrame("My First Calculator");
		frame.setContentPane(windowContent);
		
		// ����� ������ � ������ ����� �������
		frame.setSize(800, 400);
		frame.setVisible(true);

	}

}

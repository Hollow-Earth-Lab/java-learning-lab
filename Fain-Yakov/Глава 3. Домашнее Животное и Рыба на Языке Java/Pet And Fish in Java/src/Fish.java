/**
 * 
 */

/**
 * @author User
 *
 */
public class Fish extends Pet {
	
	int currentDeep;
	
	Fish(int startingPosition) {
		
		currentDeep = startingPosition;
		
	}

	public int dive(int howDeep){
		
		if (currentDeep + howDeep <= 100) {
			
			System.out.println("� �� ������� " + currentDeep + " �����!");
			System.out.println("����� �� ������� " + howDeep + " �����!");
			currentDeep = currentDeep + howDeep;
			System.out.println("������ � �� ������� " + currentDeep + " �����!");
			System.out.println();
			}
		else {
			System.out.println("� �� ������� " + currentDeep + " �����!");
			System.out.println("� ��������� ����� � �� ���� ������ ������ 100 �����!");
			System.out.println("� ������� �� ������� " + currentDeep + " �����!");
			System.out.println();
			}
		return currentDeep;
		}
	
	public String say(String something){
		return "����� �� �� ������, ��� ���� �� �������������?";
		}
}

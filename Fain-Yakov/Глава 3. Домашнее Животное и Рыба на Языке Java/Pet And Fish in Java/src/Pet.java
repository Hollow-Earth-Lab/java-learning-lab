/**
 * 
 */

/**
 * @author User
 *
 */
public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	public void eat () {
		System.out.println("� ����� �������! ������� ��������� ������� :))");
	}
	
	public void sleap () {
		System.out.println("��������� ����! �� ������!");		
	}
	
	public String say (String aWord) {
		String PetResponse = "�� �����! " + aWord;
		return PetResponse;
	}
	
}

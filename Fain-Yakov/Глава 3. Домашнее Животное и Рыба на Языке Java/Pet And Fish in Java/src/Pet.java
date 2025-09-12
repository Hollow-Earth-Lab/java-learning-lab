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
		System.out.println("Я очень голоден! Давайте перекусим чипсами :))");
	}
	
	public void sleap () {
		System.out.println("Спокойной ночи! До завтра!");		
	}
	
	public String say (String aWord) {
		String PetResponse = "Ну ладно! " + aWord;
		return PetResponse;
	}
	
}

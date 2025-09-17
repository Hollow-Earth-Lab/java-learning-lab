/**
 * 
 */

/**
 * @author User
 *
 */
public class PetMaster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! I am Pet Master!");
		
		String petReaction;
		Pet myPet = new Pet();

		myPet.eat();
		
		petReaction = myPet.say("Чик! Чирик!");
		System.out.println(petReaction);
		
		myPet.sleap();

	}
}

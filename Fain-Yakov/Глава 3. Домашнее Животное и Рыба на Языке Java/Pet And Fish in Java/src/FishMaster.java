/**
 * 
 */

/**
 * @author User
 *
 */
public class FishMaster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! I am Fish Master!");
		System.out.println();
		
		Fish myLittleFish = new Fish(10);
		
		myLittleFish.eat();
		
		System.out.println(myLittleFish.say("Привет!"));
		
		myLittleFish.dive(45);
		
		myLittleFish.dive(5);
		
		myLittleFish.dive(51);
		
		myLittleFish.sleap();
				
	}

}

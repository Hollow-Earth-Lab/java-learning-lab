/**
 * 
 */

/**
 * @author User
 *
 */
public class CarMaster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am just ordinary car owner...");
		
		Car myCar = new Car();
		
		System.out.println(myCar.start());
		
		System.out.println(myCar.drive(3));

		System.out.println(myCar.stop());
	}

}

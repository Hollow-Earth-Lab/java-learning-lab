/** Conditions
 * 
 */

/**
 * @author User
 *
 */
public class Conditions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price;
		price = 101;
		
		if (price > 100) {
			
			price = price * 0.8;
			System.out.println("Ваша скидка 20%!");
			System.out.println("Ваша цена: " + price);
			
			
		}
		else {
			price = price * 0.9;
			System.out.println("Ваша скидка 10%!");
			System.out.println("Ваша цена: " + price);
		}

	}

}

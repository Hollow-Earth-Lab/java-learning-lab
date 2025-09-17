/**
 * 
 */

/**
 * @author User
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	// static int x;
	// static int y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Variables");
		
		int x;
		int y;
		
		x = 5;
		y = x + 2;
		
		System.out.println("y = " + y);
		
		int myScore = 5;
		
		myScore = myScore + 1;
		
		System.out.println("myScore = " + myScore);
		
		myScore=10;
		System.out.println("myScore = " + myScore);
		
		myScore--;
		System.out.println("myScore = " + myScore);
		
		myScore = myScore * 2; 
		System.out.println("myScore = " + myScore);
		
		myScore = myScore / 3; 
		System.out.println("myScore = " + myScore);
		
		
		for (byte i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}

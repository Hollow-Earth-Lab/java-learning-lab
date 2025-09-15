/** Logical Operators
 * 
 */

/**
 * @author User
 *
 */
public class LogicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String state;
		state = "Texas";
		
		// if (state.equals("Texas")|state.equals("California")){
		if (state.equals("Texas")||state.equals("California")){
			
			System.out.println("TX or CAL");
			}
		
		double price;
		price = 100;
		state = "New York";
		
		// if (state.equals("New York") & price > 110){
		if (state.equals("New York") && price < 110){
				
				System.out.println("NY and Low Price");
			}
		

	}

}

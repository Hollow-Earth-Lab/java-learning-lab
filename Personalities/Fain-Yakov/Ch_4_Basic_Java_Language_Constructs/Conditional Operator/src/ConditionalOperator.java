/**
 * 
 */

/**
 * @author User
 *
 */
public class ConditionalOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price;
		int discount;
		
		price = 55;
		
		discount = price > 50? 10:5;
		
		/* Если цена больше пятидесяти, значение переменной discount (скидка)
		будет равно десяти, в противном случае -­‐ пяти.
		Это просто более короткая форма записи обычного оператора if:
		*/
		
		System.out.println("Price = " + price);
		System.out.println("Discount = " + discount);

		price = 45;
		if (price > 50){
			discount = 10;
		} else {
			discount = 5;
		}
		
		System.out.println("Price = " + price);
		System.out.println("Discount = " + discount);

	}

}

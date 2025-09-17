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
			
			System.out.println("Я на глубине " + currentDeep + " футов!");
			System.out.println("Ныряю на глубину " + howDeep + " футов!");
			currentDeep = currentDeep + howDeep;
			System.out.println("Теперь я на глубине " + currentDeep + " футов!");
			System.out.println();
			}
		else {
			System.out.println("Я на глубине " + currentDeep + " футов!");
			System.out.println("Я маленькая рыбка и не могу нырять глубже 100 футов!");
			System.out.println("Я остаюсь на глубине " + currentDeep + " футов!");
			System.out.println();
			}
		return currentDeep;
		}
	
	public String say(String something){
		return "Разве Вы не знаете, что рыбы не разговаривают?";
		}
}

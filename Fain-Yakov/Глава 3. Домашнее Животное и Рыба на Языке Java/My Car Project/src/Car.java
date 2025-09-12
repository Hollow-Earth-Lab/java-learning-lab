/**
 * 
 */

/**
 * @author User
 *
 */
public class Car {
	public String start() {
		
		String startEngine = "Завожу двигатель!";
		return startEngine;
		
	}
	
	public int drive(int HowLong) {
		int Distance;
		
		Distance = HowLong * 60;
		
		return Distance;
	}
	
	public String stop() {
		
		String stopEngine = "Глушу мотор!";
		return stopEngine;
		
	}

}

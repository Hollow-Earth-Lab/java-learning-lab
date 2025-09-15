/**
 * 
 */

/**
 * @author User
 *
 */
public class DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Data Types");
		System.out.println("");
		
		System.out.println("Type Byte");
		byte myByte = 127;
		System.out.println("Max Byte = " + myByte);
		
		myByte = (byte) (- myByte - 1);
		System.out.println("Min Byte = " + myByte);
		System.out.println("");
		
		System.out.println("Type Short");
		Short myShort = 32767;
		System.out.println("Max Short = " + myShort);
		
		myShort = (short) (- myShort - 1);
		System.out.println("Min Short = " + myShort);
		System.out.println("");
		
		System.out.println("Type int");
		int myInt = 2147483647;
		System.out.println("Max int = " + myInt);
		myInt = - myInt - 1;
		System.out.println("Min int = " + myInt);
		System.out.println("");
		
		System.out.println("Type long");
		long myLong = 9_223_372_036_854_775_807L;
		System.out.print("Max long = " + myLong);
		System.out.println(" Or Max long is 9.223.372.036.854.775.807");
		myLong = - myLong - 1;
		System.out.print("Min long = " + myLong);
		System.out.println(" Or Min long  is -9.223.372.036.854.775.808");
		System.out.println("");
		
		System.out.println("Type float");
		float myFloat = 1;
		System.out.println("Max float = " + myFloat);
		myFloat = - myFloat - 1;
		System.out.println("Min float = " + myFloat);
		System.out.println("");
		
		System.out.println("Type double");
		double myDouble = 1;
		System.out.println("Max double = " + myDouble);
		myDouble = - myDouble - 1;
		System.out.println("Min double = " + myDouble);
		System.out.println("");
	}

}

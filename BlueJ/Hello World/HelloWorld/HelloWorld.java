/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{
    public static void main(String[] args){
        System.out.println("Hello World!!!");
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.x);
        System.out.println(hw.sampleMethod(15));
        
    }
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * Constructor for objects of class HelloWorld
     */
    public HelloWorld()
    {
        // initialise instance variables
        x = 23;
        // System.out.println(x);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        System.out.println(x + y);
        System.out.println("Вызываем sampleMethod");
        return x + y;
    }
}
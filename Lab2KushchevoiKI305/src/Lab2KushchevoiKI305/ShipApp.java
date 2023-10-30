/**
 * Lab2KushchevoiKI305 package
 */
package Lab2KushchevoiKI305;

import java.io.FileNotFoundException;

/**
 * ShipApp class implements main method for Ship class possibilities demonstration
 * 
 * @author Viktor Kushchevoi
 * @version 1.0
 */
public class ShipApp {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException {
		Ship s1 = new Ship(60000, 200, 14000);
		main1();
		Ship s2 = new Ship(60000, 200, 13000);
		int maxDeckSquare = Integer.MIN_VALUE;
	    int minDeckSquare = Integer.MAX_VALUE;
	    System.out.println("Ships with Maximum Deck Square: " + Ship.getMaxDeckSquareCount());
	    System.out.println("Ships with Minimum Deck Square: " + Ship.getMinDeckSquareCount());
	}
	public static void main1() throws FileNotFoundException  {
		Ship s1 = new Ship(60000, 400, 12000);
		Ship s2 = new Ship(60000, 200, 12000);
		Ship s3 = new Ship(60000, 200, 12000);
	}
}




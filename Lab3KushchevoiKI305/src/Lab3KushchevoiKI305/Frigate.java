/**
 * Lab3KushchevoiKI305 package
 */
package Lab3KushchevoiKI305;

import java.io.FileNotFoundException;

/**
 * Class Frigate implements frigate and military
 * 
 * @author Viktor Kushchevoi
 * @version 1.0
 */
public class Frigate extends Ship implements FrigateInterface, Military {

	/**
	 * Constructor
	 * 
	 * @throws FileNotFoundException  if an error occurs when initializing the Frigate
	 */
	public Frigate() throws FileNotFoundException {
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param weight of the Frigate
	 * @param height of the Frigate
	 * @param square of the Frigate
	 * @throws FileNotFoundException  if an error occurs when initializing the Frigate
	 */
	public Frigate(int weight, int height, int square) throws FileNotFoundException {
		super(weight, height, square);
	}

	/**
	 * Method implements flag raising
	 */
	@Override
	public void raiseFlag() {
		System.out.println("Flag is raised");
		fout.println("Flag is raised");
	}
	
	
	public void shoot() {
		System.out.println("Shoot");
		fout.println("Shoot");
	}
	
	/**
	 * Method shows ship info
	 */
	@Override
	public void info() {
		super.info();
		System.out.println("Type of ship = Frigate");
		fout.println("Type of ship = Frigate");
	}
}

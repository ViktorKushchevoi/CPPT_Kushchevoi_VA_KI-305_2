/**
 * Lab3KushchevoiKI305 package
 */
package Lab3KushchevoiKI305;

import java.io.FileNotFoundException;

/**
 * FrigateApp class implements main method for Frigate class possibilities demonstration
 * 
 * @author Viktor Kushchevoi
 * @version 1.0
 */
public class FrigateApp {
	
	public static void main(String[] args) throws FileNotFoundException {
		Frigate ship = new Frigate(70000, 350, 14000);
		ship.startEngine();
		ship.setSpeed(30);
		ship.rudderLeft();
		ship.rudderRight();
		ship.rudderAlign();
		ship.raiseFlag();
		ship.shoot();
		ship.stopEngine();
		ship.info();
		ship.dispose();
	}
}

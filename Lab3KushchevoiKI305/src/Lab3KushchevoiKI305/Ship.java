/**
 * Lab3KushchevoiKI305 
 */
package Lab3KushchevoiKI305;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class Ship implements ship
 * 
 * @author Viktor Kushchevoi
 * @version 1.0
 */
public abstract class Ship {
	
	/**
	 * Constructor
	 * @throws FileNotFoundException 
	 */
	public Ship() throws FileNotFoundException {
		engine = new Engine();
		rudder = new Rudder();
		deck = new Deck();
		weight = 50000;
		height = 100;
		fout = new PrintWriter(new File("Log.txt"));
	}
	
	/**
	 * Constructor
	 * 
	 * @param weight
	 * @param height
	 * @param square
	 * @throws FileNotFoundException 
	 */
	public Ship(int weight, int height, int square) throws FileNotFoundException {
		this.weight = weight;
		this.height = height;
		engine = new Engine();
		rudder = new Rudder();
		deck = new Deck(square);
		fout = new PrintWriter(new File("Log.txt"));
	}

	private int weight;
	private int height;
	private Engine engine;
	private Rudder rudder;
	private Deck deck;
	protected PrintWriter fout;
	/**
	 * Method implements engine starting
	 */
	public void startEngine() {
		engine.start();
	}
	
	/**
	 * Method implements engine stopping
	 */
	public void stopEngine() {
		engine.stop();
	}
	
	/**
	 * Method sets speed of ship
	 */
	public void setSpeed(int speed) {
		engine.setSpeed(speed);
	}
	
	/**
	 * Method implements going forward
	 */
	public void rudderAlign() {
		rudder.align();
	}
	
	/**
	 * Method implements turning left
	 */
	public void rudderLeft() {
		rudder.turnLeft();
	}
	
	/**
	 * Method implements turning right
	 */
	public void rudderRight() {
		rudder.turnRight();
	}
	
	/**
	 * Method prints ship's weight
	 */
	public void printWeight() {
		System.out.println("Weight of the sheep = " + weight + "(kg)");
		fout.println("Weight of the sheep = " + weight + "(kg)");
	}
	
	/**
	 * Method prints ship's height
	 */
	public void printHeight() {
		System.out.println("Height of the sheep = " + height + "(m)");
		fout.println("Height of the sheep = " + height + "(m)");
	}
	
	/**
	 * Method prints ship's square
	 */
	public void printSquare() {
		System.out.println("Square of the sheep = " + deck.getSquare() + "(m2)");
		fout.println("Square of the sheep = " + deck.getSquare() + "(m2)");
	}
	
	/**
	 * Method shows ship info
	 */
	public void info() {
		System.out.println("Information about the ship: ");
		fout.println("Information about the ship: ");
		printWeight();
		printHeight();
		printSquare();
	}
	
	/**
	 * Method releases used recourses
	 */
	public void dispose() {
		fout.close();
	}
	
	class Engine {

		/**
		 * Constructor
		 */
		public Engine() {
			speed = 0;
			isStarted = false;
		}
		
		boolean isStarted;
		int speed;

		/**
		 * Method implements engine starting
		 */
		public void start() {
			if (isStarted) {
				System.out.println("Engine already started!");
				fout.println("Engine already started!");
			} else {
				System.out.println("Engine started");
				fout.println("Engine started");
				isStarted = true;
			}
		}

		/**
		 * Method implements engine stopping
		 */
		public void stop() {
			if (isStarted) {
				System.out.println("Engine stopped");
				fout.println("Engine stopped");
				isStarted = false;
			} else {
				System.out.println("Engine is not started!");
				fout.println("Engine is not started!");
			}
		}

		/**
		 * Method sets speed
		 */
		public void setSpeed(int speed) {
			this.speed = speed;
			System.out.println("Speed = " + speed);
			fout.println("Speed = " + speed);
		}
	}

	class Rudder {
		
		/**
		 * Method implements aligning rudder
		 */
		public void align() {
			System.out.println("Rudder is aligned");
			fout.println("Rudder is aligned");
		}

		/**
		 * Method implements turning left
		 */
		public void turnLeft() {
			System.out.println("Rudder is turned left");
			fout.println("Rudder is turned left");
		}

		/**
		 * Method implements turning right
		 */
		public void turnRight() {
			System.out.println("Rudder is turned right");
			fout.println("Rudder is turned right");
		}
	}

	class Deck {

		/**
		 * Constructor
		 */
		Deck() {
			square = 1000;
		}

		/**
		 * Constructor
		 * 
		 * @param square
		 */
		Deck(int square) {
			this.square = square;
		}

		int square;

		/**
		 * @return the square
		 */
		public int getSquare() {
			return square;
		}

		/**
		 * @param square the square to set
		 */
		public void setSquare(int square) {
			this.square = square;
		}
	}

	public void shoot() {
		// TODO Auto-generated method stub
		
	}
}

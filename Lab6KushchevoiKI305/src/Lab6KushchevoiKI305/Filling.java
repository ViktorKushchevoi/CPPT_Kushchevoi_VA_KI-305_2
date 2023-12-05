package Lab6KushchevoiKI305; 

/**
 * Interface representing filling with methods to get capacity and retrieve all information.
 */
public interface Filling extends Comparable<Filling> { 
	/**
	 * Gets the capacity of the filling.
	 * @return The capacity of the filling.
	 */
	int getCapacity();

	/**
	 * Gets a string representation of all information about the filling.
	 * @return A string representation of all information about the filling.
	 */
	String getAllInfo();
}

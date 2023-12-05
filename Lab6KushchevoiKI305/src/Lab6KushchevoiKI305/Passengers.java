package Lab6KushchevoiKI305; 

/**
 * Class representing passengers that implements the Filling interface.
 */
public class Passengers implements Filling { 
	private int numOfSits;
	private int passengers; 
	private int capacity; 
	private int averageWeight;

	/**
	 * Constructs a new Passengers object with the specified number of seats, passengers, and average weight.
	 * @param numOfSeats The total number of seats available.
	 * @param passengers The number of passengers.
	 * @param averageWeight The average weight of each passenger.
	 */
	public Passengers(int numOfSits, int passengers, int averageWeight) { 
		this.numOfSits = numOfSits;
		this.averageWeight = averageWeight;
		
		if (this.passengers > this.numOfSits) 
			this.passengers = this.numOfSits;
		else
			this.passengers = passengers; 
		
		
		this.capacity = this.averageWeight * this.passengers;
	}
	
	/**
	 * method compares this Passengers object with another Filling object based on capacity.
	 * @param o The Filling object to be compared.
	 * @return A negative integer, zero, or a positive integer if this object is less than, equal to, or greater than the specified object.
	 */
	@Override
	public int compareTo(Filling o) {
		Integer s = capacity;
		return s.compareTo(o.getCapacity());
	}
	
	/**
	 * method gets the capacity of the passengers.
	 * @return The capacity of the passengers.
	 */
	@Override
	public int getCapacity() { 
		return this.capacity;
	}
	
	/**
	 * method gets the number of passengers.
	 * @return The number of passengers.
	 */
	public double getNumOfPassengers() { 
		return this.passengers;
	}
	
	/**
	 * method gets all information about the passengers.
	 * @return A string representation of all information about the passengers.
	 */
	@Override
	public String getAllInfo() {
		return "Type: passenger; Number of passenger: " + this.passengers + "; Total weight : " + this.capacity;
	}
}



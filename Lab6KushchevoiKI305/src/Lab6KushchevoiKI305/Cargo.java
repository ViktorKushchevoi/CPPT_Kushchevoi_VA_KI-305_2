package Lab6KushchevoiKI305;

/**
 * Class representing cargo that implements the Filling interface.
 */
public class Cargo implements Filling {
private int carryingCapacity; 
private int capacity; 
private String CargoType;
private static int totalCargoes;

/**
 * Constructs a new Cargo object with the specified type, capacity, and carrying capacity.
 * @param cargoType The type of cargo.
 * @param capacity The actual capacity of the cargo.
 * @param carryingCapacity The maximum carrying capacity of the cargo.
 */

public Cargo(String CargoType, int capacity, int carryingCapacity) {
	this.CargoType = CargoType; 
	this.carryingCapacity = carryingCapacity; 
	if(capacity > this.carryingCapacity)
		this.capacity = this.carryingCapacity; 
	else
		this.capacity = capacity;
	totalCargoes++;
	}

	public static int getTotalCargoes() {
	    return totalCargoes;
	}
	/**
	 * method gets the type of cargo.
	 * @return The type of cargo.
	 */
	public String GetCargoType() {
		return this.CargoType;
	}

	/**
	 * method compares this Cargo object with another Filling object based on capacity.
	 * @param o The Filling object to be compared.
	 * @return A negative integer, zero, or a positive integer if this object is less than, equal to, or greater than the specified object.
	 */
	@Override
	public int compareTo(Filling o) { 
		Integer s = capacity;
		return s.compareTo(o.getCapacity());
	}

	/**
	 * method gets the capacity of the cargo.
	 * @return The capacity of the cargo.
	 */
	@Override
	public int getCapacity() { 
		return this.capacity;
	}

	/**
	 * method gets all information about the cargo.
	 * @return A string representation of all information about the cargo.
	 */
	@Override
	public String getAllInfo() {
		return "Cargo`s type: "+ this.CargoType + "; Total weight : " + this.capacity ;
	}
}

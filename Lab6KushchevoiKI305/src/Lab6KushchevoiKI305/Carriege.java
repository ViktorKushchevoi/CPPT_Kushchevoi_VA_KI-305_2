package Lab6KushchevoiKI305; 
import java.util.ArrayList;

/**
 * The generic class representing a carriage that can hold objects of type T, 
 * where T must extend the Filling interface.
 * 
 * @param <T> The type of objects that can be held by the carriage, must extend Filling.
 */
public class Carriege<T extends Filling> {
	private ArrayList<T> list; // List to store objects in the carriage.
	private int numOfCarriege; // Number of objects in the carriage
	
	public Carriege() {
		list = new ArrayList<T>(); 
		this.numOfCarriege = 0; 
	}
	
	 /**
     * Finds and returns the object with the maximum capacity in the carriage.
     * 
     * @return The object with the maximum capacity, or null if the carriage is empty.
     */
	public T findMax() {
		if (!list.isEmpty()) { 
			T max = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i).compareTo(max) > 0)
					max = list.get(i);
			}
			return max;
		}
		return null;
	}
	
	 /**
     * Attaches an object to the carriage, adds it to the list, and increments the carriage count.
     * 
     * @param carriege The object to be attached to the carriage.
     */
	public void AttachCarriege(T carriege) { 
		list.add(carriege); 
		this.numOfCarriege++; 
		System.out.print("Carriege added: ");
		System.out.println(carriege.getAllInfo());
	}
	
	 /**
     * Gets the number of objects in the carriage.
     * 
     * @return The number of objects in the carriage.
     */
	public int getNumOfCarriege(){
		return this.numOfCarriege;
	}
	
	 /**
     * Detaches an object from the carriage, removes it from the list, and decrements the carriage count.
     * 
     * @param carriege The object to be detached from the carriage.
     */
	
	public void DetachCarriege(T carriege) { 
		list.remove(carriege); 
		this.numOfCarriege--;
	}
}

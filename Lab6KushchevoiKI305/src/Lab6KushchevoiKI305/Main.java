package Lab6KushchevoiKI305;
/**
 * Main class that demonstrates the use of the custom container class and its instances.
 * @author Viktor Kushchevoi
 * @version 1.0
 */
public class Main {
	/**
     * @param args
     */	
	public static void main(String[] args) {
		
		// Add instances of Cargo and Passengers to the container.
		Carriege<? super Filling> carriege = new Carriege<Filling>();
		carriege.AttachCarriege(new Cargo("Electronics", 5000, 6000));
		carriege.AttachCarriege(new Cargo("Clothing", 6000, 6000));
 
		// Find and print the item with the maximum weight in the container.
		Filling res = carriege.findMax();
		main1();
		System.out.println("Total Cargoes: " + Cargo.getTotalCargoes());
	}
	public static void main1() {
		
		// Add instances of Cargo and Passengers to the container.
		Carriege<? super Filling> carriege = new Carriege<Filling>();
		carriege.AttachCarriege(new Cargo("Electronics", 5000, 6000));
		carriege.AttachCarriege(new Cargo("Clothing", 6000, 6000));
		carriege.AttachCarriege(new Cargo("Clothing", 6000, 6000));
	}
}

import java.io.*;
import java.util.*;
/**
 * Клас Lab1KushchevoiKI305 реалізує лабораторну роботу №1
 *
 * @author Viktor Kushchevoi
 * @version 1.0
 * @since version 1.0
 *
 */
public class Lab1KushchevoiKI305 {
	/**
	 * Статичний метод main є точкою входу в програму
	 *
	 * @param args
	 * @throws FileNotFoundException
	 *
	 */	
	public static void main(String[] args) throws FileNotFoundException {
	
		int nRows;
		char[][] arr;
		String filler;
		
		Scanner in = new Scanner(System.in);
		File dataFile = new File("MyFile.txt");
		PrintWriter fout = new PrintWriter(dataFile);
		
		System.out.print("Enter the size of the square matrix  ");
		
		nRows = in.nextInt();
		in.nextLine();

		System.out.print("\nEnter a placeholder symbol ");
		
		filler = in.nextLine();

		if (filler.length() != 1) {
			System.out.print("\nInvalid placeholder character");
			
			fout.flush();
			fout.close();

			return;
		}
		
		int correctNRows = (int) Math.floor(nRows - 2); 
		arr = new char[correctNRows][];
		
		for(int i = 0; i < correctNRows; i++) {
			arr[i]= new char[correctNRows];
		}

		char normalizedFiller = (char) filler.codePointAt(0);
				
		for(int i = 0; i < correctNRows; i++) {
			
			if (i == 0){
				System.out.print("\n");
				fout.print("\n");			
			}
			
			for(int j = 0; j < arr[i].length; j++) {
				if (j == 0){
					System.out.print(" ");
					fout.print(" ");			
				}
				arr[i][j] = normalizedFiller;
				System.out.print(arr[i][j] + " ");
				fout.print(arr[i][j] + " ");
			}

			System.out.print("\n");
			fout.print("\n");
			
		}
		
		fout.flush();
		fout.close();
	}
}

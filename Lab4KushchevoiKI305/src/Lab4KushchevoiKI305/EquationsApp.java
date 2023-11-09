package Lab4KushchevoiKI305;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Клас CalcExeption головний клас програми для обчислення виразу та запису результату у файл
 * @author Viktor Kushchevoi
 * @version 1.0
 */

public class EquationsApp {

    /**
     * Основний метод програми, основна початкова точка програми
     */
    public static void main(String[] args) {
        try
        {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try
            {
                try
                {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    int x = in.nextInt();
                    fout.print(eq.calculate(x));
                    out.print(eq.calculate(x));
                }
                finally
                {
                	//цей блок виконається за будь-яких обставин
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex)
            {
            	//блок перехоплює помилки обчислень виразу
                out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex)
        {
        	//блок перехоплює помилки роботи з файлом навіть якщо вони виникли у блоці finally
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}

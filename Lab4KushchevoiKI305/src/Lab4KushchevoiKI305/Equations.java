package Lab4KushchevoiKI305;

/**
 * Метод реалізації класу для обчислення виразу cos(2x)/ctg(3x-1)
 * @author Viktor Kushchevoi
 * @version 1.0
 */

public class Equations
{
	/**
     * Метод обчислює вираз  cos(2x)/ctg(3x-1)
     *
     * @param x кут у градусах
     * @throws CalcException у випадку, якщо виникають виняткові ситуації під час обчислення
     * @return результат розрахунку
     */
    public double calculate(int x) throws CalcException
    {
        double y, rad;
        rad = x * Math.PI / 180.0; 
        try
        {
            y = Math.cos(2 * rad) * Math.tan(3 * rad - 1);
            //якщо результат не є числом, то генеруємо виключення
            if (Double.isNaN(y) || Double.isInfinite(y) || Double.isInfinite(-y) || x == 90 || x == -90 || 2*x == 90 || 2*x == -90 || 2*x == 270 || 2*x == -270 || x == 0 || x == -180 || x == 180)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            // створимо виключення вищого рівня з поясненням причини виникнення помилки
        	throw new CalcException(
        		    x == 90 || x == -90 || 2 * x == 90 || 2 * x == -90 || 2 * x == 270 || 2 * x == -270 || x == -180 || x == 180
        		        ? "Exception reason: Illegal value of X for cos function"
        		        : x == 0
        		            ? "Exception reason: X = 0"
        		            : "Unknown reason of the exception during calculation"
        		);
        }
        return y;
    }
}



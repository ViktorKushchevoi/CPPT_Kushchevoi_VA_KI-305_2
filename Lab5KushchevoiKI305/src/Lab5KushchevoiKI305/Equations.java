package Lab5KushchevoiKI305;


/**
 * Class <code>Equations</code> implements method for cos(2x)/ctg(3x-1) expression calculation
 * @author  Viktor Kushchevoi
 * @version 1.0
 */
public class Equations
{
	/**
     * Method calculates the cos(2x)/ctg(3x-1)  expression
     * @param x Angle in degrees
     * @throws CalcException
     */

    public double calculate(double x) throws CalcException
    {
        double y, rad;
        rad = x * Math.PI / 180.0; 
        try
        {
            y = Math.cos(2 * rad) * Math.tan(3 * rad - 1);
            if (Double.isNaN(y) || Double.isInfinite(y) || Double.isInfinite(-y) || x == 90 || x == -90 || 2*x == 90 || 2*x == -90 || 2*x == 270 || 2*x == -270 || x == 0 || x == -180 || x == 180)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            if (x == 90 || x == -90 || 2*x == 90 || 2*x == -90 || 2*x == 270 || 2*x == -270 || x == -180 || x == 180)
                throw new CalcException("Exception reason: Illegal value of X for cos function");
            else if (x == 0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during calculation");
        }
        return y;
    }
}






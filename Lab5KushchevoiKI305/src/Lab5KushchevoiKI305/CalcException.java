package Lab5KushchevoiKI305;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author Viktor Kushchevoi
 * @version 1.0
 */
class CalcException extends ArithmeticException
{
    
	public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}

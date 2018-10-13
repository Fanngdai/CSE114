/* 
 * Instance Variable
 * an array of 365 doubles holding a stock value for each day of the year
 * 
 * Methods
 * Constructor - initializes the array elements to 0 explicitly
 * Mutator - sets the stock value for the specified day number
 * Accessor - returns the stock value for the specified day number
 * 
 */

public class StockDataBase {
	
	// An array which holds stock value for each day of array
	double[] stockValue = new double[365];
	
	// Empty constructor that initializes array stockValue to zero
	public StockDataBase()
	{
		// initialize array to 0.0
		for(int i=0; i<365; i++)
			stockValue[i] = 0.0;
	}
	
	// Set
	public void Mutator(int specifiedNumber, double value)
	{
		stockValue[specifiedNumber] = value;
	}
	
	// Get
	public double Accessor(int specifiedNumber)
	{
		return stockValue[specifiedNumber];
	}
}

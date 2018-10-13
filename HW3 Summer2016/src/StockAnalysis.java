import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StockAnalysis {

	public static void main(String args[])
	{
		StockDataBase StockBegin = new StockDataBase();
		StockDataBase StockEnd = new StockDataBase();
		
		try
		{
			Scanner input = new Scanner (new File("values.txt"));
			String [] fileInput = input.nextLine().split(" ");
			
			System.out.println("Stock value ANALYSIS " + fileInput[0]);
			System.out.println("");
			System.out.println("  DATE \t\t Starting \t Ending");
			System.out.println("\t\t Value \t\t Value");
			System.out.println("---------- \t -------- \t -------");
			System.out.println("");
			System.out.println("Number of days with Low Profit margin:\t");
			System.out.println("Number of days with High Profit margin:\t");
			System.out.println("Number of days with Low Loss margin: \t");
			System.out.println("Number of days with High Loss margin\t");
			System.out.println("");
			System.out.println("YEARLY average profit:\t");
			System.out.println("YEARLY average loss:\t");
			System.out.println("");
			System.out.println("Number of days profit is more than YEARLY average profit:\t");
			System.out.println("Number of days loss is more than the YEARLY average loss:\t");
		}
		catch (IOException e)
		{
			System.out.println("Unable to open or read from file.");
		}
	}
}

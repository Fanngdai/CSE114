import java.io.*;
import java.util.Scanner;
public class Lab18_Average {
	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File("test.txt");
		String line = "";
		Scanner input = new Scanner(inputFile);
		int counter = 0;
		int total = 0;
		while(input.hasNextLine()){
			total += input.nextInt();
			counter++;
		}
		System.out.println("Total: " + total);
		System.out.println("Average: " + total/counter);
	}
}

import java.io.*;
import java.util.Scanner;
public class Lab18_Replace {
	public static void main(String[] args){
		File inputFile = new File("input.txt");
		String line = "";
		try {
			Scanner input = new Scanner(inputFile);
			while(input.hasNextLine()){
				line = input.nextLine();
				line = line.replace("Java", "HTML");
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
	}
}
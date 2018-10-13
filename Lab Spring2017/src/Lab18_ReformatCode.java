import java.io.*;
import java.util.Scanner;
public class Lab18_ReformatCode {
	public static void main(String[] args) throws FileNotFoundException{
		String filename = args[0];
		File input = new File(filename);
		Scanner inputFile = new Scanner(input);
		String line = "";
		while(inputFile.hasNextLine()){
			line += inputFile.nextLine();
		}
		line = line.replace("public class Test{", "public class Test{\n");
		System.out.println(line);
	}
}
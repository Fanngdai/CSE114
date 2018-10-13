/*
 * Replace all "HTML" to "JAVA" from file
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Replace {
	public static void main(String[] args){
		try{
			File file = new File("html.txt");
			FileReader reader = new FileReader(file);
			String word = reader.toString();

			for(int i=0; i<word.length()-3; i++){
				if(word.substring(i,i+4).equalsIgnoreCase("Html")){
					word.substring(i,i+4).replace(word.substring(i,i+4), "Java");
				}
			}
			System.out.print(word);
		}
		catch(FileNotFoundException ex){
			System.out.print("File could not be found");
		}
	}
}
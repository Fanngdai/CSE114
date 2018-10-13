import java.util.ArrayList;
import java.util.Scanner;

/*
 * Lab 16 part 4
 */
public class Lab16_4 {
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList list3 = new ArrayList();
		list3 = list1;
		while(!list2.isEmpty()){
			list3.add(list2.get(0));
			list2.remove(0);
		}
		return list3;
	}
	
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		System.out.print("Enter five integers for list1: ");
		for(int i=0; i<5; i++)
			list1.add(stdin.nextInt());
		System.out.print("Enter five integers for list2: ");
		for(int i=0; i<5; i++)
			list2.add(stdin.nextInt());
		System.out.print("The combined list is " + union(list1, list2));
	}
}
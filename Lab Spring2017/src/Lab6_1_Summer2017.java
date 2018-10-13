/*
 * Summer2017 Lab
 * 
 * (Strictly identical arrays) The arrays list1 and list2 are strictly identical if their corresponding elements are equal. 
 * Write a method that returns true if list1 and list2 are strictly identical, using the following header:
 * public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter two lists of integers and displays whether the two are strictly identical.
 * Here are the sample runs. Note that the first number in the input indicates the number of the elements in the list. This number
 * is not part of the list.
 */
public class Lab6_1_Summer2017 {
	public static boolean equals(int[] list1, int[] list2){
		// Checks the size. If they are not the same, it is not the same
		if(list1.length != list2.length)
			return false;
		// Check individually for each element in array. Return false if at a certain spot, they are not the same.
		for(int i=0; i<list1.length; i++){
			if(list1[i] != list2[i])
				return false;
		}
		// If all are fine, return true.
		return true;
	}

	public static void main(String[] args){
		// 3 list. Which, list1 and list2 are the identical and list3 is not.
		int[] list1 = {1,2,3,4,5};
		int[] list2 = {1,2,3,4,5};
		int[] list3 = {2,3,4,5};

		// Checks if list1 and list2 are the same or not (They are!)
		if(equals(list1,list2))
			System.out.println("List1 and List2 are identical! (correct)");
		else
			System.out.println("List1 and List2 are not identical! (wrong)");

		// Checks if list1 and list3 are the same or not (They are not!)
		if(equals(list1,list3))
			System.out.println("List1 and List3 are identical! (wrong)");
		else
			System.out.println("List1 and List3 are not identical! (correct)");
	}
}
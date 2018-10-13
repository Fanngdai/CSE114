/*
 * Summer2017 Lab
 * 
 * (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are closed on 
 * the first day of school. As the students enter, the first student, denoted S1, opens every locker. 
 * Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker. 
 * Student S3 begins with the third locker and changes every third locker (closes it if it was open, and 
 * opens it if it was closed). Student S4 begins with locker L4 and changes every fourth locker. Student 
 * S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.
 * After all the students have passed through the building and changed the lockers, which lockers are open? 
 * Write a program to find your answer and display all open locker numbers.
 * (Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open (true) or 
 * closed (false). Initially, all lockers are closed.)
 */
public class Lab6_2_Summer2017 {
	public static void main(String[] args) {
		// All 100 elements are false here. (default)
		boolean[] lockers = new boolean[100];
		// Open and close accordingly
		for (int student = 1; student <= 100; student++) {
			shuffle(lockers, student);
		}
		// Print the lockers that are open. (True)
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i]) {
				System.out.println("L" + (i+1));
			}
		}
	}

	public static void shuffle(boolean[] lockersOpenState,  int start) {
		// Which index to start with
		int nextLocker = start;
		// Change the boolean value for all elements skipping start amount
		for (int i = start - 1; i < lockersOpenState.length; i += nextLocker) {
			lockersOpenState[i] = !lockersOpenState[i];
		}
	}
}
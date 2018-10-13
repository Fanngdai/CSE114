/*
 * Lab 9 part 2 - Timing execution
 * Write a program that randomly generates an array of 100,000 integers
 * and a key. Estimate the execution time of invoking the linear method
 * from the lecture notes. Sort the array and estimate the execution 
 * time of invoking the binarySearch method from the lecture notes. You
 * can use the follwing code template to obtain the execution time:
 * 
 * perform the task
 * long startTime = System.currentTimeMillis();
 * long endTime = System.currentTimeMillis();
 * long executionTime = endTime - startTime;
 */
public class Lab9_2 {
	/** The method for sorting numbers */
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) { 
					currentMin = list[j];
					currentMinIndex = j;
				} 
			}
			// Swap list[i] with list[currentMinIndex] if necessary; 
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	/** Use binary search to find the key in the list */
	public static int binarySearch(int[] list, int key) {
	int low = 0;
	int high = list.length - 1; while (high >= low) {
	    int mid = (low + high) / 2;
	    if (key < list[mid])
	high = mid - 1;
	else if (key == list[mid])
	      return mid;
	    else
	low = mid + 1; }
	  return -1 - low;
	}
	
	public static void main(String[] args)
	{
		int[] array = new int[100000];

		// Fills the array with random numbers
		for(int i=0; i<100000; i++)
		{
			array[i] = (int)(Math.random()*100000);
		}
		
		long startTimeBinarySearch = System.currentTimeMillis();
		int key = (int)Math.random();
		binarySearch(array, key);
		long endTimeBinarySearch = System.currentTimeMillis();
		
		long startTimeSelectionSort = System.currentTimeMillis();
		selectionSort(array);
		long endTimeSelectionSort = System.currentTimeMillis();

		System.out.println("Binary Search " + (endTimeBinarySearch - startTimeBinarySearch));
		System.out.println("Selection sort " + (endTimeSelectionSort - startTimeSelectionSort));
	}
}
/*
 * Ordering array without using temp
 */
public class array {
	public static void reorder(int[] arr, int[] index){
		for(int i=0; i<arr.length; i++){
			if(index[i]!=i){
				arr[i] += arr[index[i]];
				arr[index[i]] = arr[i] - arr[index[i]];
				arr[i] -= arr[index[i]];

				index[index[i]] = index[i];
				index[i] = i;
			}
		}
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	public static void main(String[] args){
		// 40, 60, 90, 50, 70
		int[] arr = {50, 40, 70, 60, 90};
		int[] index = {3, 0, 4, 1, 2};
		// 11, 10, 12
		int[] arr2 = {10, 11, 12};
		int[] index2 = {1,  0,  2};

		reorder(arr,index);
		System.out.println();
		reorder(arr2,index2);
	}
}
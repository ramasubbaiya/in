package A8;

public class BinarySearch {

	// Write a function to find a number from a large array of integer numbers in sorted order.
	private static int find(int[] sortedArray, int x) {
		int min = 0, // start
			max = sortedArray.length - 1; // end
		
		while(min <= max) {
			int mid = min + (max - min)/2;
			if(sortedArray[mid] == x) {
				return mid;
			}
			
			if(sortedArray[mid] > x) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
				
		return -1;
	}
	
	// Execute the program
	public static void main(String[] args) {
		// Example of input array: 3, 9, 45, 97, 1001, 1034, 1234, 1362, 9000, 10001, 10067, 12098. 
		// Note that the input array can be very large containing thousands or hundreds of thousands of numbers.
		int[] array = new int[]{3, 9, 45, 97, 1001, 1034, 1234, 1362, 9000, 10001, 10067, 12098};
		
		int index = find(array, 1001);
		System.out.println("Number found in index : " + index);
	}
}

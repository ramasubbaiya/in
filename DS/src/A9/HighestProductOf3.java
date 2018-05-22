package A9;

import java.util.Arrays;

public class HighestProductOf3 {

	// O(n log(n)) solution
	public static int getMaxProd(int[] arrayOfInts) {
		
		if(arrayOfInts.length > 2) {
			Arrays.sort(arrayOfInts);
			System.out.println(Arrays.toString(arrayOfInts));
			int size = arrayOfInts.length - 1;
			int maxProduct = Math.max(
					arrayOfInts[size]*arrayOfInts[size-1]*arrayOfInts[size-2], // last 3 numbers (positive * positive * positive)
					arrayOfInts[size]*arrayOfInts[0]*arrayOfInts[1] // first 2 numbers(negative * negative - positive, last positive number)
							);
			return maxProduct;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(getMaxProd(new int[]{6, 5, 1, -12, -11, -10, -1, 3, -4}));
	}
}

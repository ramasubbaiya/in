package A9;

import java.util.Arrays;

/**
 * Merge two sorted arrays
 * @author Rama
 *
 */
public class MergeTwoSortedArrays {
	
	public static int[] mergeArr(int a[], int b[]) {
		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, r = 0;
		
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				result[r] = a[i];
				i++;
			} else {
				result[r] = b[j];
				j++;
			} 
			r++;
		}
		
		while(i < a.length) {
			result[r] = a[i];
			i++;
			r++;
		}
		
		while(j < b.length) {
			result[r] = b[j];
			j++;
			r++;
		}
		
		return result;
	}
		
	public static void main(String[] args) {
		int[] resultArr = mergeArr(new int[] { 4, 5, 7 }, new int[] { 1, 2, 3, 9 });
		System.out.println(Arrays.toString(resultArr));
	}
}

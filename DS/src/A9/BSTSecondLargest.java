package A9;

public class BSTSecondLargest {

	private static int searchInBST(int[] sortedArr, int x) {
		int p = 0, q, r = sortedArr.length;
		while(p <= r) {
			q = (p + r)/2;
			if(sortedArr[q] == x) {
				return q;
			}
			if(sortedArr[q] < x) {
				p = q + 1;
			} else if(sortedArr[q] > x) {
				r = q - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(searchInBST(new int[]{1, 2, 3, 5, 6, 7, 8, 9}, 2));
	}
	
}

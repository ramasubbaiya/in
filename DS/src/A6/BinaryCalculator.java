package A6;

public class BinaryCalculator {

	// Get two binary values and add
	private static void add(int[] a, int[] b) {
		System.out.println("Result ");
		System.out.println(getIntFromBinaryArr(a) + getIntFromBinaryArr(b));
	}

	// Get two binary values and subtract
	private static void subtract(int[] a, int[] b) {
		System.out.println("Result ");
		System.out.println(getIntFromBinaryArr(a) - getIntFromBinaryArr(b));
	}

	// Get two binary values and divide	
	private static void divide(int[] a, int[] b) {
		System.out.println("Result ");
		System.out.println(getIntFromBinaryArr(a) / getIntFromBinaryArr(b));
	}

	// Get two binary values and multiply
	private static void multiply(int[] a, int[] b) {
		System.out.println("Result ");
		System.out.println(getIntFromBinaryArr(a) * getIntFromBinaryArr(b));
	}

	private static int getIntFromBinaryArr(int[] input) {
		int sum = 0;
		if (input.length == 8) {
			for (int i = 1; i <= input.length; i++) {
				sum += (input[i-1] * Math.pow(2, input.length - i)); // Eg: 10000000 -> 1 * Math.pow(2, 7) -> 1 * 2^7 = 128
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// Mqximum 8 bit in integer is 255 characters
		// 11111111 (binary) = 255 (decimal)
		int[] a = new int[] {1,0,0,0,1,0,1,1}; // 139 
		int[] b = new int[] {0,1,0,1,0,0,1,1}; // 83
		BinaryCalculator.add(a, b); // 222
		BinaryCalculator.subtract(a, b); // 56
		BinaryCalculator.divide(a, b); // 1
		BinaryCalculator.multiply(a, b); // 11537
	}
}
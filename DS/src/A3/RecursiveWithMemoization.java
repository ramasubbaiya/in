package A3;

public class RecursiveWithMemoization {

	static int count = 0; // count param to know the no. of iteration
	static int[] fibnacciArr = new int[100]; // maximum value that can be given to array or is 100
	
	// Fibonacci with memorization of pre-calculated data
	public static int fibonacci(int n) {
		count++;
		if(fibnacciArr[n] == 0) {
			if(n == 0) {
				fibnacciArr[n] = 0;
			} else if(n == 1) {
				fibnacciArr[n] = 1;
			} else {
				fibnacciArr[n] = fibonacci(n-1) + fibonacci(n-2);
			}
			return fibnacciArr[n];
		} else {
			return fibnacciArr[n];
		}
	}
	
	
	// Testing the outputs
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
		System.out.println(count); // count for fibonacci without memoization is 177, where as here we have a lot improved result of 19
	}
}

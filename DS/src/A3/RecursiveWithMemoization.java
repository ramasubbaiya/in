package A3;

public class RecursiveWithMemoization {

	// count param to know the no. of iteration
	static int count = 0;
	
	// Fibonacci with memorization of pre-calculated data
	public static int fibonacci(int n) {
		int[] fibnacciArr = new int[100];
		System.out.println(n);
		if(fibnacciArr[n] == 0) {
			count++;
			if(n == 0) {
				fibnacciArr[0] = 0;
				return 0;
			} else if(n == 1) {
				fibnacciArr[1] = 1;
				return 1;
			} else {
				fibnacciArr[n] = fibonacci(n-1) + fibonacci(n-2);
				return fibnacciArr[n];
			}
		} else {
			System.out.println("sdsd");
			return fibnacciArr[n];
		}
	}
	
	
	// Testing the outputs
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
		System.out.println(count);
	}
}

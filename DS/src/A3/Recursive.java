package A3;

public class Recursive {

	public static int decrement(int n) {
		//System.out.println(n);
		if(n == 1) {
			return 1;
		}
		return decrement(n-1);
	}
	
	/**
	 * DISADVANTAGES OF THIS APPROACH
	 * 
	 * The result is stored in int which can handle only a first 48 fibonacci numbers, 
	 * after this the integer fill minus bit and result is wrong.
	 * 
	 * 	You never can run fibonacci(50)
	 *  The problem is that the it calls fibonacci not 50 times but much more.
	 * 
	 * At first it calls fibonacci(49)+fibonacci(48),
	 * next fibonacci(48)+fibonacci(47) and fibonacci(47)+fibonacci(46)
	 * Each time it became fibonacci(n) worse, so the complexity is exponential.
	 * 
	 * FIX WITH MEMOIZATION
	 */
	static int count;
	public static int fibonacci(int n) {
		count++;
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(decrement(10));
		System.out.println(fibonacci(10));
		System.out.println(count);
	}
}

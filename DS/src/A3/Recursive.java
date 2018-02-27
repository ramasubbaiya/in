package A3;

public class Recursive {

	public static int decrement(int n) {
		//System.out.println(n);
		if(n == 1) {
			return 1;
		}
		return decrement(n-1);
	}
	
	public static int fibonacci(int n) {
		System.out.println(n);
		if(n == 1) {
			return 1;
		}
		if(n == 0) {
			return 0;
		}
		return n = fibonacci(n-1) * fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(decrement(10));
		System.out.println(fibonacci(10));
	}
}

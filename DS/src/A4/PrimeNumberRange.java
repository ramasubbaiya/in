package A4;

public class PrimeNumberRange {

	public static boolean[] findPrimeNumberBySeiveMethod(int toNumber) {
		boolean[] primeNumbers = new boolean[toNumber+1];
		
		// let us assume all the numbers till the range are prime numbers
		for(int i = 0; i < toNumber; i++) {
			primeNumbers[i] = true;
		}
		
		// Square root of given number
		int sqrt = (int) Math.sqrt(toNumber);
		
		// traverse from 2 to square root
		for(int i = 2; i <= sqrt; i++ ) {
			// only if its a prime number
			if(primeNumbers[i]) {
				for(int j = i+i; j < toNumber; j += i) {
					// only if its a prime number, change it to not a prime
					if(primeNumbers[j]) {
						// To know the how the result looks like
						//System.out.println(" Number : " + j + " X Multiplied by : " + i);
						primeNumbers[j] = false;
					}
				}
			} 
		}
		return primeNumbers;
	}
	
	// prime the prime numbers
	public static void printPrimeNumbers(boolean[] primeNumbers) {
		for(int i = 1; i < primeNumbers.length; i++) {
			if(primeNumbers[i]) {
				System.out.println(i);
			}
		}
	}
	
	// Execute the program
	public static void main(String[] args) {
		printPrimeNumbers(findPrimeNumberBySeiveMethod(200));
	}
}
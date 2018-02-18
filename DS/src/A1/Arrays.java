package A1;

public class Arrays {

	// print content of array from given array
	private static void print(int[] numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
	}

	// store array with given size, where value of each index is index plus one
	private static int[] storeArray(int size) {
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		return numbers;
	}

	// find the repeated number from the given array
	private static int getRepeatedNumber(int[] inputArr) {
		boolean[] boolArr = new boolean[50];

		for (int i = 0; i < boolArr.length; i++) {
			if (1 <= inputArr[i] && inputArr[i] <= 49) {
				if (!boolArr[inputArr[i]]) {
					boolArr[inputArr[i]] = true;
				} else {
					return i;
				}
			}
		}
		return -1;
	}

	// main method - execution starts here
	public static void main(String[] args) {
		//1. Store 1 to 50 in an array. Print content of the array.
		int[] result = storeArray(50);
		print(result);

		//2. An array of size 50 stores numbers in range 1 to 49. Only one number is repeated. Find repeated number.
		int[] newArr = new int[50];
		newArr[0] = 1;
		newArr[1] = 3;
		newArr[2] = 4;
		newArr[3] = 10;
		newArr[4] = 5;
		newArr[5] = 5;

		int repeatedNumber = getRepeatedNumber(newArr);
		System.out.println(repeatedNumber == -1 ? "There is no repeated number" : "The repeated number : " + repeatedNumber);
	}
}

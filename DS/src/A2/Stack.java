package A2;

/**
 * Implementing Stack DS
 * @author Rama
 */
public class Stack {

	int size = 0; // Size of the stack
	int count = -1; // To hold the pointer for the current value and measure the size of the stack
	int[] stackArr = null; // Initialize stack array
	
	// Constructor with the size
	public Stack(int size) {
		stackArr = new int[size];
	}
	
	// Insert a value to the stack
	public void push(int x) {
		if(!isFull()) {
			count++; // increase the size
			stackArr[count] = x;
		} else { // if its full error out 
			System.err.println("Stack is Full");
		}
	}
	
	// Get the last value from the stack
	public int pop() {
		int temp = -1;
		if(!isEmpty()) {
			temp = stackArr[count];
			count--; // decrease the size
		} else { // if its empty error out 
			System.err.println("Stack is Empty");
		}
		return temp;
	}
	
	// check to see the stack is empty
	public boolean isEmpty() {
		return (count == -1);
	}

	// check to see the stack is full
	public boolean isFull() {
		return (stackArr.length == count);
	}
}

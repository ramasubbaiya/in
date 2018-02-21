package A2;

public class Stack {

	int size = 0;
	int count = -1;
	int[] stackArr = null;
	
	public Stack(int size) {
		stackArr = new int[size];
	}
	
	public void push(int x) {
		if(!isFull()) {
			count++;
			stackArr[count] = x;
		} else {
			System.err.println("Stack is Full");
		}
	}
	
	public int pop() {
		int temp = -1;
		if(!isEmpty()) {
			temp = stackArr[count];
			count--;
		} else {
			System.err.println("Stack is Empty");
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return (count == -1);
	}

	public boolean isFull() {
		return (stackArr.length == count);
	}
}

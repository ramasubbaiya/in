package A2.Eg2;

public class Stack<T> {
	private static int MAX_SIZE = 100;
	
	private Node<T> top;
	private int size = 0;
	
	private void push(T data) {
		if(!isFull()) {
			Node newNode = new Node(data, top);
			top = newNode;
			size++;
		}
	}
	
	private T pop() {
		if(!isEmpty()) {
			size--;
			T data = top.getData();
			top = top.getNext();
			return data;
		}
		return null;
	}
	
	private Node<T> peek() {
		return top;
	}
	
	private boolean isEmpty() {
		return size == 0;
	}
	
	private boolean isFull() {
		return size == MAX_SIZE;
	}
}

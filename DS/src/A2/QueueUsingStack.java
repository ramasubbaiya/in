package A2;

/**
 * Implementing Queue using Two Stacks
 * @author Rama
 *
 */
public class QueueUsingStack {

	Stack s1 = null;
	Stack s2 = null;
	
	// size of the Stacks
	int size = 0;
	
	// constructor with two stacks
	public QueueUsingStack(int size) {
		this.s1 = new Stack(size);
		this.s2 = new Stack(size);
	}
	
	// insert value to the Queue
	public void enqueue(int x) {
		s1.push(x);
	}
	// get the first value from the Queue	
	public int dequeue() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return this.s2.pop();
	}
	
	public static void main(String[] args) {
		// Testing Queue using Stack with inserting three values
		QueueUsingStack q = new QueueUsingStack(10);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

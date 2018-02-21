package A2;

public class QueueUsingStack {

	Stack s1 = null;
	Stack s2 = null;
	int size = 0;
	
	public QueueUsingStack(int size) {
		this.s1 = new Stack(size);
		this.s2 = new Stack(size);
	}
	public void enqueue(int x) {
		this.s1.push(x);
	}
	
	public int dequeue() {
		while(!s1.isEmpty()) {
			this.s2.push(this.s1.pop());
		}
		return this.s2.pop();
	}
	
	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack(10);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

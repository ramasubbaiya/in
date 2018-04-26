package A2.QueueProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * Reverse a queue using Stack
 * @author Rama
 *
 */
public class ReverseQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		Queue<Integer> reversedQueue = reverseQueue(queue);
		
		// print queue by dequeuing the elements of the queue
		while(!reversedQueue.isEmpty()) {
			System.out.println(reversedQueue.remove());
		}
	}

	/**
	 * This method uses stack internally to reverse the queue
	 * @param queue
	 * @return Queue
	 */
	private static Queue<Integer> reverseQueue(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		
		return queue;
	}

}

package A9;

/**
 * Find the middle node of the linked list
 * Assume the linked list is Odd number
 * @author Rama
 *
 */
public class FindMiddleInLinkedList {
	
	/**
	 * Initialize <b>mid element as head</b> and initialize a <b>counter as 0</b>.
	 * 
	 * Traverse the list from head, while traversing increment the counter and change
	 * mid to mid->next whenever the counter is odd
	 * So the mid will move only half of the total length of the list
	 */
	public Node findMiddle(Node head) {
		int count = 0;
		Node mid = head;
		
		while(head != null) {
			// assuming the list is odd
			// update mid, when 'count' is odd number
			if(count%2 == 1) {
				mid = mid.next; // visually, the mid 
			}
			
			count++;
			head = head.next;
		}
		
		return mid;
	}
	
	/**
	 * Traverse linked list using <b>two pointers</b>.
	 * 
	 * Move one pointer by one and other pointer by two.
	 * When the fast pointer reaches the end, slow pointer will 
	 * reach middle of the linked list 
	 */
	public Node findMiddle2(Node head) {
		
		Node twoSteps = head;
		Node oneStep = head; // this will find the mid of the linked list
		
		while(twoSteps != null && twoSteps.next != null) {
			oneStep = oneStep.next;
			twoSteps = twoSteps.next.next; // if its last then this will be null
		}

		return oneStep;
	}
	
	/**
	 * Create a node class with data and Node
	 */
	class Node {
		int data;
		Node next = null;
	}
}

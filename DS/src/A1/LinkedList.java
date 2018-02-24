package A1;

/**
 * Implementing Linked List
 * @author Rama
 */
public class LinkedList {

	int count = -1;
	Node firstNode = null;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			firstNode = newNode;
		} else {
			Node tempNode = firstNode;
			firstNode = newNode;
			newNode.next = tempNode;
		}
		count++;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			firstNode = newNode;
		} else {
			Node currentNode = firstNode;
			// loop to end of the list
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			// attach new node to the end of the list
			currentNode.next = newNode;
		}
	}
	
	public void delete(int data) {
		Node currentNode = firstNode;
		if(firstNode.data == data) {
			firstNode = firstNode.next;
		} else {
			Node previousNode = null;
			// loop to end of the list
			while(currentNode.next != null) {
				if(currentNode.data == data) {
					previousNode.next = currentNode.next;
				}
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
		}
	}
	
	public void displayList() {
		if(isEmpty()) {
			System.err.println("List is empty");
		} else {
			Node currentNode = firstNode;
			while(currentNode.next != null) {
				System.out.println(" { Node : " + currentNode + ", Data : " + currentNode.data + " } ");
				currentNode = currentNode.next;
			}
			System.out.println(" { Node : " + currentNode + ", Data : " + currentNode.data + " } "); // last node with next node null
		}
	}
	
	public boolean isEmpty() {
		return (firstNode == null);
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertFirst(4);
		list.insertFirst(3);
		list.insertFirst(5);
		list.displayList();
		System.out.println();
		list.delete(5);
		list.displayList();
	}
}

/**
 * 
 * @author Rama
 *
 */
class Node {
	int data;
	Node next = null;
}
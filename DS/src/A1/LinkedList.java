package A1;

/**
 * Implementing Linked List
 * @author Rama
 */
public class LinkedList {

	Node headNode = null;
	
	// Insert element in the first and point the firstNode to this newly created node
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = headNode;
		headNode = newNode;
	}
	
	// Delete first element from the list
	public void deleteFirst() {
		Node tempNode = headNode;
		headNode = tempNode.next;
	}

	// Insert element in the end of the list
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		Node currentNode = headNode;
		// loop to end of the list
		while (currentNode != null) {
			currentNode = currentNode.next;
		}		
		currentNode = newNode;
	}
	
	// Delete element based on the element provided
	public void delete(int data) {
		Node currentNode = headNode;
		
		// Data found in the first node
		if(headNode.data == data) {
			headNode = headNode.next;
		} else { // Data found in other nodes
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
	
	// display the whole list
	public void displayList() {
		if(isEmpty()) {
			System.err.println("List is empty");
		} else {
			Node currentNode = headNode;
			while(currentNode != null) {
				System.out.println(" { Node : " + currentNode + ", Data : " + currentNode.data + " } ");
				currentNode = currentNode.next;
			}
			System.out.println(" -------------------------------------------------------------------- ");
		}
	}
	
	// check linked list is empty
	public boolean isEmpty() {
		return (headNode == null);
	}
	
	// Test the above methods
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		// Store 1 to 50 in linked list
		for(int i=1; i<=50;i++) {
			list.insertFirst(i);
		}
		list.displayList();
		
		// Delete first element from the list
		list.deleteFirst();
		list.displayList();
		System.out.println();
		
		// Delete 49 from the list
		list.delete(49);
		System.out.println();
		list.displayList();
		
		
	}
}

/**
 * Create a node class with data and Node
 */
class Node {
	int data;
	Node next = null;
}
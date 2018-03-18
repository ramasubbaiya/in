package A5;

/**
 * Implementing Binary Search Tree
 * Binary trees are always sorted
 * @author Rama
 *
 */
public class BinarySearchTree {

	Node root = null;
	int[] array = null;
	int count = -1;
	
	public BinarySearchTree(int size) {
		array = new int[size];
	}
	
	public Node search(int value) {
		if(root != null)
		return root.find(value);
		return null;
	}
	
	public void insert(int value) {
		if(root == null) {
			this.root = new Node(value);
		} else {
			root.insert(value);
		}
		
	}
	
	public void traverseInOrder() {
		if (this.root != null)
			this.root.traverseInOrder();
		System.out.println();
	}

}

class Node {
	Node leftNode;
	Node rightNode;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node find(int data) {
		if(this.data == data) // found in the root on the first iteration
			return this;
		
		if(data < this.data && leftNode != null)
			return leftNode.find(data); // data is smaller
		if(rightNode != null) 
			return rightNode.find(data); // data is larger
		
		return null; // not found
	}
	
	public void insert(int data) {
		if(data >= this.data) {
			if(rightNode == null) { // end clause
				rightNode = new Node(data); // insert data to the right child
			} else {
				rightNode.insert(data); // recursively insert data into the right child
			}
		} else {
			if(leftNode == null) {
				leftNode = new Node(data); // insert data to the left child
			} else {
				leftNode.insert(data); // recursively insert data into the left child
			}
		}
	}
	
	public void traverseInOrder() {
		if (this.leftNode != null)
			this.leftNode.traverseInOrder();
		System.out.print(this + " ");
		if (this.rightNode != null)
			this.rightNode.traverseInOrder();
	}
	
	public void delete(int data) {
		// case 1: node to be deleted is a leaf node
		// case 2: node to be deleted has one child node
		// case 3: node to be deleted has two children
	}
}

package A5;

import sun.misc.Queue;


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
	
	public void preOrderTraversal(Node root) {
		if(root == null) return;
		
		System.out.println(root.data);
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);		
	}
	
	public void inOrderTraversal(Node root) {
		if(root == null) return;
		
		inOrderTraversal(root.leftChild);
		System.out.println(root.data);
		inOrderTraversal(root.rightChild);
	}
	
	public void postOrderTraversal(Node root) {
		if(root == null) return;
		
		postOrderTraversal(root.leftChild);
		postOrderTraversal(root.rightChild);
		System.out.println(root.data);
	}

	
	public void breathFirstTraversal() throws InterruptedException {
		if(root == null) return;
		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			Node node = queue.dequeue();
			System.out.println(node.data);
			
			if(node.leftChild != null) {
				queue.enqueue(node.leftChild);
			}
			
			if(node.rightChild != null) {
				queue.enqueue(node.rightChild);
			}
		}
	}

}

class Node {
	Node leftChild;
	Node rightChild;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node find(int data) {
		if(this.data == data) // found in the root on the first iteration
			return this;
		
		if(data < this.data && leftChild != null)
			return leftChild.find(data); // data is smaller
		if(rightChild != null) 
			return rightChild.find(data); // data is larger
		
		return null; // not found
	}
	
	public void insert(int data) {
		if(data >= this.data) {
			if(rightChild == null) { // end clause
				rightChild = new Node(data); // insert data to the right child
			} else {
				rightChild.insert(data); // recursively insert data into the right child
			}
		} else {
			if(leftChild == null) {
				leftChild = new Node(data); // insert data to the left child
			} else {
				leftChild.insert(data); // recursively insert data into the left child
			}
		}
	}
	
	public void delete(int data) {
		// case 1: node to be deleted is a leaf node
		// case 2: node to be deleted has one child node
		// case 3: node to be deleted has two children
	}
}

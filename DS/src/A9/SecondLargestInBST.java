package A9;

/**
 * Find the 2nd largest element in a given tree.
 * 
 * @author Rama
 *
 */
public class SecondLargestInBST {

	public Node secondLargest(Node root, int count) {
		
		// Base cases, the second condition is important to
		// avoid unnecessary recursive calls
		if(root == null || count >= 2) {
			return null;
		}
		
		// Follow reverse inorder traversal so that the
		// largest element is visited first
		secondLargest(root.rightChild, count);
		
		// Increment the count of visited nodes
		count++;
		
		// If count becomes k now, then this is the 2nd largest
		if(count == 2) {
			return root;
		}
		
		// Recursion, for the left subtree
		secondLargest(root.leftChild, count);
		
		return null;
	}
	
	class Node {
		Node leftChild;
		Node rightChild;
		int data;
	}
	
}

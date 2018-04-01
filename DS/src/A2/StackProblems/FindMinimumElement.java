package A2.StackProblems;

import java.util.Stack;

/**
 * Find minimum element in constant time even after popping
 * @author Rama
 *
 */
public class FindMinimumElement {

	static Stack<Integer> originalStack = new Stack<Integer>();
	static Stack<Integer> minimumStack = new Stack<Integer>();
	
	
	static void push(int element) {
		
		int minimum = element;
		
		if(!minimumStack.isEmpty()) {
			if(minimum > minimumStack.peek()) {
				minimum = minimumStack.peek();
			}
		}

		originalStack.push(element);
		minimumStack.push(minimum);
	}
	
	// pop the last added element (pop on both the stacks)
	static int pop() {
		minimumStack.pop();
		return originalStack.pop(); // throw exception if empty
	}
	
	// check the minimum value
	static int getMinimum() {
		return minimumStack.peek();
	}
}

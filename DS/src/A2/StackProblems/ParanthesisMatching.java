package A2.StackProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Check the string has matching parenthesis(opening and closing) in order
 * 
 * Write a boolean function to check this
 * 
 * Input			Output
 * (te[st{ww}]) 	true
 * te[st{ww}]) 		false
 * (te[st{ww}]		false
 * 
 * @author Rama
 *
 */
public class ParanthesisMatching {
	private static Map<Character, Character> matchingParenthesis = new HashMap<Character, Character>();
	
	static {
		matchingParenthesis.put('}', '{');
		matchingParenthesis.put(')', '(');
		matchingParenthesis.put(']', '[');
	}
	
	static boolean isParanthesisMatching(String str) {
		Stack<Character> paranStack = new Stack<Character>();
		try {
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(matchingParenthesis.containsValue(ch)) { // opening parenthesis
					// push the opening parenthesis to the stack
					paranStack.push(ch);
				}
				
				// check for closing parenthesis
				if(matchingParenthesis.containsKey(ch)) {
					Character lastParen = paranStack.pop();
					if(lastParen !=matchingParenthesis.get(ch)) { // check if opening paren is equal to opening, matchingParenthesis.get(ch) -> gets the opening value by passing the closing paren
						return false;
					}
				}
			}
			return paranStack.isEmpty(); // if its empty then we dont have any unmatched chars
		} catch(Exception e) {
			System.err.println("ERROR : " + e.getMessage());
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isParanthesisMatching("[sd:(f{}s)df]"));
	}
}

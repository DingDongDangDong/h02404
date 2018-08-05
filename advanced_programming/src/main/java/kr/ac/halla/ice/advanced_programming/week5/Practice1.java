package kr.ac.halla.ice.advanced_programming.week5;

import java.util.Stack;

/**
 * Stack parentheses expression test
 * 
 * Week 5-1
 * 
 * @author jack
 *
 */
public class Practice1 {

	public static void main(String[] args) {

		String expression = "((3+5)-1)";

		Stack<Character> parentheses = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c == '(')
				parentheses.push(c);
			else if (c == ')') {
				// check top
				boolean isEmpty = parentheses.isEmpty();
				if (isEmpty) {
					System.out.println("It is not an expression");
					break;
				}
				parentheses.pop();
			}
		}
		int size = parentheses.size();
		System.out.println(size);
	}
}

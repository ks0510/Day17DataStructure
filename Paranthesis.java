/*
 * This java program check the given paranthesis is balanced or not.
 */
package datastructureprogram;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

class Node2<T> {

	T data;
	Node2<T> link;
}

/*
 * Class to define stack operations method in it
 */
class StackNew2<T> {

	Node2<T> top;

	/*
	 * To define constructor which save value of top of stack
	 */
	public StackNew2() {
		super();
		this.top = top;
	}

	/*
	 * To define push method
	 */
	public void push(T x) {

		/*
		 * To create node object for new node
		 */
		Node2<T> temp = new Node2<>();

		/*
		 * To check stack fully filled or not
		 */
		if (temp == null) {
			System.out.println("Stack Overflow");
			return;
		}
		temp.data = x;
		temp.link = top;
		top = temp;
	}

	/*
	 * To check stack is empty or not
	 */
	public boolean isEmpty() {
		return top == null;
	}

	public T peek() {
		/*
		 * check for empty stack
		 */
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			Object obj = (int) -1;
			return (T) obj;
		}
	}

	/*
	 * Utility function to pop top element from the stack
	 */
	public void pop() {
		/*
		 * To check for stack underflow
		 */
		if (top == null) {
			System.out.println("Stack Underflow");
			return;
		}

		/*
		 * To update the top pointer to point to the next node
		 */
		top = (top).link;
	}

	public void display() {
		/*
		 * check for stack underflow
		 */
		if (top == null) {
			System.out.println("Stack Underflow");
			return;
		} else {
			Node2<T> temp = top;
			while (temp != null) {

				/*
				 * print node data
				 */
				System.out.print(temp.data + "->");

				/*
				 * assign temp link to temp
				 */
				temp = temp.link;
			}
			System.out.println();
		}
	}
}

public class Paranthesis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * To create stack object
		 */
		StackNew2 stack2 = new StackNew2();
		
		/*
		 * To take user input paranthesis
		 */
		System.out.println("Enter paranthesis");
		
		String  paranthesis = sc.next();
		
		/*
		 * To check open and close brackets in paranthesis
		 */
		for(int i=0;i<paranthesis.length();i++) {
			if(paranthesis.charAt(i)=='(' ||paranthesis.charAt(i)=='['|| paranthesis.charAt(i)=='{') {
				/*
				 * If find open bracket push an element in stack
				 */
				stack2.push(i);
			}
			else if(paranthesis.charAt(i)==')' ||paranthesis.charAt(i)==']'|| paranthesis.charAt(i)=='}') {
				/*
				 * If find close bracket pop an element from stack
				 */
				stack2.pop();
			}
		}
		
		/*
		 * If open and close brackets are equal in paranthesis push and pop will happen for same number of times
		 * and stack will be empty if stack is not empty then paranthesis is not balanced
		 */
		if(stack2.isEmpty()) {
			System.out.println("Paranthesis is balanced");
		}
		else {
			System.out.println("Paranthesis is not balanced");
		}

	}

}

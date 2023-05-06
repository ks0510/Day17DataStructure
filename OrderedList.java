/*
 * This java program genereate linked list.
 */
package datastructureprogram;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 * @param <T>
 */

/*
 * Generic node class for LinkedList
 */
class Node<T> {

	/*
	 * Storing value of node
	 */
	T data;
	/*
	 * Storing address of next node
	 */
	Node<T> next;

	/*
	 * Parameterized constructor to assign value
	 */
	Node(T data) {

		// This keyword refers to current object itself
		this.data = data;
		this.next = null;
	}
}

/*
 * Helper class Generic LinkedList class
 */
class List<T> {

	/*
	 * Generic node instance
	 */
	Node<T> head;
	/*
	 * Data member to store length of list
	 */
	private int size = 0;

	// Default constructor
	List() {
		this.head = null;
	}
	
	public static <T extends Comparable<T>> int compare(T data, T data2){
		return data.compareTo(data2);
	}

	/*
	 * To add node at the end of List
	 */
	void add(T data) {

		/*
		 * Creating new node with given value
		 */
		Node<T> temp = new Node<>(data);
		Node<T> current;

		/*
		 * Checking if list is empty and assigning new value to head node
		 */
		if (head == null) {
				
			head = temp;
		}

		/*
		 * If list already exists
		 */
		else {
			current =  head;
			while(current.next!=null && (((Comparable<T>)temp.data).compareTo(current.next.data)>0)) {
				
				current = current.next;
				
			}
			temp.next = current.next;
			current.next = temp;
			}

		// Increasing length after adding new node
		size++;
	}

	/*
	 * To add new node at any given position
	 */
	void addPos(int position, T data) {

		/*
		 * Checking if position is valid
		 */
		if (position > size + 1) {

			/*
			 * Display message only
			 */
			System.out.println("Position Unavailable in LinkedList");
			return;
		}

		/*
		 * If new position is head then replace head node
		 */
		if (position == 1) {

			/*
			 * Temporary node that stores previous head value
			 */
			Node<T> temp = head;

			/*
			 * New valued node stored in head
			 */
			head = new Node<T>(data);

			/*
			 * New head node pointing to old head node
			 */
			head.next = temp;

			return;
		}
		Node<T> temp = head;

		/*
		 * Dummy node with null value that stores previous node
		 */
		Node<T> prev = new Node<T>(null);
		while (position - 1 > 0) {
			/*
			 * assigning previous node
			 */
			prev = temp;
			/*
			 * incrementing next node
			 */
			temp = temp.next;
			/*
			 * decreasing position counter
			 */
			position--;
		}
		/*
		 * previous node now points to new value
		 */
		prev.next = new Node<T>(data);
		/*
		 * new value now points to former current node
		 */
		prev.next.next = temp;
	}

	/*
	 * To remove a node from list
	 */
	void remove(T key) {

		Node<T> prev = new Node<>(null);

		prev.next = head;

		/*
		 * Next node that points ahead of current node
		 */
		Node<T> next = head.next;

		Node<T> temp = head;

		/*
		 * Boolean value that checks whether value to be deleted exists or not
		 */
		boolean exists = false;

		/*
		 * If head node needs to be deleted
		 */
		if (head.data == key) {
			head = head.next;

			/*
			 * Node to be deleted exists
			 */
			exists = true;
		}

		/*
		 * Iterating over LinkedList
		 */
		while (temp.next != null) {

			/*
			 * We convert value to be compared into Strings and then compare using
			 * String1.equals(String2) method
			 */

			/*
			 * Comparing value of key and current node
			 */
			if (String.valueOf(temp.data).equals(String.valueOf(key))) {

				prev.next = next;
				/*
				 * node to be deleted exists
				 */
				exists = true;

				// As soon as we find the node to be deleted
				// we exit the loop
				break;
			}

			/*
			 * Previous node now points to current node
			 */
			prev = temp;

			/*
			 * Current node now points to next node
			 */
			temp = temp.next;

			/*
			 * Next node points the node ahead of current node
			 */
			next = temp.next;
		}

		/*
		 * Comparing the last node with the given key value
		 */
		if (exists == false && String.valueOf(temp.data).equals(String.valueOf(key))) {

			/*
			 * If found , last node is skipped over
			 */
			prev.next = null;

			// Node to be deleted exists
			exists = true;
		}

		// If node to be deleted exists
		if (exists) {

			/*
			 * Length of LinkedList reduced
			 */
			size--;
		}

		/*
		 * If node to be deleted does not exist
		 */
		else {

			/*
			 * Print statement
			 */
			System.out.println("Given Value is not present in linked list");
		}
	}

	/*
	 * Method to clear the entire LinkedList
	 */
	void clear() {

		/*
		 * Head now points to null
		 */
		head = null;
		/*
		 * length is 0 again
		 */
		size = 0;
	}

	/*
	 * Method returns whether List is empty or not
	 */
	boolean isempty() {

		if (head == null) {
			return true;
		}
		return false;
	}

	/*
	 * Method returning the length of LinkedList
	 */
	int size() {
		return this.size;
	}

	/*
	 * To search element in linked list
	 */
	public int search(T element) {

		if (head == null) {
			return -1;
		}

		int index = 1;
		Node<T> temp = head;

		/*
		 * While loop is used to search the entire Linked List starting from the tail
		 */
		while (temp != null) {

			/*
			 * Returns the index of that particular element,if found.
			 */
			if (temp.data == element) {
				return index;
			}

			/*
			 * Gradually increases index while traversing through the Linked List
			 */
			index++;
			temp = temp.next;
		}

		/*
		 * Returns -1 if the element is not found
		 */
		return -1;
	}

	public void display() {

		Node<T> x = head;
		if (x == null) {
			return;
		}
		else{
			while (x.next != null) {
				System.out.print((x.data) + " -> ");
				x = x.next;
		}
			System.out.println();
		}
	}
}

public class OrderedList {

	public static void main(String[] args) {

		/*
		 * Creating new empty Integer linked list
		 */
		List<Integer> list1 = new List<>();
		System.out.println("Integer LinkedList created as list1 :");

		list1.add(100);
		list1.display();

		list1.add(20);
		list1.display();

		list1.add(300);

		list1.display();
		
		int result = list1.search(500);

		if (result == -1) {
			System.out.println("500 is not found in array so adding in list");
			list1.add(500);
		} else {
			System.out.println("500 found in list removing it");
			list1.remove(500);
		}

		list1.toString();

	}

}

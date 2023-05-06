/*
 * This java program create linked list for string.
 */
package com.linkedlist;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 * @param <T>
 */

class node<T> {

	/*
	 * Storing value of node
	 */
	T data;
	/*
	 * Storing address of next node
	 */
	node<T> next;

	/*
	 * Parameterized constructor to assign value
	 */
	node(T data) {

		// This keyword refers to current object itself
		this.data = data;
		this.next = null;
	}
}

/*
 * Generic LinkedList class
 */
class list<T> {

	/*
	 * Generic node instance
	 */
	node<T> head;
	/*
	 * Data member to store length of list
	 */
	private int length = 0;

	list() {
		this.head = null;
	}

	/*
	 * Method to add node at the end of List
	 */
	void add(T i) {

		/*
		 * Creating new node with given value
		 */
		node<T> temp = new node<>(i);

		/*
		 * Checking if list is empty and assigning new value to head node
		 */
		if (this.head == null) {
			head = temp;
		} else {
			node<T> x = head;
			while (x.next != null) {
				x = x.next;
			}

			/*
			 * Adding new valued node at the end of the list
			 */
			x.next = temp;
		}

		// Increasing length after adding new node
		length++;
	}

	/*
	 * Method to add new node at any given position
	 */
	void add(int position, T data) {

		/*
		 * Checking if position is valid
		 */
		if (position > length + 1) {
			System.out.println("Position Unavailable in LinkedList");
			return;
		}

		/*
		 * If new position is head then replace head node
		 */
		if (position == 1) {
			node<T> temp = head;

			/*
			 * New valued node stored in head
			 */
			head = new node<T>(data);

			/*
			 * New head node pointing to old head node
			 */
			head.next = temp;

			return;
		}

		node<T> temp = head;

		node<T> prev = new node<T>(null);
		/*
		 * iterating to the given position
		 */
		while (position - 1 > 0) {
			// assigning previous node
			prev = temp;
			// incrementing next node
			temp = temp.next;
			// decreasing position counter
			position--;
		}
		// previous node now points to new value
		prev.next = new node<T>(data);
		// new value now points to former current node
		prev.next.next = temp;
	}

	// Method
	// To remove a node from list
	void remove(T key) {

		/*
		 * Dummy node with null value
		 */
		node<T> prev = new node<>(null);

		prev.next = head;
		node<T> next = head.next;
		node<T> temp = head;
		boolean exists = false;

		// If head node needs to be deleted
		if (head.data == key) {
			head = head.next;

			// Node to be deleted exists
			exists = true;
		}

		/*
		 * Iterating over LinkedList
		 */
		while (temp.next != null) {

			/*
			 * Comparing value of key and current node
			 */
			if (String.valueOf(temp.data).equals(String.valueOf(key))) {

				/*
				 * If node to be deleted is found previous node now points to next node skipping
				 * the current node
				 */
				prev.next = next;
				/*
				 * node to be deleted exists
				 */
				exists = true;

				// As soon as we find the node to be deleted
				// we exit the loop
				break;
			}

			// Previous node now points to current node
			prev = temp;

			// Current node now points to next node
			temp = temp.next;

			// Next node points the node ahead of current
			// node
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

			/*
			 * Node to be deleted exists
			 */
			exists = true;
		}

		if (exists) {

			length--;
		}

		// If node to be deleted does not exist
		else {
			System.out.println("Given Value is not present in linked list");
		}
	}

	/*
	 * Method to clear the entire LinkedList
	 */
	void clear() {
		head = null;
		length = 0;
	}

	/*
	 * Method returns whether List is empty or not
	 */
	boolean empty() {

		// Checking if head node points to null
		if (head == null) {
			return true;
		}
		return false;
	}

	/*
	 * Method returning the length of LinkedList
	 */
	int length() {
		return this.length;
	}

	public String toString() {

		String S = "{ ";

		node<T> X = head;

		if (X == null)
			return S + " }";

		while (X.next != null) {
			S += String.valueOf(X.data) + " -> ";
			X = X.next;
		}

		S += String.valueOf(X.data);
		return S + " }";
	}
}

public class UnorderedList {

	public static void main(String[] args) {

		list<String> list1 = new list<>();
		System.out.println("Integer LinkedList created as list1 :");

		list1.add("Concurrent");
		list1.add("Ship");
		list1.add("Program");

		System.out.println(list1);

	}

}


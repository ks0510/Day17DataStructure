package datastructureprogram;

import java.util.*;
import java.util.ArrayList;

/**
 * 
 * @author Kaif
 *
 */

public class HashTable1 {
	public ArrayList<Node> HashTable;
	LinkedList list;

	private int hashFunction(int value) {
		return value % 11;
	}

	public HashTable1() {
		HashTable = new ArrayList<Node>();
		list = new LinkedList();
	}

	public HashTable1(ArrayList<Node> HashTable) {
		this.HashTable = HashTable;
	}

	public void addValue(int value) {

		int hashKey = hashFunction(value); // num = 66 , hashKey = 6
		Node head = null;
		if (HashTable == null) {
			Node newNode = new Node(hashKey);
			HashTable.add(newNode);
		}
		for (Node node : HashTable) {
			if (node.data == hashKey) {
				head = node;
			}
		}
		if (head == null) {
			Node newNode = new Node(hashKey);
			HashTable.add(newNode);
			head = newNode;
		}
		head = list.addNode(value, head);
		for (Node node : HashTable) {
			if (node.data == hashKey) {
				node = head;
			}
		}

	}

	public boolean search(int value) {
		/*
		 * Your logic
		 */
		return true;
	}

	public void printHashTable(ArrayList<Node> hashMap) {
		for (Node node : hashMap) {
			System.out.print(node.data + " --> ");
			list.printList(node.next);
			System.out.println();
		}
	}
}

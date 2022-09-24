package com.linklist;

public class LinkList {

	Node head;

	// Program to insert a node to the list at last

	public void insert(int data) {
		Node node = new Node();

		node.data = data;

		if (head == null) {
			head = node;
		} else {
			Node n = head;

			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public void show() {
		Node node = head;

		while (node.next != null) {

			System.out.println(node.data + " ");

			node = node.next;
		}

		System.out.println(node.data);
	}

	public void size() {
		int counter = 0;
		if (head == null) {
			System.out.println("Size is zero");
		} else {
			Node n = head;

			while (n.next != null) {
				counter++;
				n = n.next;
			}
			counter++;

			System.out.println("size of the list is " + counter);
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head; // in line 67 head is working as first node.
							// Since we can not directly get the access to
							// the first node so we will take the help of head node
							// initially head is pointing to first node
							// so make the current node as head node now.
							// current node needs to point to first node

		head = node; // by doing this head will point to current node.

	}

	public void insertAt(int index, int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;

		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;

	}

}

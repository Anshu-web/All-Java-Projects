package com.linklist;

public class Runner {

	public static void main(String[] args) {

		LinkList list = new LinkList();

		list.insert(11);
		list.insert(13);
		list.insert(14);
		list.insert(15);
		list.insert(16);
		list.insertAtStart(40);
		list.insertAt(3, 100);

		list.show();
		list.size();

	}

}

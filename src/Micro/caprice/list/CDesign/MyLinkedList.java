package Micro.caprice.list.CDesign;

import Micro.caprice.list.ListNode;

/**
 * @program Before2020
 * @description: 707. 设计链表
 * @author: ding
 * @create: 2022/02/23 23:04
 */
public class MyLinkedList {
	ListNode head;
	int count;

	public MyLinkedList() {
		head = new ListNode(-1, null);
		count = 0;
	}

	public int get(int index) {
		ListNode temp = head.next;
		int number = 0;
		while (temp != null) {
			if (number == index) {
				return temp.val;
			}
			temp = temp.next;
			number++;
		}
		return -1;
	}

	public void addAtHead(int val) {
		ListNode newNode = new ListNode(val);
		ListNode temp = head.next;
		head.next = newNode;
		newNode.next = temp;
		count++;
	}

	public void addAtTail(int val) {
		if (count == 0) {
			addAtHead(val);
			return;
		}
		ListNode temp = head.next;
		ListNode newNode = new ListNode(val, null);
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		count++;
	}

	public void addAtIndex(int index, int val) {
		if (index <= 0) {
			addAtHead(val);
			return;
		}

		if (index > count) {
			return;
		}
		if (index == count) {
			addAtTail(val);
			return;
		}


		ListNode temp = head;
		int number = 0;
		while (number < index) {
			temp = temp.next;
			number++;
		}

		ListNode newNode = new ListNode(val, null);
		ListNode nextNode = temp.next;
		temp.next = newNode;
		newNode.next = nextNode;

		count++;
	}

	public void deleteAtIndex(int index) {
		if (index > count -1 ) {
			return;
		}
		ListNode temp = head;
		int number = 0;
		while (number < index) {
			temp = temp.next;
			number++;
		}
		temp.next = temp.next.next;
		count--;
	}
}

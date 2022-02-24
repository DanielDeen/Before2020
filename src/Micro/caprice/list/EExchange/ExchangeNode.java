package Micro.caprice.list.EExchange;

import Micro.caprice.list.ListNode;

/**
 * @program Before2020
 * @description: 24. 两两交换链表中的节点
 * @author: ding
 * @create: 2022/02/24 23:51
 */
public class ExchangeNode {
	public static void main(String[] args) {

	}

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}


		ListNode dummyNode = new ListNode();
		dummyNode.next = head;
		ListNode tempNode = dummyNode;
		while (tempNode.next != null && tempNode.next.next != null) {
			ListNode firstNode = tempNode.next;
			ListNode secondNode = tempNode.next.next;

			tempNode.next = secondNode;
			firstNode.next = secondNode.next;
			secondNode.next = firstNode;

			tempNode = firstNode;
		}
		return dummyNode;
	}

	public ListNode swap(ListNode head) {
		ListNode nextNode = head.next;
		ListNode newNode = swap(nextNode.next);

		nextNode.next = head;
		head.next = newNode;

		return nextNode;
	}

}

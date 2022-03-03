package Micro.caprice.doublepointer.FReverseList;

import Micro.caprice.doublepointer.ListNode;

/**
 * @program Before2020
 * @description: 206.反转链表
 * @author: ding
 * @create: 2022/03/03 23:13
 */
public class ReverseListNode {
	public static void main(String[] args) {

	}


	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = pre;

			pre = cur;
			cur = temp;

		}

		return pre;
	}


	public ListNode reverseList2(ListNode head) {
		return reverse(null, head);
	}


	public ListNode reverse(ListNode pre, ListNode cur) {
		if (cur == null) {
			return pre;
		}

		ListNode nextNode = cur.next;
		cur.next = pre;
		return reverse(cur, nextNode);

	}


	public ListNode reverseList3(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode nextNode = reverseList3(head.next);
		head.next.next = head;
		head.next = null;
		return nextNode;
	}
}

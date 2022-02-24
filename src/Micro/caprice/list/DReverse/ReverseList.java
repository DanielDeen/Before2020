package Micro.caprice.list.DReverse;

import Micro.caprice.list.ListNode;

/**
 * @program Before2020
 * @description: 206. 反转链表
 * @author: ding
 * @create: 2022/02/24 12:24
 */
public class ReverseList {
	public static void main(String[] args) {

	}

	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}

		return pre;
	}


	public ListNode reverse(ListNode pre, ListNode cur) {
		if (cur == null) {
			return pre;
		}
		ListNode temp = cur.next;
		cur.next = pre;
		return reverse(cur, temp);
	}

}

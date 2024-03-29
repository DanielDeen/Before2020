package Micro.caprice.doublepointer.ICycleList;

import Micro.caprice.doublepointer.ListNode;

/**
 * @program Before2020
 * @description: 142. 环形链表 II
 * @author: ding
 * @create: 2022/03/04 00:19
 */
public class DetectCycle {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				fast = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return fast;
			}
		}

		return null;
	}
}

package Micro.caprice.list.HLinkCycle;

import Micro.caprice.list.ListNode;

/**
 * @program Before2020
 * @description: 142. 环形链表 II
 * @author: ding
 * @create: 2022/02/25 23:23
 */
public class LinkCycleList {
	public static void main(String[] args) {

	}

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			//fast指针一定先进入环中，如果fast指针和slow指针相遇的话，一定是在环中相遇，这是毋庸置疑的。
			//slow指针走过的节点数为: x + y，
			// fast指针走过的节点数：x + y + n (y + z)，n为fast指针在环内走了n圈才遇到slow指针，
			// （y+z）为 一圈内节点的个数
			if (slow == fast) {
				fast = head;
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		return null;
	}
}

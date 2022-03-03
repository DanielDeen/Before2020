package Micro.caprice.doublepointer.HListCross;

import Micro.caprice.doublepointer.ListNode;

/**
 * @program Before2020
 * @description: 面试 02.07. 链表相交
 * @author: ding
 * @create: 2022/03/04 00:03
 */
public class IntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = 0;
		int lenB = 0;

		ListNode dummyA = headA;
		ListNode dummyB = headB;
		while (dummyA != null) {
			dummyA = dummyA.next;
			lenA++;
		}

		while (dummyB != null) {
			dummyB = dummyB.next;
			lenB++;
		}

		int gap = Math.abs(lenA - lenB);

		if (lenB > lenA) {
			ListNode temp = headA;
			headA = headB;
			headB = temp;
		}

		int index = 0;
		while (index < gap) {
			headA = headA.next;
			index++;
		}

		while (headA != null && headB != null) {
			if (headA == headB) {
				return headA;
			}

			headA = headA.next;
			headB = headB.next;
		}


		return null;
	}
}

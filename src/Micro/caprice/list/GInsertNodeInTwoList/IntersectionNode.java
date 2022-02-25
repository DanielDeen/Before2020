package Micro.caprice.list.GInsertNodeInTwoList;

import Micro.caprice.list.ListNode;

/**
 * @program Before2020
 * @description: 面试题 02.07. 链表相交
 * @author: ding
 * @create: 2022/02/25 23:07
 */
public class IntersectionNode {
	public static void main(String[] args) {

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = 0;
		int lenB = 0;

		ListNode tempA = headA;
		ListNode tempB = headB;

		while (tempA != null) {
			lenA++;
			tempA = tempA.next;
		}
		while (tempB != null) {
			lenB++;
			tempB = tempB.next;
		}

		int gap = lenA - lenB;
		ListNode swapList;
		if (lenB > lenA) {
			gap = lenB - lenA;
			swapList = headA;
			headA = headB;
			headB = swapList;
		}

		while (gap > 0) {
			headA = headA.next;
			gap--;
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

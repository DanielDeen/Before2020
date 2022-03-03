package Micro.caprice.doublepointer.GDeleteNthFromEnd;

import Micro.caprice.doublepointer.ListNode;

/**
 * @program Before2020
 * @description: 19. 删除链表的倒数第 N 个结点
 * @author: ding
 * @create: 2022/03/03 23:39
 */
public class DeleteNthNode {
	public static void main(String[] args) {

	}


	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyNode = new ListNode(-1);
		dummyNode.next = head;
		ListNode slow = dummyNode;
		ListNode fast = dummyNode;
		int index = 0;
		while (index < n && fast != null) {
			fast = fast.next;
			index++;
		}

		fast = fast.next;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return dummyNode.next;
	}
}

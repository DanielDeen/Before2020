package Micro.caprice.list.FDeleteN;

import Micro.caprice.list.ListNode;

/**
 * @program Before2020
 * @description: 19.删除链表的倒数第 N 个结点
 * @author: ding
 * @create: 2022/02/25 00:34
 */
public class DeleteNthFromEnd {
	public static void main(String[] args) {

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyNode = new ListNode();
		dummyNode.next = head;


		ListNode slow = dummyNode;
		ListNode fast = dummyNode;
		while (n > 0 && fast != null) {
			fast = fast.next;
			n--;
		}
		fast = fast.next;

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		slow.next = slow.next.next;

		return dummyNode.next;
	}
}

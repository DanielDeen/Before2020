package Micro.caprice.list.BRemove;

import Micro.caprice.list.ListNode;

/**
 * @program Before2020
 * @description: 203. 移除链表元素
 * @author: ding
 * @create: 2022/02/23 22:34
 */
public class RemoveNode {
	public static void main(String[] args) {

	}

	public ListNode removeNode(ListNode head, int val) {
		ListNode res = new ListNode(-1);
		res.next = head;
		ListNode temp = res;
		while (temp.next != null) {
			if (temp.next.val == val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return res.next;
	}
}

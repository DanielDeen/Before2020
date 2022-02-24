package Micro.caprice.list;

/**
 * @program Before2020
 * @description: 链表
 * @author: ding
 * @create: 2022/02/23 22:34
 */
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

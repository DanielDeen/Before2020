package AAMaster;

/**
 * @program Before2020
 * @description: 链表中倒数第K个节点
 * @author: ding
 * @create: 2021/09/02 23:31
 */
public class Offer022 {
	public ListNode getKthFromEnd(ListNode head, int k) {
		ListNode fast = head;
		ListNode slow = head;
		int flag = 0;
		while (flag < k - 1) {
			fast = fast.next;
			flag++;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow;
	}
}

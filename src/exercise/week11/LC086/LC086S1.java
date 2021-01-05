package exercise.week11.LC086;

/**
 * @description: 86.分隔链表
 * @author: Daniel Deen
 * @create: 2021-01-03 23:16
 */

public class LC086S1 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode tempNode = dummyNode;

        ListNode fastNode = dummyNode.next;
        ListNode slowNode = dummyNode;

        while (fastNode != null) {
            if (fastNode.val < x) {

            }
        }

        return dummyNode.next;

    }
}

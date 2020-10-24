package exercise.week01.LC024;

/**
 * @description: 两两交换链表中的节点
 * @author: Daniel Deen
 * @create: 2020-10-22 22:51
 */

public class LC024S1 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null ) return head;
        ListNode newHeadNode = head.next;
        head.next = swapPairs(newHeadNode.next);
        newHeadNode.next = head;
        return newHeadNode;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode temp = dummyNode;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;

            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;

        }


        return dummyNode.next;
    }
}

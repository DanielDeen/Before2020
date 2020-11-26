package exercise.bigExercise.Day03;

/**
 * @description: 206.反转链表
 * @author: Daniel Deen
 * @create: 2020-11-27 00:37
 */

public class LC206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }




        if (head == null || head.next == null) {
            return head;
        }

        ListNode l = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return l;

    }
}

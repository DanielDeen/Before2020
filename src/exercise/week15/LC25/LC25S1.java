package exercise.week15.LC25;

/**
 * @description: 25.K个一组反转链表
 * @author: Daniel Deen
 * @create: 2021-01-28 01:28
 */

public class LC25S1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;

        while (cur != null && count != k) {
            cur = cur.next;
            count++;
        }

        if (count == k) {
            cur = reverseKGroup(head, k);
            while (count != 0) {
                count--;
                ListNode tmp = head.next;
                head.next = cur;
                cur = head;
                ;
                head = tmp;
            }
            head = cur;
        }
        return head;
    }
}

package exercise.bigExercise.Day03;

/**
 * @description: 141.环形链表
 * @author: Daniel Deen
 * @create: 2020-11-27 00:59
 */

public class LC141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            if (fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}

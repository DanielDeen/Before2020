package exercise.bigExercise.Day03;

/**
 * @description: 142.环形链表II
 * @author: Daniel Deen
 * @create: 2020-11-27 01:06
 */

public class LC142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                fast = head;
                while (slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
    }
}

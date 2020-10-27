package exercise.week01.LC021;

/**
 * @description: 合并两个有序链表
 * @author: Daniel Deen
 * @create: 2020-10-28 00:14
 */

public class LC021S03 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1 == null ? l2:l1;
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

package exercise.week15.LC25;

/**
 * @description: list node
 * @author: Daniel Deen
 * @create: 2021-01-28 01:29
 */

public class ListNode {
    int val;
    ListNode next;

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

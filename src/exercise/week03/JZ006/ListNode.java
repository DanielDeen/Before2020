package exercise.week03.JZ006;

/**
 * @description: 链表
 * @author: Daniel Deen
 * @create: 2020-10-21 00:19
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

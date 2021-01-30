package exercise.week15.JZ35;

/**
 * @description: JZ35.复杂链表的复制
 * @author: Daniel Deen
 * @create: 2021-01-29 02:08
 */

public class JZ35S1 {
    public Node copyRandomList(Node head) {
        if (head == null) return head;
        Node cur = head;
        while (cur != null) {
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }

        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        cur = head.next;
        Node pre = head, res = head.next;
        while (cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return res;
    }
}

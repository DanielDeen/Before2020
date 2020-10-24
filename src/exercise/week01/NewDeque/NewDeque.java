package exercise.week01.NewDeque;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: Deque新的API使用
 * @author: Daniel Deen
 * @create: 2020-10-22 00:39
 */

public class NewDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.addLast("b");
        deque.addLast("c");
        deque.addFirst("a");
        System.out.println(deque);

        String strFirst = deque.getFirst();
        System.out.println(strFirst);
        String strEnd = deque.getLast();
        System.out.println(strEnd);

        while (deque.size() > 0) {
            deque.removeFirst();
        }

        System.out.println(deque);

    }
}

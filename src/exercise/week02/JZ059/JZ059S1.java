package exercise.week02.JZ059;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 滑动窗口的最大值
 * @author: Daniel Deen
 * @create: 2020-10-27 23:31
 */

public class JZ059S1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, -4, 5, 3, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];

        for (int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            if (i > 0 && deque.peekFirst() == nums[i - 1]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[j])
                deque.removeLast();
            deque.addLast(nums[j]);
            if (i >= 0) {
                res[i] = deque.peekFirst();
            }
        }
        return res;
    }
}

package exercise.week10.LC239;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 239.滑动窗口最大值
 * @author: Daniel Deen
 * @create: 2020-12-27 22:19
 */

public class LC239S1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LC239S1().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) return nums;
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            queue.addLast(i);
            if (queue.peek() <= i - k) {
                queue.poll();
            }
            if (i + 1 >= k) {
                res[i + 1 - k] = nums[queue.peek()];
            }
        }
        return res;
    }
}

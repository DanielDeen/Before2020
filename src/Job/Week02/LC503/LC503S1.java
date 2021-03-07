package Job.Week02.LC503;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 503.下一个更大元素II
 * @author: Daniel Deen
 * @create: 2021-03-06 23:44
 */

public class LC503S1 {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        // 两倍长的数组
        int[] temp = new int[len * 2];
        int head = 0, tail = -1;
        for (int i = 0; i < len * 2; i++) {
            while (head <= tail && nums[i % len] > nums[temp[tail]]) {
                int t = temp[tail--];
                res[t] = nums[i % len];
            }
            temp[++tail] = i % len;
        }
        return res;
    }

    public int[] nextGreaterElements2(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < len * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % len]) {
                res[stack.pop()] = nums[i % len];
            }
            stack.push(i % len);
        }
        return res;
    }
}

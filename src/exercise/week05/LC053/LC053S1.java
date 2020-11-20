package exercise.week05.LC053;

/**
 * @description: 最大子序和
 * @author: Daniel Deen
 * @create: 2020-11-19 00:41
 */

public class LC053S1 {
    public static void main(String[] args) {
        System.out.println(new LC053S1().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int pre = 0, maxRes = Integer.MIN_VALUE;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxRes = Math.max(maxRes, pre);
        }

        return maxRes;
    }
}

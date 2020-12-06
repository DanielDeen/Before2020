package exercise.week07.LC053;

/**
 * @description: 53.最大子序和
 * @author: Daniel Deen
 * @create: 2020-12-03 21:10
 */

public class LC053S1 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = Integer.MIN_VALUE;
        for (int num :
                nums) {
            pre = Math.max(pre, pre + num);
            max = Math.max(pre, max);
        }

        return max;
    }
}

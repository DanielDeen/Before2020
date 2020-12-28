package exercise.week10.LC238;

/**
 * @description: 238.除自身以外数组的乘积
 * @author: Daniel Deen
 * @create: 2020-12-27 00:40
 */

public class LC238S1 {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        L[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }
        int R = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            L[i] = L[i] * R;
            R *= nums[i];
        }
        return L;
    }

    private int getRes(int[] nums, int index) {
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == index) continue;
            res *= nums[i];
        }

        return res;
    }
}

package exercise.week12.LC189;

/**
 * @description: 189.旋转数组
 * @author: Daniel Deen
 * @create: 2021-01-08 00:22
 */

public class LC189S1 {
    public void rotate(int[] nums, int k) {
        int step = k % nums.length;
        if (step == 0) return;
        int[] newNums = new int[nums.length];
        System.arraycopy(nums, nums.length - step, newNums, 0, step);
        System.arraycopy(nums, 0, newNums, step, nums.length - step);
        System.arraycopy(newNums, 0, nums, 0, nums.length);
    }

    public void rotate1(int[] nums, int k) {
        int step = k % nums.length;
        if (step == 0) return;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k + 1, nums.length);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

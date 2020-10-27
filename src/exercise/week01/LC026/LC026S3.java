package exercise.week01.LC026;

/**
 * @description: 删除排序数组中的重复项
 * @author: Daniel Deen
 * @create: 2020-10-27 00:52
 */

public class LC026S3 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
    }

    public int removeDuplicates1(int[] nums) {
        if (nums.length <=1) return nums.length;
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] < nums[fast]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }

        return slow;
    }
}

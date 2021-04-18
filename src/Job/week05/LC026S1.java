package Job.week05;

/**
 * @description: 26.删除有序数组中的重复项
 * @author: Daniel Deen
 * @create: 2021-04-18 15:58
 */

public class LC026S1 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n;
        int slow = 0;
        int fast = 1;
        while (fast < n) {
            while (nums[slow] < nums[fast]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}

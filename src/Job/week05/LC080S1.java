package Job.week05;

/**
 * @description: 80.删除有序数组中的重复项II
 * @author: Daniel Deen
 * @create: 2021-04-06 00:42
 */

public class LC080S1 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}

package exercise.week15.LC1248;

/**
 * @description: 1248.统计"优美子数组"
 * @author: Daniel Deen
 * @create: 2021-01-26 01:46
 */

public class LC1248S1 {
    public static void main(String[] args) {
        System.out.println(3&1);
    }

    public int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        int odd = 0, ans = 0;
        cnt[0] = 0;
        for (int i = 0; i < len; i++) {
            odd += nums[i] & 1;
            ans += odd >= k ? cnt[odd - k] : 0;
            cnt[odd]++;
        }
        return ans;
    }
}

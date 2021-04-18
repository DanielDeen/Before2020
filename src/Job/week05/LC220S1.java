package Job.week05;

import java.util.TreeSet;

/**
 * @description: 220.存在重复元素III
 * @author: Daniel Deen
 * @create: 2021-04-17 23:01
 */

public class LC220S1 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> ts = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            Long flag = nums[i] * 1L;
            Long l = ts.floor(flag);
            Long r = ts.ceiling(flag);

            if (l != null && flag - l <= t) return true;
            if (r != null && r - flag <= t) return true;

            ts.add(flag);
            if (i >= k) ts.remove(nums[i - k] * 1L);
        }
        return false;
    }
}

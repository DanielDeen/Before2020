package exercise.week17.LC448;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 448. 找到所有数组中消失的数字
 * @author: Daniel Deen
 * @create: 2021-02-13 23:28
 */

public class LC448S1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}

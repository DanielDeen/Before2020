package exercise.week08.LC217;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 217.存在重复元素
 * @author: Daniel Deen
 * @create: 2020-12-13 01:48
 */

public class LC217S1 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > 1) return true;
        }
        return false;
    }
}

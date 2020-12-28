package exercise.week10.LC003;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 3.无重复字符的最长子串
 * @author: Daniel Deen
 * @create: 2020-12-23 01:03
 */

public class LC003S1 {
    public static void main(String[] args) {
        System.out.println(new LC003S1().lengthOfLongestSubstring("abba"));
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                index = Math.max(map.get(c) + 1, index);
            }
            map.put(c, i);
            res = Math.max(res, i - index + 1);
        }

        return res;
    }
}

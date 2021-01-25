package exercise.week15.LC1371;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 1371.每个元音包含偶数次的最长子字符串
 * @author: Daniel Deen
 * @create: 2021-01-26 01:01
 */

public class LC1372S1 {
    public int findTheLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) map.put(c, map.getOrDefault(c, 0) + 1);

        }
        return res;
    }

    public boolean isVowel(char v) {
        if (v == 'a' || v == 'e' ||
                v == 'i' || v == 'o' || v == 'u') {
            return true;
        }
        return false;
    }
}

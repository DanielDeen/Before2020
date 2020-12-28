package exercise.week09.LC387;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @description: 387.字符串中的第一个唯一字符
 * @author: Daniel Deen
 * @create: 2020-12-14 23:03
 */

public class LC387S1 {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }

        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1)
                return i;
        }

        return -1;
    }
}

package exercise.week09.LC290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description: 290.单词规律
 * @author: Daniel Deen
 * @create: 2020-12-16 01:06
 */

public class LC290S1 {
    public static void main(String[] args) {
        System.out.println(new LC290S1().wordPattern("abba", "dog cat cat dog"));
    }
    public boolean wordPattern(String pattern, String s) {
        if (pattern.length() != s.split(" ").length) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        char[] chars = pattern.toCharArray();
        String[] strings = s.split(" ");
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                if (set.contains(strings[i])) {
                    return false;
                }
                map.put(chars[i], strings[i]);
                set.add(strings[i]);
            } else {
                if (!map.get(chars[i]).equals(strings[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}

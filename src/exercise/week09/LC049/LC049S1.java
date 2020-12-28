package exercise.week09.LC049;

import java.util.*;

/**
 * @description: 49.字母异位词分组
 * @author: Daniel Deen
 * @create: 2020-12-14 01:09
 */

public class LC049S1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            List<String> list = map.getOrDefault(String.valueOf(chars), new ArrayList<>());
            list.add(s);
            map.put(String.valueOf(chars), list);
        }

        return new ArrayList<>(map.values());
    }
}

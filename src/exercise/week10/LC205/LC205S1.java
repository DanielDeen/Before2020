package exercise.week10.LC205;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 205.同构字符串
 * @author: Daniel Deen
 * @create: 2020-12-27 00:56
 */

public class LC205S1 {
    public static void main(String[] args) {
        System.out.println(new LC205S1().isIsomorphic("abcdvsafjvnfalvialfvoar", "abcdvsafjvnfalvialfvoar"));
    }

    public boolean isIsomorphic(String s, String t) {
        return canMap(s, t) && canMap(t, s);
    }

    private boolean canMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] ms = new int[128];
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (ms[cs[i]] == 0) {
                ms[cs[i]] = ct[i];
            } else if (ms[cs[i]] != ct[i]) {
                return false;
            }
        }

        return true;
    }


    public boolean isIsomorphic1(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i))) {
                return false;
            }
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}

package exercise.week10.LC438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 438.找到字符串中所有的字母异位词
 * @author: Daniel Deen
 * @create: 2020-12-22 01:07
 */

public class LC438S1 {
    public static void main(String[] args) {
        System.out.println(new LC438S1().findAnagrams("abab", "ab"));
    }


    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] c = p.toCharArray();
        Arrays.sort(c);
        int len = p.length();
        for (int i = 0; i < s.length() - len + 1; i++) {
            String tmp = s.substring(i, i+ len);
            char[] chars = tmp.toCharArray();
            Arrays.sort(chars);
            if (new String(chars).equals(new String(c))) {
                list.add(i);
            }
        }
        return list;
    }
}

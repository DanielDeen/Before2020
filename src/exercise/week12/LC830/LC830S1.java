package exercise.week12.LC830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 830.较大分组的位置
 * @author: Daniel Deen
 * @create: 2021-01-05 01:20
 */

public class LC830S1 {
    public static void main(String[] args) {
        System.out.println(new LC830S1().largeGroupPositions("abbxxxxzzy"));
    }

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        char[] chars = s.toCharArray();
        int index = 1, len = chars.length;
        for (int i = 0; i < len; i++) {
            if (i == len - 1 || chars[i] != chars[i + 1]) {
                if (index >= 3) {
                    res.add(Arrays.asList(i - index + 1, i));
                }
                index = 1;
            } else {
                index++;
            }
        }
        return res;
    }

    public List<List<Integer>> largeGroupPositionsBest(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int begin = 0;
        for (int end = 1; end < s.length(); end++) {
            if (s.charAt(begin) != s.charAt(end)) {
                if (end - begin >= 3) {
                    res.add(Arrays.asList(begin, end - 1));
                }
                begin = end;
            }
        }
        if (s.length() - begin >= 3) {
            res.add(Arrays.asList(begin, s.length() - 1));
        }
        return res;
    }
}

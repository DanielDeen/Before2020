package exercise.week15.LC1371;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 1371.每个元音包含偶数次的最长子字符串
 * @author: Daniel Deen
 * @create: 2021-01-26 01:01
 */

public class LC1372S1 {
    public int findTheLongestSubstring(String s) {
        int len = s.length();
        int[] pos = new int[32];
        Arrays.fill(pos, -1);
        int res = 0, status = 0;
        pos[0] = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a':
                    status ^= 1;
                    break;
                case 'e':
                    status ^= 2;
                    break;
                case 'i':
                    status ^= 4;
                    break;
                case 'o':
                    status ^= 8;
                    break;
                case 'u':
                    status ^= 16;
                    break;
            }
            if (pos[status] >= 0) {
                res = Math.max(res, i + 1 - pos[status]);
            } else {
                pos[status] = i + 1;
            }
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

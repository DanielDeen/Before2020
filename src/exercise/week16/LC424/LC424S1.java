package exercise.week16.LC424;

/**
 * @description: 424.替换后的最长重复字符
 * @author: Daniel Deen
 * @create: 2021-02-02 23:24
 */

public class LC424S1 {
    public int characterReplacement(String s, int k) {
        int[] ch = new int[26];
        if (s == null) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int left = 0, right = 0;
        int maxChar = 0;
        for (right = 0; right < chars.length; right++) {
            int index = chars[right] - 'A';
            ch[index]++;
            maxChar = Math.max(maxChar, ch[index]);
            if (right - left + 1 > maxChar + k) {
                ch[chars[left] - 'A']--;
                left++;
            }
        }
        return chars.length - left;
    }
}

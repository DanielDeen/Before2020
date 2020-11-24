package exercise.bigExercise.Day01;

import java.util.Arrays;

/**
 * @description: 有效的字母异位词
 * @author: Daniel Deen
 * @create: 2020-11-25 00:03
 */

public class LC242 {
    public static void main(String[] args) {
        System.out.println(new LC242().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return String.valueOf(sChars).equals(String.valueOf(tChars));

    }
}

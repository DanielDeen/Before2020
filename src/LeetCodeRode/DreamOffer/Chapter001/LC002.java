package LeetCodeRode.DreamOffer.Chapter001;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description: 分割回文串: 给定一个字符串 S , 将 S 分割成一些子串，使每个子串都是回文串
 * @author: Daniel Deen
 * @create: 2020-09-22 00:32
 */

public class LC002 {
    public static void main(String[] args) {
        String s = "aab";

        partition(s).forEach(System.out::println);

        // System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s) {
        int len = s.length();
        List<List<String>> res = new ArrayList<>();
        if (len == 0){
            return res;
        }

        Deque<String> stack = new ArrayDeque<>();
        backTracking(s,0,len,stack,res);
        return res;

    }

    private static void backTracking(String s, int start, int len, Deque<String> path, List<List<String>> res) {
        if (start == len) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i= start;i<len;i++)    {
            if (!checkPalindrome(s, start , i)){
                continue;
            }

            path.addLast(s.substring(start, i+1));
            backTracking(s, i+1,len,path,res);
            path.removeLast();
        }
    }

    private static boolean checkPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

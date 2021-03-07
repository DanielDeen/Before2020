package Job.Week02.LC131;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @description: 131. 分割回文串
 * @author: Daniel Deen
 * @create: 2021-03-07 11:55
 */

public class LC131S1 {
    public static void main(String[] args) {
        System.out.println(new LC131S1().partition("aab"));
    }


    public List<List<String>> partition(String s) {
        int len = s.length();
        List<List<String>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        char[] charArrays = s.toCharArray();
        Deque<String> stack = new ArrayDeque<>();
        dfs(charArrays, 0, len, stack, res);
        return res;
    }

    /**
     * 深度遍历
     *
     */
    private void dfs(char[] charArrays, int index, int len, Deque<String> stack, List<List<String>> res) {
        if (index == len) {
            res.add(new ArrayList<>(stack));
            return;
        }

        for (int i = index; i < len; i++) {
            // 回文数校验
            if (!checkPartition(charArrays, index, i)) {
                continue;
            }

            stack.add(new String(charArrays, index, i + 1 - index));
            dfs(charArrays, i + 1, len, stack, res);
            stack.removeLast();
        }

    }

    public boolean checkPartition(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

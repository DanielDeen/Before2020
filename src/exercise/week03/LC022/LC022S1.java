package exercise.week03.LC022;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 括号生成
 * @author: Daniel Deen
 * @create: 2020-11-03 00:22
 */

public class LC022S1 {
    public static void main(String[] args) {
        LC022S1 lc022S1 = new LC022S1();
        System.out.println(lc022S1.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        int left = 0;
        int right = 0;
        getParenthesis(n, res, left, right, "");
        return res;
    }

    private void getParenthesis(int n, List<String> res, int left, int right, String s) {
        if (left == n && right == n) {
            res.add(s);
            return;
        }
        if (left < n) getParenthesis(n, res, left + 1, right, s + "(");
        if (right < left) getParenthesis(n, res, left, right + 1, s + ")");
    }
}

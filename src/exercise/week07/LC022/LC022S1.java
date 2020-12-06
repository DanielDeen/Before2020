package exercise.week07.LC022;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 22.括号生成
 * @author: Daniel Deen
 * @create: 2020-12-07 00:06
 */

public class LC022S1 {
    public static void main(String[] args) {
        System.out.println(new LC022S1().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        int left = 0;
        int right = 0;

        getParenthesis(n, left, right, res, "");

        return res;
    }

    public void getParenthesis(int n, int left, int right, List<String> res, String tmp) {
        if (right == n && left == n) {
            res.add(tmp);
            return;
        }
        if (left < n) getParenthesis(n , left + 1, right, res, tmp + "(");
        if (right < left) getParenthesis(n , left, right + 1, res, tmp + ")");
    }
}

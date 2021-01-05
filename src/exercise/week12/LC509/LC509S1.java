package exercise.week12.LC509;

/**
 * @description: 509.斐波那契数
 * @author: Daniel Deen
 * @create: 2021-01-04 01:11
 */

public class LC509S1 {
    public int fib(int n) {
        if (n <= 1) return n;
        int pre = 0;
        int next = 1;
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = pre + next;
            pre = next;
            next = res;
        }
        return res;
    }
}

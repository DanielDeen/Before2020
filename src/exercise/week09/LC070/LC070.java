package exercise.week09.LC070;

/**
 * @description: 70.爬楼梯
 * @author: Daniel Deen
 * @create: 2020-12-15 01:43
 */

public class LC070 {
    public int climbStairs(int n) {
        int pre = 1;
        int next = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = pre + next;
            pre = next;
            next = sum;
        }

        return next;
    }
}

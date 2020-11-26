package exercise.bigExercise.Day02;

/**
 * @description: 70.爬楼梯
 * @author: Daniel Deen
 * @create: 2020-11-26 00:47
 */

public class LC070 {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int step = 0;
        int pre = 1;
        int next = 1;
        for (int i = 1; i < n; i++) {
            step = pre + next;
            pre = next;
            next = step;
        }

        return step;
    }
}

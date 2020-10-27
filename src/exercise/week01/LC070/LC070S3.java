package exercise.week01.LC070;

/**
 * @description: 爬楼梯
 * @author: Daniel Deen
 * @create: 2020-10-27 00:44
 */

public class LC070S3 {

    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        if (n == 1) return 1;
        int first = 1;
        int second = 1;
        int step = 0;
        for (int i = 1; i < n; i++) {
            step = first + second;
            first = second;
            second = step;
        }

        return step;
    }
}

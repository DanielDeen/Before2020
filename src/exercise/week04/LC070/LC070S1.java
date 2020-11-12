package exercise.week04.LC070;

/**
 * @description: 爬楼梯
 * @author: Daniel Deen
 * @create: 2020-11-10 00:26
 */

public class LC070S1 {
    public static void main(String[] args) {
        System.out.println(new LC070S1().climbStairs(3));
    }
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        int res = 0;
        int preStep = 1;
        int preStepPre = 1;
        for (int i = 1; i < n; i++) {
            res = preStep + preStepPre;
            preStepPre = preStep;
            preStep = res;
        }
        return res;
    }
}

package exercise.week03.LC070;

/**
 * @description: 爬楼梯
 * @author: Daniel Deen
 * @create: 2020-11-02 23:55
 */

public class LC070S1 {

    public static void main(String[] args) {
        LC070S1 lc070S1 = new LC070S1();
        System.out.println(lc070S1.climbStairs(3));
    }

    public int climbStairs(int n) {
        if (n == 1 ) return 1;
        int first = 1;
        int second = 1;
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = first + second;
            first = second;
            second = res;
        }

        return res;
    }
}

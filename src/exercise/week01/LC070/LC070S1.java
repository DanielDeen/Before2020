package exercise.week01.LC070;

/**
 * @description: 爬楼梯问题
 * @author: Daniel Deen
 * @create: 2020-10-19 07:59
 */

public class LC070S1 {
    public static void main(String[] args) {
        int stairs = 3;
        System.out.println(climbStairs(stairs));
    }

    public static int climbStairs(int stairs) {
        int[] steps = new int[stairs + 1];
        steps[0] = 1;
        steps[1] = 1;
        for (int i = 2; i <= stairs; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[stairs];
    }
}

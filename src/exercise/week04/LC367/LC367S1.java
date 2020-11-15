package exercise.week04.LC367;

/**
 * @description: 有效的完全平方数
 * @author: Daniel Deen
 * @create: 2020-11-14 23:53
 */

public class LC367S1 {
    public static void main(String[] args) {
        System.out.println(new LC367S1().isPerfectSquare(16));
    }

    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long x = num / 2;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }

        return x * x == num;
    }
}

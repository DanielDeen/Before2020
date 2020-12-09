package exercise.week08.LC367;

/**
 * @description: 367.有效的完全平方数
 * @author: Daniel Deen
 * @create: 2020-12-09 00:17
 */

public class LC367S1 {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }

        return num == 0;
    }
}

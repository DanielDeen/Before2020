package exercise.week02.LC258;

/**
 * @description: 各位相加
 * @author: Daniel Deen
 * @create: 2020-11-02 00:21
 */

public class LC258S2 {

    public static void main(String[] args) {
        System.out.println(addDigits(32));
    }

    public static int addDigits(int num) {
        if (num < 10) return num;
        int index = 0;
        while (num != 0) {
            index += num % 10;
            num /= 10;
        }

        return addDigits(index);
    }
}

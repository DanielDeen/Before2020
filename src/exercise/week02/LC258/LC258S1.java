package exercise.week02.LC258;

/**
 * @description: 各位相加
 * @author: Daniel Deen
 * @create: 2020-10-30 23:21
 */

public class LC258S1 {
    public static void main(String[] args) {
        int num = 1111;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        String s = num + "";
        if (num / 10 > 0) {
            num = 0;
            for (char c : s.toCharArray()) {
                num += Integer.parseInt(c+"");
            }
            num = addDigits(num);
        }
        return num;
    }
}

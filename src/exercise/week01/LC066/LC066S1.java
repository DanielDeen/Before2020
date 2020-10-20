package exercise.week01.LC066;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @description: 加一
 * @author: Daniel Deen
 * @create: 2020-10-20 07:39
 */

public class LC066S1 {
    public static void main(String[] args) {
        int[] digits = {9 , 8 , 7};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length -1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] % 10 != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

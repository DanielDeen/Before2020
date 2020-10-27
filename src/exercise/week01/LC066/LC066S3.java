package exercise.week01.LC066;

/**
 * @description: 加一
 * @author: Daniel Deen
 * @create: 2020-10-28 00:24
 */

public class LC066S3 {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1; i>=0;i--) {
            digits[i] = (digits[i] + 1) % 10;
            if(digits[i] % 10 != 0) return digits;
        }

        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
}

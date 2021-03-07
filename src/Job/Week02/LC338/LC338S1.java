package Job.Week02.LC338;

import java.util.Arrays;

/**
 * @description: 338.比特位计数
 * @author: Daniel Deen
 * @create: 2021-03-03 22:53
 */

public class LC338S1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LC338S1().countBits(5)));
    }


    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = countBit(i);
        }

        return res;
    }

    public int countBit(int i) {
        int res = 0;
        while (i > 0) {
            if ((i & 1) == 1) res++;
            i >>= 1;
        }
        return res;
    }
}

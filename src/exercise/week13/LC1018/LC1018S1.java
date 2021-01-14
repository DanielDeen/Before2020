package exercise.week13.LC1018;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 1018.可被5整除的二进制前缀
 * @author: Daniel Deen
 * @create: 2021-01-14 01:08
 */

public class LC1018S1 {
    public static void main(String[] args) {
        System.out.println(new LC1018S1().prefixesDivBy5(new int[]{0, 1, 1, 1, 1, 1}));
    }


    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>(A.length);
        int len = A.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            res = ((res << 1) + A[i]) % 5;
            result.add(res % 5 == 0);
        }
        return result;
    }
}

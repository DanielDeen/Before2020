package exercise.week13.LC989;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 989.数组形式的整数加法
 * @author: Daniel Deen
 * @create: 2021-01-22 19:01
 */

public class LC989S1 {
    public static void main(String[] args) {
        System.out.println(new LC989S1().addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
    }


    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        int len = A.length;
        for (int i = len - 1; i >= 0; i--) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                K++;
                sum -= 10;
            }
            res.add(0, sum);
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }
}

package exercise.week16.LC888;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @description: 888.公平的糖果棒交换
 * @author: Daniel Deen
 * @create: 2021-02-01 00:12
 */

public class LC888S1 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int del = (sumA - sumB) / 2;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }
        int[] res = new int[2];
        for (int b : B) {
            int x = b + del;
            if (set.contains(x)) {
                res[0] = x;
                res[1] = b;
                break;
            }
        }
        return res;
    }
}

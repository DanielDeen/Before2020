package LeetCodeRode.DreamOffer.Chapter000;

import java.util.*;

/**
 * @description: 只出现一次的数字: 算法具有线性时间复杂度，不适用额外空间
 * @author: Daniel Deen
 * @create: 2020-09-17 23:09
 */

public class LC001 {
    // [2, 2, 1]  --> 1
    // [4, 1, 2, 1, 2] --> 4
    public static void main(String[] args) {
        int[] t = {4, 1, 2, 1, 2};
        System.out.println(singleNumberBest(t));
    }

    private static int singleNumber(int[] nums) {
        Set<Integer> s  = new HashSet<>();
        for (int num : nums) {
            if (s.contains(num)) {
                s.remove(num);
                continue;
            }
            s.add(num);
        }
        return (int)s.toArray()[0];
    }

    /*
     * 位运算
     * 异或操作三性质
     * 1. 任何数和 0 做异或，结果任是原来的数
     * 2. 任何数和 自身 做异或，结果是 0
     * 3. 异或满足交换律和结合律
     */

    private static int singleNumberBest(int[] nums) {
        int i = 0;
        for (int num : nums) {
            i ^= num;
        }
        return i;
    }
}

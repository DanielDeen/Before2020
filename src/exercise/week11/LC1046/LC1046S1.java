package exercise.week11.LC1046;

import java.util.Arrays;

/**
 * @description: 1046.最后一块石头的重量
 * @author: Daniel Deen
 * @create: 2020-12-30 01:24
 */

public class LC1046S1 {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) return stones[0];
        Arrays.sort(stones);
        int index = stones.length - 2;
        int len = stones.length - 1;
        while (stones[index] > 0) {
            stones[len] = stones[len] - stones[index];
            stones[index] = 0;
            Arrays.sort(stones);
        }
        return stones[len];
    }
}

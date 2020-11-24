package exercise.week06.LC322;

import java.util.Arrays;

/**
 * @description: 零钱兑换
 * @author: Daniel Deen
 * @create: 2020-11-24 23:05
 */

public class LC322S1 {
    public static void main(String[] args) {
        System.out.println(new LC322S1().coinChange(new int[]{1, 2, 5}, 11));
    }

    int min = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        Arrays.sort(coins);
        countCoin(coins, amount, coins.length - 1, 0);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private void countCoin(int[] coins, int amount, int index, int count) {
        if (amount == 0) {
            min = Math.min(min, count);
            return;
        }
        if (index < 0) return;
        for (int i = amount / coins[index]; i >= 0 && i + count < min; i--) {
            countCoin(coins, amount - i * coins[index], index -1, count + i);
        }

    }
}

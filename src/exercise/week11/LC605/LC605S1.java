package exercise.week11.LC605;

import sun.font.DelegatingShape;

/**
 * @description: 605.种花的问题
 * @author: Daniel Deen
 * @create: 2021-01-01 00:11
 */

public class LC605S1 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; ) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                count++;
                i += 2;
            } else {
                i += 3;
            }
        }
        return count >= n;
    }
}

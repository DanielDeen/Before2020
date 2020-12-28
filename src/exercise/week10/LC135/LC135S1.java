package exercise.week10.LC135;

/**
 * @description: 135.分发糖果
 * @author: Daniel Deen
 * @create: 2020-12-24 01:48
 */

public class LC135S1 {
    public int candy(int[] ratings) {
        int res = 0;
        int[] left = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            if (i > 0 && ratings[i - 1] < ratings[i]) left[i] = left[i - 1] + 1;
            else left[i] = 1;
        }
        int[] right = new int[ratings.length];
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i < ratings.length - 1 && ratings[i] > ratings[i + 1]) right[i] = right[i + 1] + 1;
            else right[i] = 1;

            res += Math.max(left[i], right[i]);
        }

        return res;
    }
}

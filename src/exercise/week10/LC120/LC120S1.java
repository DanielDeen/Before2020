package exercise.week10.LC120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @description: 120.三角形最小路径和
 * @author: Daniel Deen
 * @create: 2020-12-23 00:23
 */

public class LC120S1 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(6,5,7));
        list.add(Arrays.asList(4,1,8,3));

        System.out.println(new LC120S1().minimumTotal(list));
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                else if (i == j) dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                else dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
            }
        }

        return Arrays.stream(dp[m - 1]).min().getAsInt();
    }
}

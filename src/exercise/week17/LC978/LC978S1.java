package exercise.week17.LC978;

/**
 * @description: 978.最长湍流子数组
 * @author: Daniel Deen
 * @create: 2021-02-08 00:00
 */

public class LC978S1 {
    public int maxTurbulenceSize(int[] arr) {
        int res = 1;
        int n = arr.length;
        int dp0 = 1, dp1 = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                dp0 = dp1 + 1;
                dp1 = 1;
            } else if (arr[i - 1] < arr[i]) {
                dp1 = dp0 + 1;
                dp0 = 1;
            } else {
                dp0 = 1;
                dp1 = 1;
            }
            res = Math.max(Math.max(dp0, dp1), res);
        }
        return res;
    }
}

package exercise.week11.LC152;

import com.sun.jmx.snmp.SnmpNull;

/**
 * @description: 152.乘积最大子数组
 * @author: Daniel Deen
 * @create: 2020-12-31 01:13
 */

public class LC152S1 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);

            max = Math.max(max, imax);
        }

        return max;
    }
}

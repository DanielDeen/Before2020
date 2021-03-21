package Job.week04;

/**
 * @description: 4.寻找两有序数组的中位数
 * @author: Daniel Deen
 * @create: 2021-03-19 00:00
 */

public class LC004S3 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 > len2) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int k = (len1 + len2 + 1) / 2;
        int left = 0;
        int right = len1;
        while (left < right) {
            int m1 = left + (right - left) / 2;
            int m2 = k - m1;
            if (nums1[m1] < nums2[m2 - 1]) {
                left++;
            } else {
                right = m1;
            }
        }

        int m1 = left;
        int m2 = k - left;

        int r1 = Math.max(m1 <= 0 ? Integer.MIN_VALUE : nums1[m1 - 1],
                m2 <= 0 ? Integer.MIN_VALUE : nums2[m2 - 1]);

        if ((k & 1) == 1) {
            return r1;
        }

        int r2 = Math.min(m1 >= len1 ? Integer.MAX_VALUE : nums1[m1],
                m2 >= len2 ? Integer.MAX_VALUE : nums2[m2]);
        return (r1 + r2) * 0.5;
    }
}

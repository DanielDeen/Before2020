package exercise.week01.LC088;

/**
 * @description: 合并两个有序数组
 * @author: Daniel Deen
 * @create: 2020-10-28 00:16
 */

public class LC088S3 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s = m + n -1;
        int p1 = m -1 ;
        int p2 = n - 1;
        while (p1 >= 0 && p2 >=0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[s] = nums1[p1];
                p1--;
            } else {
                nums1[s] = nums2[p2];
                p2--;
            }
            s--;
        }
        System.arraycopy(nums2, 0, nums1, 0, p2+1);
    }
}

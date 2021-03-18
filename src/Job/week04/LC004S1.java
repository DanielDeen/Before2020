package Job.week04;

/**
 * @description: 4.寻找两个正序数组的中位数
 * @author: Daniel Deen
 * @create: 2021-03-16 23:51
 */

public class LC004S1 {
    public static void main(String[] args) {
        System.out.println(new LC004S1().findMedianSortedArrays(
                new int[]{1, 3},
                new int[]{2}
        ));
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res;
        int len1 = nums1.length, len2 = nums2.length;
        int len = len1 + len2;
        if ((len & 1) == 1) {
            int mid = len / 2;
            res = getKthElement(nums1, nums2, mid + 1);
        } else {
            int mid1 = len / 2 - 1, mid2 = len / 2;
            res = (getKthElement(nums1, nums2, mid1 + 1) + getKthElement(nums1, nums2, mid2 + 1)) / 2.0;
        }
        return res;
    }

    private double getKthElement(int[] nums1, int[] nums2, int midIndex) {
        int len1 = nums1.length, len2 = nums2.length;
        int index1 = 0, index2 = 0;

        while (true) {
            if (index1 == len1) {
                return nums2[index2 + midIndex - 1];
            }
            if (index2 == len2) {
                return nums1[index1 + midIndex - 1];
            }
            if (midIndex == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            int mid = midIndex / 2;
            int newIndex1 = Math.min(index1 + mid, len1) - 1;
            int newIndex2 = Math.min(index2 + mid, len2) - 1;
            int pivot1 = nums1[newIndex1], pivot2 = nums2[newIndex2];
            if (pivot1 <= pivot2) {
                midIndex -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                midIndex -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }
}

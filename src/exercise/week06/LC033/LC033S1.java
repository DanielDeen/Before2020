package exercise.week06.LC033;

/**
 * @description: 33.搜索旋转排序数组
 * @author: Daniel Deen
 * @create: 2020-11-28 23:50
 */

public class LC033S1 {
    public static void main(String[] args) {
        System.out.println(new LC033S1().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    public int search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target) return mid;

            if (nums[begin] <= nums[mid]) {
                if (nums[begin] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}

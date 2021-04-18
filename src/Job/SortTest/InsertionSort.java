package Job.SortTest;

import java.util.Arrays;

/**
 * @description: 插入排序
 * @author: Daniel Deen
 * @create: 2021-03-07 14:28
 */

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 4, 3, 3, 2, 1, 1};
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
        insertionSort(nums);
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
    }

    public static void insertionSort(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int index = i - 1;
            int cur = nums[i];
            while (index >= 0 && nums[index] > cur) {
                nums[index + 1] = nums[index];
                index--;
            }
            nums[++index] = cur;
        }
    }
}

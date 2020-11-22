package exercise.week05.LCTest002;

/**
 * @description: Jump
 * @author: Daniel Deen
 * @create: 2020-11-22 14:04
 */

public class LCTest002 {
    public static void main(String[] args) {
        System.out.println(new LCTest002().jump(new int[]{2, 3, 1, 1, 4}));
    }

    public int jump(int[] nums) {
        // 从后往前算
        int index = nums.length - 1;
        int step = 0;
        while (index > 0) {
            for (int i = 0; i < index; i++) {
                if (i + nums[i] >= index) {
                    index = i;
                    step++;
                    break;
                }
            }
        }

        return step;
    }
}

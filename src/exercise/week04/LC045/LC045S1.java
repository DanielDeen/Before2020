package exercise.week04.LC045;

/**
 * @description: 跳跃游戏II
 * @author: Daniel Deen
 * @create: 2020-11-15 23:37
 */

public class LC045S1 {
    public static void main(String[] args) {
        System.out.println(new LC045S1().jump(new int[]{2, 3, 1, 1, 4}));
    }

    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
}

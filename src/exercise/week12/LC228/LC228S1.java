package exercise.week12.LC228;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 228.汇总区间
 * @author: Daniel Deen
 * @create: 2021-01-10 23:44
 */

public class LC228S1 {

    public static void main(String[] args) {
        System.out.println(new LC228S1().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;
        res.add(nums[0] + "");
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                String lastStr = res.get(res.size() - 1);
                String temp = lastStr.split("->")[0] + "->" + nums[i];
                res.remove(res.size() - 1);
                res.add(temp);
            } else {
                res.add(nums[i] + "");
            }
        }
        return res;
    }

    public List<String> summaryRanges1(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums == null || nums.length == 0) return list;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) continue;
            StringBuilder sb = new StringBuilder().append(nums[index]);
            if (index != i-1) sb.append("->").append(nums[i-1]);
            list.add(sb.toString());
            index = i;
        }
        StringBuilder sb = new StringBuilder().append(nums[index]);
        if (index != nums.length -1) sb.append("->").append(nums[nums.length -1]);
        list.add(sb.toString());
        return list;
    }

}

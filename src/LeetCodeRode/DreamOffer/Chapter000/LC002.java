package LeetCodeRode.DreamOffer.Chapter000;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @description: 多数元素： 给定一个大小为 n 的数组，找出其中的多数元素
 * @author: Daniel Deen
 * @create: 2020-09-18 00:08
 */

public class LC002 {
    public static void main(String[] args) {
        int[] t = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(t));
    }

    private static int majorityElement(int[] nums) {

        // Arrays.sort(nums);
        // return nums[nums.length/2];

        Map<Integer, Integer> mapT = new HashMap<>();
        for (int num : nums) {
            mapT.put(num, mapT.containsKey(num) ? mapT.get(num) + 1 : 1);
        }
        Object[] list = mapT
                .entrySet()
                .stream()
                .filter(map -> map.getValue()>nums.length/2)
                .map(Map.Entry::getKey).toArray();
        return (int)list[0];
    }
}

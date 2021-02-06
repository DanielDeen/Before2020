package exercise.week16.LC1208;

/**
 * @description: 1208.尽可能使字符串相等
 * @author: Daniel Deen
 * @create: 2021-02-06 23:34
 */

public class LC1208S1 {
    public int equalSubstring(String s, String t, int maxCost) {
        int len = s.length();
        int start = 0;
        int end = 0;
        int sum = 0;
        int res = 0;
        while (end < len) {
            int ava = Math.abs(s.charAt(end) - t.charAt(end));
            sum += ava;
            while (sum > maxCost) {
                sum -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            int tmp = end - start + 1;
            res = Math.max(res, tmp);
            end++;
        }
        return res;
    }
    /**
     * public int findSubArray(nums) {
     *
     *         int len=nums.length;//数组或字符串长度
     *         int left=0,right=0; //双指针，表示当前遍历的区间[left, right]，闭区间
     *
     *         int sums=0；//用于统计子数组/子区间是否有效，根据题目可能会改成求和/计数
     *         int maxLength = 0 //保存最大的满足题目要求的子数组/子串长度
     *
     *         while(right<len){ //当右边的指针没有搜索到数组/字符串的结尾
     *             sums=sums+array[right];//增加当前右边指针的数字/字符的求和/计数
     *             while(区间[left, right]不符合题意){//此时需要一直移动左指针，直至找到一个符合题意的区间
     *                 sums=sums-array[left];// 移动左指针前需要从counter中减少left位置字符的求和/计数
     *                 left++;//真正的移动左指针，注意不能跟上面一行代码写反
     *             }
     *             //到内层的while结束时，我们找到了一个符合题意要求的子数组/子串
     *             maxLength=Math.max(maxLength,right-left+1);
     *             right++; //移动右指针，去探索新的区间
     *         }
     *         return maxLength;//找到符合题意的子数组/子字符串长度
     *     }
     * }
     */
}

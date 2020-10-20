package exercise.week01.LC070;

/**
 * @description: 爬楼梯
 * @author: Daniel Deen
 * @create: 2020-10-20 07:25
 */

public class LC070S2 {
    public static void main(String[] args) {
        int sum = 3;
        System.out.println(climber(sum));
    }

//    private static int climber(int sum) {
//        if (sum == 1) return 1;
//        if (sum == 2) return 2;
//
//        int[] s = new int[sum+1];
//        s[1] = 1;
//        s[2] = 2;
//        for (int i = 3; i <= sum; i++) {
//            s[i] = s[i-1] + s[i-2];
//        }
//
//        return s[sum];
//    }

    private static int climber(int sum) {
        if (sum == 1) return 1;
        if (sum == 2) return 2;

        int res_pre_pre = 1;
        int res_pre = 2;
        int res = 0;
        for (int i = 3; i <= sum; i++) {
            res = res_pre + res_pre_pre;
            res_pre_pre = res_pre;
            res_pre = res;
        }

        return res;
    }
}

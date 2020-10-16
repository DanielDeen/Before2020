package TestPackage;

/**
 * @description: try/catch过程
 * @author: Daniel Deen
 * @create: 2020-09-05 15:31
 */

public class OctTest1 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(test(n));
    }

    private static int test(int n) {
        int[] num = {1,2,3,4};
        try {
            int ret = num[n] *2;
            return ret;
        } catch (Exception e){
            return n*3;
        } finally {
            if (n == 2) {
                return 0;
            }
        }
    }
}

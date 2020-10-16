package TestPackage;

/**
 * @description: 通用规范学习
 * @author: Daniel Deen
 * @create: 2020-09-04 00:35
 */

public class NaNTest {

    public static void main(String[] args) {
        double num = 0.0d;
        double result = Math.cos( 1/ num);

        if (result == Double.NaN) {
            System.out.println("result is NaN001");
        }

        if (Double.isNaN(result)) {
            System.out.println("result is NaN002");
        }
    }
}

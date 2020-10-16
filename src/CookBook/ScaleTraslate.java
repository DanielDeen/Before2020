package CookBook;

/**
 * @description: 进制之间的转换
 * @author: Daniel Deen
 * @create: 2020-08-31 23:41
 */

public class ScaleTraslate {
    public static void main(String[] args) {
        String input = "101010";
        for (int radix : new int[]{2,8,10,16,36}){
            System.out.println( input + " in base " + radix + " is " +
                    Integer.valueOf(input, radix));
            int i = 42;
            System.out.println( i + " format in base " + radix + " is " +
                    Integer.toString(i, radix));
        }
//        // 二进制
//        Integer.toBinaryString();
//        // 十六进制
//        Integer.toHexString();
//        // 八进制
//        Integer.toOctalString();
    }
}

package exercise.week10.LC008;

/**
 * @description: 8.字符串转换整数(atoi)
 * @author: Daniel Deen
 * @create: 2020-12-22 00:46
 */

public class LC008S1 {
    public int myAtoi(String s) {
        String sP = s.replace(" ", "");
        String res = "";
        for (int i = 0; i < sP.length(); i++) {
            if (res.length() == 0 && sP.charAt(i) > '0' && sP.charAt(i) < '9' ) {
                continue;
            }
        }


        return res.length() == 0 ? 0 : Integer.parseInt(res);
    }
}

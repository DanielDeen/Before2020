package Job.Week03.LC331;

/**
 * @description: 331.验证二叉树的前序序列化
 * @author: Daniel Deen
 * @create: 2021-03-12 23:19
 */

public class LC331S1 {
    public boolean isValidSerialization(String preorder) {
        int n = preorder.length();
        int index = 0;
        int slots = 1;
        while (index < n) {
            if (slots == 0) {
                return false;
            }

            if (preorder.charAt(index) == ',') {
                index++;
            } else if (preorder.charAt(index) == '#') {
                slots--;
                index++;
            } else {
                while (index < n && preorder.charAt(index) != ',') {
                    index++;
                }
                slots++;
            }
        }
        return slots == 0;
    }
}

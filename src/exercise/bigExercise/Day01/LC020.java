package exercise.bigExercise.Day01;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @description: 20.有效的括号
 * @author: Daniel Deen
 * @create: 2020-11-25 00:50
 */

public class LC020 {
    public static void main(String[] args) {
        System.out.println(new LC020().isValid("()[]{}"));
    }

    public boolean isValid(String s) {
        char[] tree = new char[s.length()];
        int index = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                tree[index++] = c;
            } else {
                if (index > 0) {
                    char f = tree[--index];
                    boolean valid = true;
                    if (f == '(') {
                        valid = (c == f + 1);
                    } else {
                        valid = (c == f + 2);
                    }
                    if (!valid) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (index > 0) {
            return false;
        }
        return true;
    }
}

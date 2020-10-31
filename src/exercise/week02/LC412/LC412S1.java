package exercise.week02.LC412;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: FizzBuzz
 * @author: Daniel Deen
 * @create: 2020-10-29 23:48
 */

public class LC412S1 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList();

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i %5 == 0) {
                list.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            }
            if (i %5 == 0) {
                list.add("Buzz");
                continue;
            }
            list.add(i + "");
        }
        return list;
    }
}

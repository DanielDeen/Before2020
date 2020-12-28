package exercise.week10.LCTest002;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 水果酥饼日
 * @author: Daniel Deen
 * @create: 2020-12-25 01:28
 */

public class LCTest002 {
    boolean found;
    public List<Integer> minimalFruitPie() {
        List<Integer> res = new ArrayList<>();
        for (int i = 2;; i++) {

            int[] used = new int[i];

            if (found) {
                return res;
            }
        }
    }
}

package exercise.week08.LC860;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @description: 860.柠檬水找零
 * @author: Daniel Deen
 * @create: 2020-12-10 01:13
 */

public class LC860S1 {
    public boolean lemonadeChange(int[] bills) {
        int fiveCoins = 0;
        int tenCoins = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fiveCoins++;
            }
            if (bill == 10) {
                fiveCoins--;
                tenCoins++;
            }
            if (bill == 20) {
                if (tenCoins > 0) {
                    tenCoins--;
                    fiveCoins--;
                } else {
                    fiveCoins -= 3;
                }
            }

            if (fiveCoins < 0) return false;
        }

        return true;
    }
}

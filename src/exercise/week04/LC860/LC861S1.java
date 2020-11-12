package exercise.week04.LC860;

/**
 * @description: 柠檬水找零
 * @author: Daniel Deen
 * @create: 2020-11-12 21:44
 */

public class LC861S1 {

    public static void main(String[] args) {
        System.out.println(new LC861S1().lemonadeChange(new int[]{5, 5, 5, 10, 20}));
    }

    public boolean lemonadeChange(int[] bills) {
        int fiveCoins = 0;
        int tenCoins = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveCoins++;
            } else if (bill == 10) {
                fiveCoins--;
                tenCoins++;
            } else if (tenCoins > 0) {
                tenCoins--;
                fiveCoins--;
            } else {
                fiveCoins -= 3;
            }

            if (fiveCoins < 0) return false;
        }
        return true;
    }
}

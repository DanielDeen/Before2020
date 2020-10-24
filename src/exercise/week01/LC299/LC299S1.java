package exercise.week01.LC299;

/**
 * @description: 猜数字游戏
 * @author: Daniel Deen
 * @create: 2020-10-24 22:55
 */

public class LC299S1 {
    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0111";

        System.out.println(getHint(secret, guess));
    }

    public static String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;

        int[] numbers = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));

            if (s == g) bull++;
            else {
                if (numbers[s] < 0) cow++;
                if (numbers[g] > 0) cow++;

                numbers[s]++;
                numbers[g]--;
            }
        }

        return bull + "A" + cow + "B";
    }
}

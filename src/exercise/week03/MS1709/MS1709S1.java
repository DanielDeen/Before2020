package exercise.week03.MS1709;

/**
 * @description: 第K个数
 * @author: Daniel Deen
 * @create: 2020-11-08 09:33
 */

public class MS1709S1 {
    public static void main(String[] args) {
        System.out.println(new MS1709S1().getKthMagicNumber(5));
    }


    public int getKthMagicNumber(int k) {
        int[] numList = new int[k + 1];
        int p3 = 0;
        int p5 = 0;
        int p7 = 0;
        numList[0] = 1;

        for (int i = 1; i < k; i++) {
            numList[i] = Math.min(Math.min(numList[p3] * 3, numList[p5] * 5), numList[p7] * 7);
            if (numList[i] == numList[p3] * 3) p3++;
            if (numList[i] == numList[p5] * 5) p5++;
            if (numList[i] == numList[p7] * 7) p7++;
        }
        return numList[k - 1];
    }
}

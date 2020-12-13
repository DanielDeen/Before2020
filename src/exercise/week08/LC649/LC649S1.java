package exercise.week08.LC649;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 649.Dota2参议院
 * @author: Daniel Deen
 * @create: 2020-12-11 01:13
 */

public class LC649S1 {

    public static void main(String[] args) {
        System.out.println(new LC649S1().predictPartyVictory2("RDD"));
    }

    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> Rqueue = new LinkedList<>();
        Queue<Integer> Dqueue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                Rqueue.offer(i);
            } else {
                Dqueue.offer(i);
            }
        }

        while (!Rqueue.isEmpty() && !Dqueue.isEmpty()) {
            int RIndex = Rqueue.poll();
            int DIndex = Dqueue.poll();
            if (RIndex > DIndex) {
                Dqueue.offer(DIndex + n);
            } else {
                Rqueue.offer(RIndex + n);
            }
        }

        return Rqueue.isEmpty() ? "Dire" : "Radiant";
    }

    public String predictPartyVictory2(String senate) {
        boolean R = true, D = true;
        int person = 0;
        char[] chars = senate.toCharArray();
        while (R && D) {
            R = false;
            D = false;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'R') {
                    R = true;
                    if (person < 0) {
                        chars[i] = '0';
                    }
                    person++;
                } else if (chars[i] == 'D') {
                    D = true;
                    if (person > 0) {
                        chars[i] = '0';
                    }
                    person--;
                }
            }
        }
        return person > 0 ? "Radiant" : "Dire";
    }
}

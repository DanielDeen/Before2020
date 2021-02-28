package Job.Week01.LC1178;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 1178.猜字谜
 * @author: Daniel Deen
 * @create: 2021-02-26 23:41
 */

public class LC1178S1 {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> res = new ArrayList<>();

        // 2^26的数组会爆内存。因此用HashMap，存放每种状态的个数
        Map<Integer, Integer> state = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int temp = 0;
            for (int j = 0; j < s.length(); j++) {
                temp = temp | (1 << s.charAt(j) - 'a');
            }
            state.put(temp, state.getOrDefault(temp, 0) + 1);
        }

        for (int i = 0; i < puzzles.length; i++) {
            String s = puzzles[i];
            int temp = 0;
            for (int j = 0; j < s.length(); j++) {
                temp = temp | (1 << s.charAt(j) - 'a');
            }
            int cnt = 0;
            for (int k = temp; k != 0; k = (k - 1) & temp) {
                if ((1 << (s.charAt(0) - 'a') & k) != 0) cnt += state.getOrDefault(k, 0);
            }
            res.add(cnt);
        }
        return res;
    }
}

package AiStart;

import java.util.*;

/**
 * @program Before2020
 * @description: 692.前k个高频单词
 * @author: ding
 * @create: 2021/05/20 23:19
 */
public class LC692S1 {
	public List<String> topKFrequent(String[] words, int k) {
		Map<String, Integer> map = new HashMap<>();
		for (String w : words) {
			map.put(w, map.getOrDefault(w, 0) + 1);
		}
		List<String> rec = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			rec.add(entry.getKey());
		}
		Collections.sort(rec, (word1, word2) -> map.get(word1).equals(map.get(word2)) ? word1.compareTo(word2) : map.get(word2) - map.get(word1));
		return rec.subList(0, k);
	}
}

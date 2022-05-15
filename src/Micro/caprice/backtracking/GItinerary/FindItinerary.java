package Micro.caprice.backtracking.GItinerary;

import java.util.*;

/**
 * @program Before2020
 * @description: 332. 重新安排行程
 * @author: ding
 * @create: 2022/05/15 22:43
 */
public class FindItinerary {
	Deque<String> res;
	Map<String, Map<String, Integer>> map;

	// 输入：
	// tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]


	public List<String> findItinerary(List<List<String>> tickets) {
		map = new HashMap<>();
		res = new LinkedList<>();

		for (List<String> ti : tickets) {
			Map<String, Integer> temp;
			if (map.containsKey(ti.get(0))) {
				temp = map.get(ti.get(0));
				temp.put(ti.get(1), temp.getOrDefault(ti.get(1), 0) + 1);
			} else {
				temp = new TreeMap<>();
				temp.put(ti.get(1), 1);
			}

			map.put(ti.get(0), temp);
		}

		res.add("JFK");
		backtracking(tickets.size());
		return new ArrayList<>(res);

	}

	private boolean backtracking(int ticketNum) {
		if (res.size() == ticketNum + 1) {
			return true;
		}
		String last = res.getLast();
		if (map.containsKey(last)) {
			for (Map.Entry<String, Integer> target : map.get(last).entrySet()) {
				int count = target.getValue();
				if (count > 0) {
					res.add(target.getKey());
					target.setValue(count - 1);
					if (backtracking(ticketNum)) {
						return true;
					}
					res.removeLast();
					target.setValue(count);
				}
			}
		}
		return false;
	}
}

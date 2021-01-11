package exercise.week13.LC1202;

import java.util.*;

/**
 * @description: 1202.交换字符串中的元素
 * @author: Daniel Deen
 * @create: 2021-01-11 23:08
 */

public class LC1202S1 {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        UnionFind unionFind = new UnionFind(s.length());
        for (List<Integer> pair : pairs) {
            unionFind.union(pair.get(0), pair.get(1));
        }

        Map<Integer, List<Character>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int parent = unionFind.find(i);
            if (!map.containsKey(parent)) {
                map.put(parent, new ArrayList<>());
            }
            map.get(parent).add(s.charAt(i));
        }
        for (Map.Entry<Integer, List<Character>> entry : map.entrySet()) {
            Collections.sort(entry.getValue(), (o1, o2) -> o2 - o1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int x = unionFind.find(i);
            List<Character> list = map.get(x);
            sb.append(list.remove(list.size() - 1));
        }
        return sb.toString();
    }

    class UnionFind {
        int[] f;
        int[] rank;
        int n;

        public UnionFind(int n) {
            f = new int[n];
            rank = new int[n];
            this.n = n;

            Arrays.fill(rank, 1);
            for (int i = 0; i < n; i++) {
                f[i] = i;
            }
        }

        public int find(int x) {
            return f[x] == x ? x : (f[x] = find(f[x]));
        }

        public void union(int x, int y) {
            int fx = find(x);
            int fy = find(y);
            if (fx == fy) return;
            if (rank[fx] < rank[fy]) {
                int temp = fx;
                fx = fy;
                fy = temp;
            }

            rank[fx] += rank[fy];
            f[fy] = fx;

        }
    }
}

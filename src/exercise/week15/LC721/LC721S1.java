package exercise.week15.LC721;

import java.util.*;

/**
 * @description: 721.账户合并
 * @author: Daniel Deen
 * @create: 2021-01-24 11:34
 */

public class LC721S1 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailToIndex = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        int emailCount = 0;

        for (List<String> account : accounts) {
            String name = account.get(0);
            int size = account.size();

            for (int i = 0; i < size; i++) {
                String email = account.get(i);
                if (!emailToIndex.containsKey(email)) {
                    emailToIndex.put(email, emailCount++);
                    emailToName.put(email, name);
                }
            }
        }

        UnionFind unionFind = new UnionFind(emailCount);
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            int firstIndex = emailToIndex.get(firstEmail);
            int size = account.size();

            for (int i = 2; i < size; i++) {
                String nexEmail = account.get(i);
                int nextIndex = emailToIndex.get(nexEmail);
                unionFind.union(firstIndex, nextIndex);
            }
        }

        Map<Integer, List<String>> indexToEmails = new HashMap<>();
        for (String email : emailToIndex.keySet()) {
            int index = unionFind.find(emailToIndex.get(email));
            List<String> account = indexToEmails.getOrDefault(index, new ArrayList<>());
            account.add(email);
            indexToEmails.put(index, account);
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> emails :
                indexToEmails.values()) {
            Collections.sort(emails);
            String name = emailToName.get(emails.get(0));
            List<String> account = new ArrayList<>();
            account.add(name);
            account.addAll(emails);
            res.add(account);
        }
        return res;
    }


    class UnionFind {
        int[] parent;
        //int size;


        public UnionFind(int n) {
            this.parent = new int[n];
            //this.size = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }

            parent[rootX] = rootY;
            // size--;
        }

        public int find(int x) {
            return parent[x] == x ? x : find(parent[x]);
        }
    }
}

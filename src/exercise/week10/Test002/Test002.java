package exercise.week10.Test002;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description: test002
 * @author: Daniel Deen
 * @create: 2020-12-27 22:06
 */

public class Test002 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList.size() == 0 || !wordList.contains(endWord)) return 0;

        Set<String> wordSet = new HashSet<>();
        wordSet.addAll(wordList);

        Set<String> headSet = new HashSet<>();
        headSet.add(beginWord);

        Set<String> tailSet = new HashSet<>();
        tailSet.add(endWord);

        return dfs(headSet, tailSet, wordSet, 2);
    }

    private int dfs(Set<String> headSet, Set<String> tailSet, Set<String> wordSet, int depth) {
        if (headSet.size() > tailSet.size()) {
            return dfs(tailSet, headSet, wordSet, depth);
        }
        if (headSet.isEmpty()) {
            return 0;
        }
        wordSet.remove(headSet);
        Set<String> nextSet = new HashSet<>();
        for (String headString : headSet) {
            char[] heads = headString.toCharArray();
            for (int i = 0; i < heads.length; i++) {
                char curChar = heads[i];
                for (char j = 'a'; j <= 'z'; j++) {
                    heads[i] = j;
                    String newWord = new String(heads);
                    if (wordSet.contains(newWord)) {
                        if (tailSet.contains(newWord)) {
                            return depth;
                        }
                        nextSet.add(newWord);
                    }
                }
                heads[i] = curChar;
            }
        }
        return dfs(nextSet, tailSet, wordSet, depth + 1);
    }
}

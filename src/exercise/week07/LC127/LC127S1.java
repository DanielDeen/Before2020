package exercise.week07.LC127;

import java.util.HashSet;
import java.util.List;

/**
 * @description: 127.单词接龙
 * @author: Daniel Deen
 * @create: 2020-12-05 00:08
 */

public class LC127S1 {
    public static void main(String[] args) {

    }


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList.size() == 0 || !wordList.contains(endWord)) return 0;

        HashSet<String> wordSet = new HashSet<>();
        wordSet.addAll(wordList);

        HashSet<String> headSet = new HashSet<>();
        headSet.add(beginWord);

        HashSet<String> tailSet = new HashSet<>();
        tailSet.add(endWord);

        return dfs(headSet, tailSet, wordSet, 2);
    }

    private int dfs(HashSet<String> headSet, HashSet<String> tailSet, HashSet<String> wordSet, int depth) {
        if (headSet.size() > tailSet.size()) {
            return dfs(tailSet, headSet, wordSet, depth);
        }

        if (headSet.isEmpty()) {
            return 0;
        }

        wordSet.removeAll(headSet);

        HashSet<String> nextSet = new HashSet<>();
        for (String headWord : headSet) {
            char[] wordChars = headWord.toCharArray();
            for (int i = 0; i < wordChars.length; i++) {
                char curChar = wordChars[i];
                for (char j = 'a'; j < 'z'; j++) {
                    wordChars[i] = j;
                    String newWord = new String(wordChars);
                    if (wordSet.contains(newWord)) {
                        if (tailSet.contains(newWord)) {
                            return depth;
                        }
                        nextSet.add(newWord);
                    }
                }
                wordChars[i] = curChar;
            }
        }

        return dfs(wordSet, nextSet, tailSet, depth + 1);
    }
}

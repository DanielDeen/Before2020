package exercise.week10.LC127;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description: 127.单词接龙
 *
 * "ymain"
 * "oecij"
 * ["ymann","yycrj","oecij","ymcnj","yzcrj","yycij","xecij","yecij","ymanj","yzcnj","ymain"]
 * @author: Daniel Deen
 * @create: 2020-12-24 00:24
 */

public class LC127S1 {
    public static void main(String[] args) {
        System.out.println(new LC127S1().ladderLength(
                "ymain","oecij",
                Arrays.asList(new String[]
                        {"ymann","yycrj","oecij","ymcnj","yzcrj","yycij","xecij","yecij","ymanj","yzcnj","ymain"})));
    }
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
        if (headSet.size() > tailSet.size()) return dfs(tailSet, headSet, wordSet, depth);
        if (headSet.isEmpty()) return 0;
        wordSet.removeAll(headSet);
        Set<String> nextSet = new HashSet<>();
        for (String headWord : headSet) {
            char[] wordChar = headWord.toCharArray();
            for (int i = 0; i < wordChar.length; i++) {
                char curChar = wordChar[i];
                for (char j = 'a'; j < 'z'; j++) {
                    wordChar[i] = j;
                    String newWord = new String(wordChar);
                    if (wordSet.contains(newWord)) {
                        if (tailSet.contains(newWord)) {
                            return depth;
                        }
                        nextSet.add(newWord);
                    }
                }
                wordChar[i] = curChar;
            }
        }

        return dfs(nextSet, tailSet, wordSet, depth + 1);
    }
}

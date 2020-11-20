package exercise.week05.LC127;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @description: 单词接龙
 * @author: Daniel Deen
 * @create: 2020-11-16 22:56
 */

public class LC127S1 {

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList(new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        System.out.println(new LC127S1().ladderLength(beginWord, endWord, wordList));
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || !wordList.contains(endWord)) return 0;

        HashSet<String> wordSet = new HashSet<>();
        wordSet.addAll(wordList);

        HashSet<String> headSet = new HashSet<>();
        headSet.add(beginWord);

        HashSet<String> tailSet = new HashSet<>();
        tailSet.add(endWord);

        return deDFS(wordSet, headSet, tailSet, 2);
    }

    private int deDFS(HashSet<String> wordSet, HashSet<String> headSet, HashSet<String> tailSet, int depth) {
        if (headSet.size() > tailSet.size()) {
            return deDFS(wordSet, tailSet, headSet, depth);
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
                for (char j = 'a'; j <= 'z'; j++) {
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

        return deDFS(wordSet, nextSet, tailSet, depth + 1);
    }
}

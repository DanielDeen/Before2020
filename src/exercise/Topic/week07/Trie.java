package exercise.Topic.week07;

/**
 * @description: 208.实现 Trie 树
 * @author: Daniel Deen
 * @create: 2020-12-08 01:29
 */

public class Trie {
    private boolean isEnd;
    private Trie[] next;

    public Trie() {
        isEnd = false;
        next = new Trie[26];
    }

    public void insert(String word) {
        if (word == null || word.length() == 0) return;

        Trie curr = this;
        char[] words = word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            int n = words[i] - 'a';
            if (curr.next[i] == null) curr.next[n] = new Trie();
            curr = curr.next[n];
        }
        curr.isEnd = true;
    }

    public boolean find(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startWith(String pre) {
        Trie node = searchPrefix(pre);
        return node != null;
    }

    private Trie searchPrefix(String word) {
        Trie node = this;
        char[] words = word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            node = node.next[words[i] - 'a'];
            if (node == null) return null;
        }

        return node;
    }
}

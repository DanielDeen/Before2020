package LeetCodeRode.DreamOffer.Chapter001;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 单词拆分：给定一个非空字符串s和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词
 * @author: Daniel Deen
 * @create: 2020-09-25 00:37
 */

public class LC003 {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");

        System.out.println(wordBreak(s, wordDict));

    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        return false;
    }
}

package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindResultantArrayAfterRemovingAnagrams solution. */
public class FindResultantArrayAfterRemovingAnagrams {

    /**
     * Repeatedly removes consecutive anagram pairs until no consecutive anagrams remain.
     * @param words array of strings
     * @return resultant word list
     * <p><b>Explanation:</b> Process greedily: keep a word only if it is not an anagram of the previous one.</p>
     */
    public List<String> solve(String[] words) {
        List<String> result = new ArrayList<>();
        for (String w : words)
            if (result.isEmpty() || !isAnagram(result.get(result.size() - 1), w))
                result.add(w);
        return result;
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freq = new int[26];
        for (char c : a.toCharArray()) freq[c - 'a']++;
        for (char c : b.toCharArray()) if (--freq[c - 'a'] < 0) return false;
        return true;
    }

    public static void main(String[] args) {
        FindResultantArrayAfterRemovingAnagrams sol = new FindResultantArrayAfterRemovingAnagrams();
        System.out.println(sol.solve(new String[]{"abba","baba","bbaa","cd","cd"})); // [abba, cd]
        System.out.println(sol.solve(new String[]{"a","b","c","d","e"}));             // [a, b, c, d, e]
    }

}

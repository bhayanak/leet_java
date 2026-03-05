package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode #692: Top K Frequent Words
 * @see <a href="https://leetcode.com/problems/top-k-frequent-words/">Problem</a>
 */
public class TopKFrequentWords {

    /**
     * LeetCode #692 – Top K Frequent Words
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, String, Trie, Sorting, Heap (Priority Queue), Bucket Sort, Counting
     *
     * Given an array of strings words and an integer k, return the k most
     * frequent strings.
     * 
     * 
     * Return the answer sorted by the frequency from highest to lowest. Sort the
     * words with the same frequency by their lexicographical order.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: words = ["i","love","leetcode","i","love","coding"], k = 2
     * Output: ["i","love"]
     * Explanation: "i" and "love" are the two most frequent words.
     * Note that "i" comes before "love" due to a lower alphabetical order.
     * 
     * Example 2:
     * 
     * Input: words =
     * ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
     * Output: ["the","is","sunny","day"]
     * Explanation: "the", "is", "sunny" and "day" are the four most frequent
     * words, with the number of occurrence being 4, 3, 2 and 1 respectively.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= words.length &lt;= 500
     * 
     * 1 &lt;= words[i].length &lt;= 10
     * 
     * words[i] consists of lowercase English letters.
     * 
     * k is in the range [1, The number of unique words[i]]
     * 
     * 
     * 
     * Follow-up: Could you solve it in O(n log(k)) time and O(n) extra space?
     */
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> freq = new HashMap<>();
        for (String w : words) freq.merge(w, 1, Integer::sum);
        List<String> unique = new ArrayList<>(freq.keySet());
        unique.sort((a,b) -> freq.get(a).equals(freq.get(b)) ? a.compareTo(b) : freq.get(b) - freq.get(a));
        return unique.subList(0, k);
    }

    public static void main(String[] args) {
        TopKFrequentWords sol = new TopKFrequentWords();
        System.out.println(sol.topKFrequent(new String[]{"a","b"}, 0));
    }
}

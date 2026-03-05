package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #677: Map Sum Pairs
 * @see <a href="https://leetcode.com/problems/map-sum-pairs/">Problem</a>
 */
public class MapSumPairs {

    /**
     * LeetCode #677 – Map Sum Pairs
     * Difficulty: MEDIUM
     * Topics: Hash Table, String, Design, Trie
     *
     * Design a map that allows you to do the following:
     * 
     * 
     * Maps a string key to a given value.
     * 
     * Returns the sum of the values that have a key with a prefix equal to a
     * given string.
     * 
     * Implement the MapSum class:
     * 
     * 
     * MapSum() Initializes the MapSum object.
     * 
     * void insert(String key, int val) Inserts the key-val pair into the map. If
     * the key already existed, the original key-value pair will be overridden to
     * the new one.
     * 
     * int sum(string prefix) Returns the sum of all the pairs' value whose key
     * starts with the prefix.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["MapSum", "insert", "sum", "insert", "sum"]
     * [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
     * Output
     * [null, null, 3, null, 5]
     * 
     * Explanation
     * MapSumPairs mapSum = new MapSumPairs();
     * mapSum.insert("apple", 3);
     * mapSum.sum("ap");           // return 3 (apple = 3)
     * mapSum.insert("app", 2);
     * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= key.length, prefix.length &lt;= 50
     * 
     * key and prefix consist of only lowercase English letters.
     * 
     * 1 &lt;= val &lt;= 1000
     * 
     * At most 50 calls will be made to insert and sum.
     */
    private Map<String,Integer> map = new HashMap<>();
    private Map<String,Integer> prefixSum = new HashMap<>();

    public MapSumPairs() {}
    /**
     * Solves the problem: Insert.
     *
     * @param key the key (String)
     * @param val the val (int)
     */
    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key, 0);
        map.put(key, val);
        for (int i = 1; i <= key.length(); i++) {
            String prefix = key.substring(0, i);
            prefixSum.merge(prefix, delta, Integer::sum);
        }
    }
    /**
     * Computes the sum of Sum.
     *
     * @param prefix the prefix (String)
     * @return the computed int result
     */
    public int sum(String prefix) { return prefixSum.getOrDefault(prefix, 0); }

    public static void main(String[] args) {
        MapSumPairs ms = new MapSumPairs();
        ms.insert("apple", 3);
        System.out.println(ms.sum("ap")); // 3
        ms.insert("app", 2);
        System.out.println(ms.sum("ap")); // 5
    }
}

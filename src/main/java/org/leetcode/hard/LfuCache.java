package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * LeetCode #460: LFU Cache
 * @see <a href="https://leetcode.com/problems/lfu-cache/">Problem</a>
 */
public class LfuCache {

    /**
     * LeetCode #460 – LFU Cache
     * Difficulty: HARD
     * Topics: Hash Table, Linked List, Design, Doubly-Linked List
     *
     * Design and implement a data structure for a Least Frequently Used (LFU)
     * cache.
     * 
     * 
     * Implement the LFUCache class:
     * 
     * 
     * LFUCache(int capacity) Initializes the object with the capacity of the data
     * structure.
     * 
     * int get(int key) Gets the value of the key if the key exists in the cache.
     * Otherwise, returns -1.
     * 
     * void put(int key, int value) Update the value of the key if present, or
     * inserts the key if not already present. When the cache reaches its
     * capacity, it should invalidate and remove the least frequently used key
     * before inserting a new item. For this problem, when there is a tie (i.e.,
     * two or more keys with the same frequency), the least recently used key
     * would be invalidated.
     * 
     * To determine the least frequently used key, a use counter is maintained for
     * each key in the cache. The key with the smallest use counter is the least
     * frequently used key.
     * 
     * 
     * When a key is first inserted into the cache, its use counter is set to 1
     * (due to the put operation). The use counter for a key in the cache is
     * incremented either a get or put operation is called on it.
     * 
     * 
     * The functions get and put must each run in O(1) average time complexity.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get",
     * "get"]
     * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
     * Output
     * [null, null, null, 1, null, -1, 3, null, -1, 3, 4]
     * 
     * Explanation
     * // cnt(x) = the use counter for key x
     * // cache=[] will show the last used order for tiebreakers (leftmost element
     * is most
     */
    // Double HashMap: key->val/freq, freq->LinkedHashSet of keys
    private int cap, minFreq;
    private Map<Integer,Integer> keyVal = new HashMap<>(), keyFreq = new HashMap<>();
    private Map<Integer, LinkedHashSet<Integer>> freqKeys = new HashMap<>();

    public LfuCache(int capacity) { cap = capacity; }

    /**
     * Returns Get.
     *
     * @param key the key (int)
     * @return the computed int result
     */
    public int get(int key) {
        if (!keyVal.containsKey(key)) return -1;
        updateFreq(key);
        return keyVal.get(key);
    }

    /**
     * Inserts Put.
     *
     * @param key the key (int)
     * @param value the value (int)
     */
    public void put(int key, int value) {
        if (cap <= 0) return;
        if (keyVal.containsKey(key)) {
            keyVal.put(key, value);
            updateFreq(key);
            return;
        }
        if (keyVal.size() >= cap) {
            LinkedHashSet<Integer> minSet = freqKeys.get(minFreq);
            int evict = minSet.iterator().next();
            minSet.remove(evict);
            keyVal.remove(evict); keyFreq.remove(evict);
        }
        keyVal.put(key, value);
        keyFreq.put(key, 1);
        freqKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
        minFreq = 1;
    }

    private void updateFreq(int key) {
        int freq = keyFreq.get(key);
        keyFreq.put(key, freq + 1);
        freqKeys.get(freq).remove(key);
        if (freqKeys.get(freq).isEmpty() && freq == minFreq) minFreq++;
        freqKeys.computeIfAbsent(freq + 1, k -> new LinkedHashSet<>()).add(key);
    }

    public static void main(String[] args) {
        LfuCache cache = new LfuCache(2);
        cache.put(1,1); cache.put(2,2);
        System.out.println(cache.get(1)); // 1
        cache.put(3,3);  // evicts key 2
        System.out.println(cache.get(2)); // -1
        System.out.println(cache.get(3)); // 3
    }
}

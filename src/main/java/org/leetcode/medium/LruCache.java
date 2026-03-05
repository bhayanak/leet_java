package org.leetcode.medium;

/**
 * <b>#146 - LRU Cache</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Linked List, Design, Doubly-Linked List</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * 
 * 
 * Implement the LRUCache class:
 * 
 * 	
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * 	
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * 	
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * 
 * The functions get and put must each run in O(1) average time complexity.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * Output
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 * 
 * Explanation
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // cache is {1=1}
 * lRUCache.put(2, 2); // cache is {1=1, 2=2}
 * lRUCache.get(1);    // return 1
 * lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
 * lRUCache.get(2);    // returns -1 (not found)
 * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
 * lRUCache.get(1);    // return -1 (not found)
 * lRUCache.get(3);    // return 3
 * lRUCache.get(4);    // return 4
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= capacity &lt;= 3000
 * 	
 * 0 &lt;= key &lt;= 104
 * 	
 * 0 &lt;= value &lt;= 105
 * 	
 * At most 2 * 105 calls will be made to get and put.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Use a doubly-linked list + HashMap:
 * Map keeps O(1) access by key; list maintains LRU order (head=most recent, tail=least).
 * On get/put, move accessed node to the head. On capacity overflow, evict tail.
 *
 * <h2>Complexity</h2>
* Time: O(1) per get/put  |  Space: O(capacity)
 *
 * @see <a href="https://leetcode.com/problems/lru-cache/">LeetCode #146</a>
 */
public class LruCache {

    /** LRU Cache with O(1) get and put. */
    static class LRUCache {
        private final int capacity;
        private final java.util.Map<Integer, int[]> map; // key → {val, freq} won't work
        // We use LinkedHashMap with access order = true, which automatically handles LRU
        private final java.util.LinkedHashMap<Integer, Integer> cache;

        /**
         * Initializes the LRU cache with given capacity.
         * @param capacity maximum number of entries
         */
        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = null;
            // access-order=true: get() moves the accessed entry to the end (most recent)
            this.cache = new java.util.LinkedHashMap<Integer,Integer>(capacity, 0.75f, true) {
                @Override
    /**
     * Removes Remove eldest entry.
     *
     * @param java.util.Map.Entry&lt;Integer the java.util.Map.Entry&lt;Integer (Object)
     * @param eldest the eldest (Integer&gt;)
     * @return the computed boolean result
     */
                protected boolean removeEldestEntry(java.util.Map.Entry<Integer,Integer> eldest) {
                    return size() > LRUCache.this.capacity; // evict least-recently-used
                }
            };
        }

        /**
         * Returns the cached value for key, or -1 if not present.
         * @param key cache key
         * @return cached value or -1
         */
        public int get(int key) {
            return cache.getOrDefault(key, -1);
        }

        /**
         * Inserts or updates the key-value pair; evicts LRU if over capacity.
         * @param key   cache key
         * @param value value to store
         */
        public void put(int key, int value) {
            cache.put(key, value);
        }
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac LruCache.java &amp;&amp; java org.leetcode.medium.LruCache
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LRUCache sol = new LRUCache(2);
        sol.put(1, 1);
        sol.put(2, 2);
        System.out.println(sol.get(1)); // 1
    }
}

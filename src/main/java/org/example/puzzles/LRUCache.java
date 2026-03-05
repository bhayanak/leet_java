package org.example.puzzles;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRUCache
 *
 * Problem: Implement a simple LRU (Least Recently Used) cache in Java.
 *
 * Approach: Use LinkedHashMap with accessOrder=true to maintain LRU order.
 * This is a common system design and data structure problem, testing knowledge of maps and eviction policies.
 *
 * Example:
 *   LRUCache&lt;Integer, String&gt; cache = new LRUCache&lt;&gt;(3);
 *   cache.put(1, "A"); cache.put(2, "B"); cache.put(3, "C");
 *   cache.get(1); cache.put(4, "D"); // Evicts key 2
 *   System.out.println(cache.keySet()); // [3, 1, 4]
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    /**
     * Constructs an LRUCache with the given capacity.
     * @param capacity the maximum number of items
     */
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // accessOrder=true for LRU
        this.capacity = capacity;
    }

    /**
     * Overridden to remove the eldest entry when size exceeds capacity.
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    /**
     * Main method to demonstrate LRU cache behavior.
     */
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.get(1);
        cache.put(4, "D"); // Evicts key 2
        System.out.println(cache.keySet()); // [3, 1, 4]
    }
}

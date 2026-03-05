package org.example.puzzles;

import java.util.*;

/**
 * CacheSystem
 *
 * Problem: Design a cache system in Java that supports different eviction policies (LRU, LFU, FIFO).
 *
 * Approach: Use Strategy pattern for eviction algorithms, Decorator for adding caching to services.
 * This is a classic extensibility and design patterns problem.
 *
 * Example:
 *   Cache&lt;Integer, String&gt; lru = new Cache&lt;&gt;(2, new LRUPolicy&lt;&gt;());
 *   lru.put(1, "A"); lru.put(2, "B"); lru.get(1); lru.put(3, "C");
 *   System.out.println(lru.get(2)); // null (evicted)
 */
interface EvictionPolicy<K> {
    void keyAccessed(K key);
    K evictKey();
}

class LRUPolicy<K> implements EvictionPolicy<K> {
    private final LinkedList<K> list = new LinkedList<>();
    public void keyAccessed(K key) {
        list.remove(key); list.addLast(key); // Move key to end (most recently used)
    }
    public K evictKey() { return list.removeFirst(); } // Remove least recently used
}

class FIFOPolicy<K> implements EvictionPolicy<K> {
    private final Queue<K> queue = new LinkedList<>();
    public void keyAccessed(K key) { queue.add(key); }
    public K evictKey() { return queue.poll(); }
}

class LFUPolicy<K> implements EvictionPolicy<K> {
    private final Map<K, Integer> freq = new HashMap<>();
    public void keyAccessed(K key) { freq.put(key, freq.getOrDefault(key, 0) + 1); }
    public K evictKey() {
        // Find the key with the lowest frequency
        return freq.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
    }
}

class Cache<K, V> {
    private final int capacity;
    private final Map<K, V> map = new HashMap<>();
    private final EvictionPolicy<K> policy;
    public Cache(int capacity, EvictionPolicy<K> policy) {
        this.capacity = capacity; this.policy = policy;
    }
    public void put(K key, V value) {
        if (map.size() >= capacity) {
            K evict = policy.evictKey();
            map.remove(evict);
        }
        map.put(key, value);
        policy.keyAccessed(key);
    }
    public V get(K key) {
        policy.keyAccessed(key);
        return map.get(key);
    }
}

/**
 * Main class to demonstrate cache system with different eviction policies.
 */
public class CacheSystem {
    public static void main(String[] args) {
        Cache<Integer, String> lru = new Cache<>(2, new LRUPolicy<>());
        lru.put(1, "A"); lru.put(2, "B"); lru.get(1); lru.put(3, "C");
        System.out.println(lru.get(2)); // null (evicted)
    }
}

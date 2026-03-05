package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #706: Design HashMap
 * @see <a href="https://leetcode.com/problems/design-hashmap/">Problem</a>
 */
public class DesignHashmap {

    /**
     * LeetCode #706 – Design HashMap
     * Difficulty: EASY
     * Topics: Array, Hash Table, Linked List, Design, Hash Function
     *
     * Design a HashMap without using any built-in hash table libraries.
     * 
     * 
     * Implement the MyHashMap class:
     * 
     * 
     * MyHashMap() initializes the object with an empty map.
     * 
     * void put(int key, int value) inserts a (key, value) pair into the HashMap.
     * If the key already exists in the map, update the corresponding value.
     * 
     * int get(int key) returns the value to which the specified key is mapped, or
     * -1 if this map contains no mapping for the key.
     * 
     * void remove(key) removes the key and its corresponding value if the map
     * contains the mapping for the key.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
     * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
     * Output
     * [null, null, null, 1, -1, null, 1, null, -1]
     * 
     * Explanation
     * DesignHashmap myHashMap = new DesignHashmap();
     * myHashMap.put(1, 1); // The map is now [[1,1]]
     * myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
     * myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
     * myHashMap.get(3); // return -1 (i.e., not found), The map is now [[1,1],
     * [2,2]]
     * myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the
     * existing value)
     * myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
     * myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
     * myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 0 &lt;= key, value &lt;= 106
     * 
     * At most 104 calls will be made to put, get, and remove.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    private int[] keys = new int[1000001];
    private int[] vals = new int[1000001];
    { java.util.Arrays.fill(vals, -1); }
    public DesignHashmap() {}
    /**
     * Inserts Put.
     *
     * @param key the key (int)
     * @param value the value (int)
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public void put(int key, int value) { vals[key] = value; }
    /**
     * Returns Get.
     *
     * @param key the key (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int get(int key) { return vals[key]; }
    /**
     * Removes Remove.
     *
     * @param key the key (int)
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public void remove(int key) { vals[key] = -1; }

    public static void main(String[] args) {
        DesignHashmap hm = new DesignHashmap();
        hm.put(1, 1); hm.put(2, 2);
        System.out.println(hm.get(1));    // 1
        System.out.println(hm.get(3));    // -1
        hm.put(2, 1);
        System.out.println(hm.get(2));    // 1
        hm.remove(2);
        System.out.println(hm.get(2));    // -1
    }
}

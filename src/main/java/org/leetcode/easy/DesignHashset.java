package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #705: Design HashSet
 * @see <a href="https://leetcode.com/problems/design-hashset/">Problem</a>
 */
public class DesignHashset {

    /**
     * LeetCode #705 – Design HashSet
     * Difficulty: EASY
     * Topics: Array, Hash Table, Linked List, Design, Hash Function
     *
     * Design a HashSet without using any built-in hash table libraries.
     * 
     * 
     * Implement MyHashSet class:
     * 
     * 
     * void add(key) Inserts the value key into the HashSet.
     * 
     * bool contains(key) Returns whether the value key exists in the HashSet or
     * not.
     * 
     * void remove(key) Removes the value key in the HashSet. If key does not
     * exist in the HashSet, do nothing.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["MyHashSet", "add", "add", "contains", "contains", "add", "contains",
     * "remove", "contains"]
     * [[], [1], [2], [1], [3], [2], [2], [2], [2]]
     * Output
     * [null, null, null, true, false, null, true, null, false]
     * 
     * Explanation
     * DesignHashset myHashSet = new DesignHashset();
     * myHashSet.add(1);      // set = [1]
     * myHashSet.add(2);      // set = [1, 2]
     * myHashSet.contains(1); // return True
     * myHashSet.contains(3); // return False, (not found)
     * myHashSet.add(2);      // set = [1, 2]
     * myHashSet.contains(2); // return True
     * myHashSet.remove(2);   // set = [1]
     * myHashSet.contains(2); // return False, (already removed)
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 0 &lt;= key &lt;= 106
     * 
     * At most 104 calls will be made to add, remove, and contains.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    private boolean[] set = new boolean[1000001];
    public DesignHashset() {}
    /**
     * Adds Add.
     *
     * @param key the key (int)
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public void add(int key) { set[key] = true; }
    /**
     * Removes Remove.
     *
     * @param key the key (int)
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public void remove(int key) { set[key] = false; }
    /**
     * Solves the problem: Contains.
     *
     * @param key the key (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public boolean contains(int key) { return set[key]; }

    public static void main(String[] args) {
        DesignHashset hs = new DesignHashset();
        hs.add(1); hs.add(2);
        System.out.println(hs.contains(1)); // true
        System.out.println(hs.contains(3)); // false
        hs.add(2);
        System.out.println(hs.contains(2)); // true
        hs.remove(2);
        System.out.println(hs.contains(2)); // false
    }
}

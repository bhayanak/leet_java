package org.leetcode.medium;

/**
 * <b>#380 - Insert Delete GetRandom O(1)</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Design, Randomized</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Implement the RandomizedSet class:
 * 
 * 	
 * RandomizedSet() Initializes the RandomizedSet object.
 * 	
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * 	
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * 	
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
 * 
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
 * [[], [1], [2], [2], [], [1], [2], []]
 * Output
 * [null, true, false, true, 2, true, false, 2]
 * 
 * Explanation
 * RandomizedSet randomizedSet = new RandomizedSet();
 * randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
 * randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
 * randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
 * randomizedSet.insert(2); // 2 was already in the set, so return false.
 * randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -231 &lt;= val &lt;= 231 - 1
 * 	
 * At most 2 * 105 calls will be made to insert, remove, and getRandom.
 * 	
 * There will be at least one element in the data structure when getRandom is called.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * HashMap maps value→index in an ArrayList. On remove, swap with last element
 * then pop. This maintains array compactness for O(1) random access.
 *
 * <h2>Complexity</h2>
* Time: O(1) average  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/">LeetCode #380</a>
 */
public class InsertDeleteGetrandomO1 {

    static class RandomizedSet {
        private java.util.List<Integer> list=new java.util.ArrayList<>();
        private java.util.Map<Integer,Integer> map=new java.util.HashMap<>();
        private java.util.Random rand=new java.util.Random();
    /**
     * Solves the problem: Insert.
     *
     * @param val the val (int)
     * @return the computed boolean result
     */
        public boolean insert(int val){
            if(map.containsKey(val)) return false;
            map.put(val,list.size()); list.add(val); return true;
        }
    /**
     * Removes Remove.
     *
     * @param val the val (int)
     * @return the computed boolean result
     */
        public boolean remove(int val){
            if(!map.containsKey(val)) return false;
            int idx=map.get(val), last=list.get(list.size()-1);
            list.set(idx,last); map.put(last,idx);
            list.remove(list.size()-1); map.remove(val); return true;
        }
    /**
     * Returns Get random.
     *
     * @return the computed int result
     */
        public int getRandom(){ return list.get(rand.nextInt(list.size())); }
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        RandomizedSet sol = new RandomizedSet();
        System.out.println(sol.insert(1)); // true
        System.out.println(sol.insert(2)); // true
        System.out.println(sol.getRandom());
    }
}

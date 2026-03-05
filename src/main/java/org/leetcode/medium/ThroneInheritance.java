package org.leetcode.medium;


/**
 * <b>#1600 - Throne Inheritance</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Tree, Depth-First Search, Design</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A kingdom consists of a king, his children, his grandchildren, and so on. Every once in a while, someone in the family dies or a child is born.
 *
 *
 * The kingdom has a well-defined order of inheritance that consists of the king as the first member. Let's define the recursive function Successor(x, curOrder), which given a person x and the inheritance order so far, returns who should be the next person after x in the order of inheritance.
 *
 * Successor(x, curOrder):
 *     if x has no children or all of x's children are in curOrder:
 *         if x is the king return null
 *         else return Successor(x's parent, curOrder)
 *     else return x's oldest child who's not in curOrder
 *
 * For example, assume we have a kingdom that consists of the king, his children Alice and Bob (Alice is older than Bob), and finally Alice's son Jack.
 *
 *
 * In the beginning, curOrder will be ["king"].
 *
 * Calling Successor(king, curOrder) will return Alice, so we append to curOrder to get ["king", "Alice"].
 *
 * Calling Successor(Alice, curOrder) will return Jack, so we append to curOrder to get ["king", "Alice", "Jack"].
 *
 * Calling Successor(Jack, curOrder) will return Bob, so we append to curOrder to get ["king", "Alice", "Jack", "Bob"].
 *
 * Calling Successor(Bob, curOrder) will return null. Thus the order of inheritance will be ["king", "Alice", "Jack", "Bob"].
 *
 * Using the above function, we can always obtain a unique order of inheritance.
 *
 *
 * Implement the ThroneInheritance class:
 *
 *
 * ThroneInheritance(string kingName) Initializes an object of the ThroneInheritance class. The name of the king is given as part of the constructor.
 *
 * void birth(string parentName, string childName) Indicates that parentName gave birth to childName.
 *
 * void death(string name) Indicates the death of name. The death of the person doesn't affect the Successor function nor the current inheritance order. You can treat it as just marking the person as dead.
 *
 * string[] getInheritanceOrder() Returns a list representing the current order of inheritance excluding dead people.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["ThroneInheritance", "birth", "birth", "birth", "birth", "birth", "birth", "getInheritanceOrder", "death", "getInheritanceOrder"]
 * [["king"], ["king", "andy"], ["king", "bob"], ["king", "catherine"], ["andy", "matthew"], ["bob", "alex"], ["bob", "asha"], [null], ["bob"], [null]]
 * Output
 * [null, null, null, null, null, null, null, ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"], null, ["king", "andy", "matthew", "alex", "asha", "catherine"]]
 *
 * Explanation
 * ThroneInheritance t= new ThroneInheritance("king"); // order: king
 * t.birth("king", "andy"); // order: king &gt; andy
 * t.birth("king", "bob"); // order: king &gt; andy &gt; bob
 * t.birth("king", "catherine"); // order: king &gt; andy &gt; bob &gt; catherine
 * t.birth("andy", "matthew"); // order: king &gt; andy &gt; matthew &gt; bob &gt; catherine
 * t.birth("bob", "alex"); // order: king &gt; andy &gt; matthew &gt; bob &gt; alex &gt; catherine
 * t.birth("bob", "asha"); // order: king &gt; andy &gt; matthew &gt; bob &gt; alex &gt; asha &gt; catherine
 * t.getInheritanceOrder(); // return ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"]
 * t.death("bob"); // order: king &gt; andy &gt; matthew &gt; bob &gt; alex &gt; asha &gt; catherine
 * t.getInheritanceOrder(); // return ["king", "andy", "matthew", "alex", "asha", "catherine"]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= kingName.length, parentName.length, childName.length, name.length &lt;= 15
 *
 * kingName, parentName, childName, and name consist of lowercase English letters only.
 *
 * All arguments childName and kingName are distinct.
 *
 * All name arguments of death will be passed to either the constructor or as childName to birth first.
 *
 * For each call to birth(parentName, childName), it is guaranteed that parentName is alive.
 *
 * At most 105 calls will be made to birth and death.
 *
 * At most 10 calls will be made to getInheritanceOrder.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a tree structure of the family.
 * Hint 2: Without deaths, the order of inheritance is simply a pre-order traversal of the tree.
 * Hint 3: Mark the dead family members tree nodes and don't include them in the final order.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Tree, Depth-First Search, Design).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/throne-inheritance/">LeetCode #1600</a>
 */
public class ThroneInheritance {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Throne Inheritance");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ThroneInheritance ===");
        ThroneInheritance sol = new ThroneInheritance();
        System.out.println(sol.solve(null));
    }
}

package org.leetcode.easy;

import java.util.List;
import java.util.Arrays;


/**
 * <b>#1773 - Count Items Matching a Rule</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
 *
 *
 * The ith item is said to match the rule if one of the following is true:
 *
 *
 * ruleKey == "type" and ruleValue == typei.
 *
 * ruleKey == "color" and ruleValue == colori.
 *
 * ruleKey == "name" and ruleValue == namei.
 *
 * Return the number of items that match the given rule.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 * Output: 1
 * Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 *
 * Example 2:
 *
 * Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
 * Output: 2
 * Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= items.length &lt;= 104
 *
 * 1 &lt;= typei.length, colori.length, namei.length, ruleValue.length &lt;= 10
 *
 * ruleKey is equal to either "type", "color", or "name".
 *
 * All strings consist only of lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate on each item, and check if each one matches the rule according to the statement.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-items-matching-a-rule/">LeetCode #1773</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountItemsMatchingARule {

    /**
     * Counts Count matches.
     *
     * @param items the items (java.util.List&lt;java.util.List&lt;String&gt;&gt;)
     * @param ruleKey the ruleKey (String)
     * @param ruleValue the ruleValue (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countMatches(java.util.List<java.util.List<String>> items, String ruleKey, String ruleValue) {
        int idx = ruleKey.equals("type")?0:ruleKey.equals("color")?1:2;
        int count=0;
        for (var item:items) if (item.get(idx).equals(ruleValue)) count++;
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CountItemsMatchingARule sol = new CountItemsMatchingARule();
                java.util.List<java.util.List<String>> items = java.util.Arrays.asList(
                    java.util.Arrays.asList("phone","blue","pixel"),
                    java.util.Arrays.asList("computer","silver","lenovo"),
                    java.util.Arrays.asList("phone","gold","iphone")
                );
                System.out.println(sol.countMatches(items,"color","silver")); // 1
                System.out.println(sol.countMatches(items,"type","phone"));   // 2
    }
}

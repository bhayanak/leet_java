package org.leetcode.medium;


/**
 * <b>#1268 - Search Suggestions System</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Binary Search, Trie, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings products and a string searchWord.
 *
 *
 * Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.
 *
 *
 * Return a list of lists of the suggested products after each character of searchWord is typed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
 * Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
 * Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"].
 * After typing m and mo all products match and we show user ["mobile","moneypot","monitor"].
 * After typing mou, mous and mouse the system suggests ["mouse","mousepad"].
 *
 * Example 2:
 *
 * Input: products = ["havana"], searchWord = "havana"
 * Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
 * Explanation: The only word "havana" will be always suggested while typing the search word.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= products.length &lt;= 1000
 *
 * 1 &lt;= products[i].length &lt;= 3000
 *
 * 1 &lt;= sum(products[i].length) &lt;= 2 * 104
 *
 * All the strings of products are unique.
 *
 * products[i] consists of lowercase English letters.
 *
 * 1 &lt;= searchWord.length &lt;= 1000
 *
 * searchWord consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Brute force is a good choice because length of the string is ≤ 1000.
 * Hint 2: Binary search the answer.
 * Hint 3: Use Trie data structure to store the best three matching. Traverse the Trie.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Binary Search, Trie, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/search-suggestions-system/">LeetCode #1268</a>
 */
public class SearchSuggestionsSystem {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Search Suggestions System");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SearchSuggestionsSystem ===");
        SearchSuggestionsSystem sol = new SearchSuggestionsSystem();
        System.out.println(sol.solve(null));
    }
}

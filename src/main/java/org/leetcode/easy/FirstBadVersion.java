package org.leetcode.easy;

/**
 * <b>#278 - First Bad Version</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Binary Search, Interactive</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * 
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * 
 * 
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -&gt; false
 * call isBadVersion(5) -&gt; true
 * call isBadVersion(4) -&gt; true
 * Then 4 is the first bad version.
 * 
 * Example 2:
 * 
 * Input: n = 1, bad = 1
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= bad &lt;= n &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Binary search: if mid is bad, search left (answer could be mid).
 * If mid is good, search right.
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/first-bad-version/">LeetCode #278</a>
 */
public class FirstBadVersion {

    // Simulated API (in LeetCode this is provided)
    private int BAD = 4; // set for demo
    private boolean isBadVersion(int v){ return v>=BAD; }

    /**
     * Solves the problem: First bad version.
     * Uses binary search for O(log n) lookup.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int firstBadVersion(int n) {
        int lo=1, hi=n;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(isBadVersion(mid)) hi=mid;
            else lo=mid+1;
        }
        return lo;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        FirstBadVersion sol = new FirstBadVersion();
        sol.BAD=4;
        System.out.println(sol.firstBadVersion(5)); // 4
        sol.BAD=1;
        System.out.println(sol.firstBadVersion(1)); // 1
    }
}

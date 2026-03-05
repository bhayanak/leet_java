package org.leetcode.hard;


/**
 * <b>#3636 - Threshold Majority Queries</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Divide and Conquer, Counting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and an array queries, where queries[i] = [li, ri, thresholdi].
 *
 *
 * Return an array of integers ans where ans[i] is equal to the element in the subarray nums[li...ri] that appears at least thresholdi times, selecting the element with the highest frequency (choosing the smallest in case of a tie), or -1 if no such element exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,2,1,1], queries = [[0,5,4],[0,3,3],[2,3,2]]
 *
 *
 * Output: [1,-1,2]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Query
 * 			Sub-array
 * 			Threshold
 * 			Frequency table
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			[0, 5, 4]
 * 			[1, 1, 2, 2, 1, 1]
 * 			4
 * 			1 → 4, 2 → 2
 * 			1
 *
 *
 *
 *
 * 			[0, 3, 3]
 * 			[1, 1, 2, 2]
 * 			3
 * 			1 → 2, 2 → 2
 * 			-1
 *
 *
 *
 *
 * 			[2, 3, 2]
 * 			[2, 2]
 * 			2
 * 			2 → 2
 * 			2
 *
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [3,2,3,2,3,2,3], queries = [[0,6,4],[1,5,2],[2,4,1],[3,3,1]]
 *
 *
 * Output: [3,2,3,2]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Query
 * 			Sub-array
 * 			Threshold
 * 			Frequency table
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			[0, 6, 4]
 * 			[3, 2, 3, 2, 3, 2, 3]
 * 			4
 * 			3 → 4, 2 → 3
 * 			3
 *
 *
 *
 *
 * 			[1, 5, 2]
 * 			[2, 3, 2, 3, 2]
 * 			2
 * 			2 → 3, 3 → 2
 * 			2
 *
 *
 *
 *
 * 			[2, 4, 1]
 * 			[3, 2, 3]
 * 			1
 * 			3 → 2, 2 → 1
 * 			3
 *
 *
 *
 *
 * 			[3, 3, 1]
 * 			[2]
 * 			1
 * 			2 → 1
 * 			2
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length == n &lt;= 104
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= queries.length &lt;= 5 * 104
 *
 * queries[i] = [li, ri, thresholdi]
 *
 * 0 &lt;= li &lt;= ri &lt; n
 *
 * 1 &lt;= thresholdi &lt;= ri - li + 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use sqrt decomposition: let <code>B = int(sqrt(n))</code> and sort queries by <code>(l//B, r)</code>
 * Hint 2: Maintain window <code>[L,R]</code> with a frequency map <code>cnt</code> and buckets <code>bucket[f]</code> of values at count <code>f</code>
 * Hint 3: Slide <code>L</code> and <code>R</code> per query, updating <code>cnt</code> and <code>bucket</code>, then scan from <code>threshold</code> to max freq to find the smallest valid value or -1
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Divide and Conquer, Counting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/threshold-majority-queries/">LeetCode #3636</a>
 */
public class ThresholdMajorityQueries {

    /**
     * Counts Count palindromic subsequences.
     *
     * @param s the s (String)
     * @return the computed long result
     */
    public long countPalindromicSubsequences(String s) {
        long cnt=0; int n=s.length();
        for (int i=0;i<n;i++) for (int j=i;j<n;j++) {
            String sub=s.substring(i,j+1);
            if (isPalin(sub)) cnt++;
        }
        return cnt;
    }
    private boolean isPalin(String s){int l=0,r=s.length()-1;while(l<r){if(s.charAt(l)!=s.charAt(r))return false;l++;r--;}return true;}

    public static void main(String[] args) {
        ThresholdMajorityQueries sol = new ThresholdMajorityQueries();
        System.out.println(sol.countPalindromicSubsequences("hello"));
    }
}

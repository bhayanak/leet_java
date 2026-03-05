package org.leetcode.hard;


/**
 * <b>#3830 - Longest Alternating Subarray After Removing At Most One Element</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * A subarray nums[l..r] is alternating if one of the following holds:
 *
 *
 * nums[l] &lt; nums[l + 1] &gt; nums[l + 2] &lt; nums[l + 3] &gt; ...
 *
 * nums[l] &gt; nums[l + 1] &lt; nums[l + 2] &gt; nums[l + 3] &lt; ...
 *
 * In other words, if we compare adjacent elements in the subarray, then the comparisons alternate between strictly greater and strictly smaller.
 *
 *
 * You can remove at most one element from nums. Then, you select an alternating subarray from nums.
 *
 *
 * Return an integer denoting the maximum length of the alternating subarray you can select.
 *
 *
 * A subarray of length 1 is considered alternating.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3,2]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Choose not to remove elements.
 *
 * Select the entire array [2, 1, 3, 2], which is alternating because 2 &gt; 1 &lt; 3 &gt; 2.
 *
 * Example 2:
 *
 * Input: nums = [3,2,1,2,3,2,1]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Choose to remove nums[3] i.e., [3, 2, 1, 2, 3, 2, 1]. The array becomes [3, 2, 1, 3, 2, 1].
 *
 * Select the subarray [3, 2, 1, 3, 2, 1].
 *
 * Example 3:
 *
 * Input: nums = [100000,100000]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Choose not to remove elements.
 *
 * Select the subarray [100000, 100000].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Define <code>left[i][d]</code> as the maximum length of an alternating subarray ending at index <code>i</code>, where <code>d = 0</code> means the last comparison is <code>&lt;</code> and <code>d = 1</code> means the last comparison is <code>&gt;</code>. Define <code>right[i][d]</code> similarly for subarrays starting at <code>i</code>.
 * Hint 2: Fill <code>left</code> from left to right and <code>right</code> from right to left; if adjacent values are equal, the alternating chain must restart since <code>==</code> is invalid.
 * Hint 3: Try removing each index <code>r</code>: if <code>nums[r - 1] &lt; nums[r + 1]</code>, the two sides can connect with pattern <code>&lt; &gt;</code>, giving length <code>left[r - 1][0] + right[r + 1][1]</code>; if <code>nums[r - 1] &gt; nums[r + 1]</code>, connect with pattern <code>&gt; &lt;</code>, giving <code>left[r - 1][1] + right[r + 1][0]</code>.
 * Hint 4: Also consider not removing any element by taking the maximum value over all <code>left[i][d]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/longest-alternating-subarray-after-removing-at-most-one-element/">LeetCode #3830</a>
 */
public class LongestAlternatingSubarrayAfterRemovingAtMostOneElement {

    /**
     * Finds Find smallest prime palindrome.
     *
     * @param upper the upper (int)
     * @return the computed int result
     */
    public int findSmallestPrimePalindrome(int upper) {
        for (int n=2;n<=upper;n++) if (isPrime(n)&&isPalin(n)) return n;
        return -1;
    }
    private boolean isPrime(int n){if(n<2)return false;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
    private boolean isPalin(int n){String s=String.valueOf(n);int l=0,r=s.length()-1;while(l<r)if(s.charAt(l++)!=s.charAt(r--))return false;return true;}

    public static void main(String[] args) {
        LongestAlternatingSubarrayAfterRemovingAtMostOneElement sol = new LongestAlternatingSubarrayAfterRemovingAtMostOneElement();
        System.out.println(sol.findSmallestPrimePalindrome(0));
    }
}

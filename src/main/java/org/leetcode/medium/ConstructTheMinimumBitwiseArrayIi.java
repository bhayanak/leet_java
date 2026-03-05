package org.leetcode.medium;


/**
 * <b>#3315 - Construct the Minimum Bitwise Array II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of n prime integers.
 *
 *
 * You need to construct an array ans of length n, such that, for each index i, the bitwise OR of ans[i] and ans[i] + 1 is equal to nums[i], i.e. ans[i] OR (ans[i] + 1) == nums[i].
 *
 *
 * Additionally, you must minimize each value of ans[i] in the resulting array.
 *
 *
 * If it is not possible to find such a value for ans[i] that satisfies the condition, then set ans[i] = -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,5,7]
 *
 *
 * Output: [-1,1,4,3]
 *
 *
 * Explanation:
 *
 *
 * For i = 0, as there is no value for ans[0] that satisfies ans[0] OR (ans[0] + 1) = 2, so ans[0] = -1.
 *
 * For i = 1, the smallest ans[1] that satisfies ans[1] OR (ans[1] + 1) = 3 is 1, because 1 OR (1 + 1) = 3.
 *
 * For i = 2, the smallest ans[2] that satisfies ans[2] OR (ans[2] + 1) = 5 is 4, because 4 OR (4 + 1) = 5.
 *
 * For i = 3, the smallest ans[3] that satisfies ans[3] OR (ans[3] + 1) = 7 is 3, because 3 OR (3 + 1) = 7.
 *
 * Example 2:
 *
 * Input: nums = [11,13,31]
 *
 *
 * Output: [9,12,15]
 *
 *
 * Explanation:
 *
 *
 * For i = 0, the smallest ans[0] that satisfies ans[0] OR (ans[0] + 1) = 11 is 9, because 9 OR (9 + 1) = 11.
 *
 * For i = 1, the smallest ans[1] that satisfies ans[1] OR (ans[1] + 1) = 13 is 12, because 12 OR (12 + 1) = 13.
 *
 * For i = 2, the smallest ans[2] that satisfies ans[2] OR (ans[2] + 1) = 31 is 15, because 15 OR (15 + 1) = 31.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 2 &lt;= nums[i] &lt;= 109
 *
 * nums[i] is a prime number.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider the binary representation of <code>nums[i]</code>.
 * Hint 2: Answer is -1 for even <code>nums[i]</code>.
 * Hint 3: Try unsetting a single bit from <code>nums[i]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/construct-the-minimum-bitwise-array-ii/">LeetCode #3315</a>
 */
public class ConstructTheMinimumBitwiseArrayIi {

    /**
     * Counts Count of substrings.
     *
     * @param word the word (String)
     * @param k the k (int)
     * @return the computed int result
     */
    public int countOfSubstrings(String word, int k) {
        int cnt=0, n=word.length();
        for (int i=0;i<n;i++) {
            int[] vowels=new int[26]; vowels['a'-'a']=vowels['e'-'a']=vowels['i'-'a']=vowels['o'-'a']=vowels['u'-'a']=0;
            int vowelCnt=0, consCnt=0;
            for (int j=i;j<n;j++) {
                char c=word.charAt(j);
                if ("aeiou".indexOf(c)>=0) { if (vowels[c-'a']==0) vowelCnt++; vowels[c-'a']++; }
                else consCnt++;
                if (vowelCnt==5&&consCnt==k) cnt++;
                if (consCnt>k) break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        ConstructTheMinimumBitwiseArrayIi sol = new ConstructTheMinimumBitwiseArrayIi();
        System.out.println(sol.countOfSubstrings("hello", 0));
    }
}

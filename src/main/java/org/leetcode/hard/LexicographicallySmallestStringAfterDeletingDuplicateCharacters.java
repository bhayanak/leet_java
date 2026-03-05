package org.leetcode.hard;


/**
 * <b>#3816 - Lexicographically Smallest String After Deleting Duplicate Characters</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s that consists of lowercase English letters.
 *
 *
 * You can perform the following operation any number of times (possibly zero times):
 *
 *
 * Choose any letter that appears at least twice in the current string s and delete any one occurrence.
 *
 * Return the lexicographically smallest resulting string that can be formed this way.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aaccb"
 *
 *
 * Output: "aacb"
 *
 *
 * Explanation:
 *
 *
 * We can form the strings "acb", "aacb", "accb", and "aaccb". "aacb" is the lexicographically smallest one.
 *
 *
 * For example, we can obtain "aacb" by choosing 'c' and deleting its first occurrence.
 *
 * Example 2:
 *
 * Input: s = "z"
 *
 *
 * Output: "z"
 *
 *
 * Explanation:
 *
 *
 * We cannot perform any operations. The only string we can form is "z".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s contains lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve greedily.
 * Hint 2: Each distinct letter must appear at least once in the final string.
 * Hint 3: For each letter, maintain a deque of its positions.
 * Hint 4: At each step, try letters from <code>'a'</code> to <code>'z'</code> and pick the smallest letter whose earliest position lies within a safe window.
 * Hint 5: Do not pick an occurrence if choosing it would make some other letter impossible to keep.
 * Hint 6: Mark positions as used and repeat, always minimizing the next chosen character.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Stack, Greedy, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-string-after-deleting-duplicate-characters/">LeetCode #3816</a>
 */
public class LexicographicallySmallestStringAfterDeletingDuplicateCharacters {

    /**
     * Solves the problem: Minimum index.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int minimumIndex(int[] nums) {
        // Find majority element
        int cand=nums[0], cnt=1;
        for (int i=1;i<nums.length;i++){if(nums[i]==cand)cnt++;else if(--cnt==0){cand=nums[i];cnt=1;}}
        final int finalCand = cand;
        int total=(int)java.util.Arrays.stream(nums).filter(x->x==finalCand).count();
        int left=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==cand)left++;
            if(left*2>i+1&&(total-left)*2>nums.length-i-1)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        LexicographicallySmallestStringAfterDeletingDuplicateCharacters sol = new LexicographicallySmallestStringAfterDeletingDuplicateCharacters();
        System.out.println(sol.minimumIndex(new int[]{1,2,3}));
    }
}

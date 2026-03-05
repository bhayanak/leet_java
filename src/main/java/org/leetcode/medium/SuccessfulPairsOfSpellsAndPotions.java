package org.leetcode.medium;


/**
 * <b>#2300 - Successful Pairs of Spells and Potions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
 *
 *
 * You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.
 *
 *
 * Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
 * Output: [4,0,3]
 * Explanation:
 * - 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
 * - 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
 * - 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
 * Thus, [4,0,3] is returned.
 *
 * Example 2:
 *
 * Input: spells = [3,1,2], potions = [8,5,8], success = 16
 * Output: [2,0,2]
 * Explanation:
 * - 0th spell: 3 * [8,5,8] = [24,15,24]. 2 pairs are successful.
 * - 1st spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful. 
 * - 2nd spell: 2 * [8,5,8] = [16,10,16]. 2 pairs are successful. 
 * Thus, [2,0,2] is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * n == spells.length
 *
 * m == potions.length
 *
 * 1 &lt;= n, m &lt;= 105
 *
 * 1 &lt;= spells[i], potions[i] &lt;= 105
 *
 * 1 &lt;= success &lt;= 1010
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that if a spell and potion pair is successful, then the spell and all stronger potions will be successful too.
 * Hint 2: Thus, for each spell, we need to find the potion with the least strength that will form a successful pair.
 * Hint 3: We can efficiently do this by sorting the potions based on strength and using binary search.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/successful-pairs-of-spells-and-potions/">LeetCode #2300</a>
 */
public class SuccessfulPairsOfSpellsAndPotions {

    public java.util.List<Integer> successfulPairs(int[] spells, int[] potions, long success) {
        java.util.Arrays.sort(potions);
        java.util.List<Integer> res=new java.util.ArrayList<>();
        int n=potions.length;
        for (int spell:spells) {
            // find first potion where spell*potion>=success
            int lo=0, hi=n;
            while (lo<hi) {
                int mid=lo+(hi-lo)/2;
                if ((long)spell*potions[mid]>=success) hi=mid; else lo=mid+1;
            }
            res.add(n-lo);
        }
        return res;
    }

    public static void main(String[] args) {
        SuccessfulPairsOfSpellsAndPotions sol = new SuccessfulPairsOfSpellsAndPotions();
        System.out.println("No method available");
    }
}

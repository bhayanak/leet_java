package org.leetcode.medium;

/**
 * <b>#299 - Bulls and Cows</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are playing the Bulls and Cows game with your friend.
 * 
 * 
 * You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:
 * 
 * 	
 * The number of "bulls", which are digits in the guess that are in the correct position.
 * 	
 * The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
 * 
 * Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.
 * 
 * 
 * The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: secret = "1807", guess = "7810"
 * Output: "1A3B"
 * Explanation: Bulls are connected with a '|' and cows are underlined:
 * "1807"
 *   |
 * "7810"
 * 
 * Example 2:
 * 
 * Input: secret = "1123", guess = "0111"
 * Output: "1A1B"
 * Explanation: Bulls are connected with a '|' and cows are underlined:
 * "1123"        "1123"
 *   |      or     |
 * "0111"        "0111"
 * Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= secret.length, guess.length &lt;= 1000
 * 	
 * secret.length == guess.length
 * 	
 * secret and guess consist of digits only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Count bulls (exact match). For cows, count frequency mismatches:
 * cows += min(freq_in_secret, freq_in_guess) for non-bull positions.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1) (10 digits)
 *
 * @see <a href="https://leetcode.com/problems/bulls-and-cows/">LeetCode #299</a>
 */
public class BullsAndCows {

    /**
     * Returns Get hint.
     *
     * @param secret the secret (String)
     * @param guess the guess (String)
     * @return the computed String result
     */
    public String getHint(String secret, String guess) {
        int bulls=0, cows=0;
        int[] sFreq=new int[10], gFreq=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)) bulls++;
            else{sFreq[secret.charAt(i)-'0']++;gFreq[guess.charAt(i)-'0']++;}
        }
        for(int i=0;i<10;i++) cows+=Math.min(sFreq[i],gFreq[i]);
        return bulls+"A"+cows+"B";
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        BullsAndCows sol = new BullsAndCows();
        System.out.println(sol.getHint("1807","7810")); // 1A3B
        System.out.println(sol.getHint("1123","0111")); // 1A1B
    }
}

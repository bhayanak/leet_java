package org.leetcode.medium;


/**
 * <b>#1452 - People Whose List of Favorite Companies Is Not a Subset of Another List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the array favoriteCompanies where favoriteCompanies[i] is the list of favorites companies for the ith person (indexed from 0).
 *
 *
 * Return the indices of people whose list of favorite companies is not a subset of any other list of favorites companies. You must return the indices in increasing order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
 * Output: [0,1,4] 
 * Explanation: 
 * Person with index=2 has favoriteCompanies[2]=["google","facebook"] which is a subset of favoriteCompanies[0]=["leetcode","google","facebook"] corresponding to the person with index 0. 
 * Person with index=3 has favoriteCompanies[3]=["google"] which is a subset of favoriteCompanies[0]=["leetcode","google","facebook"] and favoriteCompanies[1]=["google","microsoft"]. 
 * Other lists of favorite companies are not a subset of another list, therefore, the answer is [0,1,4].
 *
 * Example 2:
 *
 * Input: favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
 * Output: [0,1] 
 * Explanation: In this case favoriteCompanies[2]=["facebook","google"] is a subset of favoriteCompanies[0]=["leetcode","google","facebook"], therefore, the answer is [0,1].
 *
 * Example 3:
 *
 * Input: favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
 * Output: [0,1,2,3]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= favoriteCompanies.length &lt;= 100
 *
 * 1 &lt;= favoriteCompanies[i].length &lt;= 500
 *
 * 1 &lt;= favoriteCompanies[i][j].length &lt;= 20
 *
 * All strings in favoriteCompanies[i] are distinct.
 *
 * All lists of favorite companies are distinct, that is, If we sort alphabetically each list then favoriteCompanies[i] != favoriteCompanies[j].
 *
 * All strings consist of lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use hashing to convert company names in numbers and then for each list check if this is a subset of any other list.
 * Hint 2: In order to check if a list is a subset of another list, use two pointers technique to get a linear solution for this task. The total complexity will be O(n^2 * m) where n is the number of lists and m is the maximum number of elements in a list.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/people-whose-list-of-favorite-companies-is-not-a-subset-of-another-list/">LeetCode #1452</a>
 */
public class PeopleWhoseListOfFavoriteCompaniesIsNotASubsetOfAnotherList {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: People Whose List of Favorite Companies Is Not a Subset of Another List");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PeopleWhoseListOfFavoriteCompaniesIsNotASubsetOfAnotherList ===");
        PeopleWhoseListOfFavoriteCompaniesIsNotASubsetOfAnotherList sol = new PeopleWhoseListOfFavoriteCompaniesIsNotASubsetOfAnotherList();
        System.out.println(sol.solve(null));
    }
}

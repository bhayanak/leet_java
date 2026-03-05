package org.leetcode.medium;


/**
 * <b>#2115 - Find All Possible Recipes from Given Supplies</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Graph Theory, Topological Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have information about n different recipes. You are given a string array recipes and a 2D string array ingredients. The ith recipe has the name recipes[i], and you can create it if you have all the needed ingredients from ingredients[i]. A recipe can also be an ingredient for other recipes, i.e., ingredients[i] may contain a string that is in recipes.
 *
 *
 * You are also given a string array supplies containing all the ingredients that you initially have, and you have an infinite supply of all of them.
 *
 *
 * Return a list of all the recipes that you can create. You may return the answer in any order.
 *
 *
 * Note that two recipes may contain each other in their ingredients.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: recipes = ["bread"], ingredients = [["yeast","flour"]], supplies = ["yeast","flour","corn"]
 * Output: ["bread"]
 * Explanation:
 * We can create "bread" since we have the ingredients "yeast" and "flour".
 *
 * Example 2:
 *
 * Input: recipes = ["bread","sandwich"], ingredients = [["yeast","flour"],["bread","meat"]], supplies = ["yeast","flour","meat"]
 * Output: ["bread","sandwich"]
 * Explanation:
 * We can create "bread" since we have the ingredients "yeast" and "flour".
 * We can create "sandwich" since we have the ingredient "meat" and can create the ingredient "bread".
 *
 * Example 3:
 *
 * Input: recipes = ["bread","sandwich","burger"], ingredients = [["yeast","flour"],["bread","meat"],["sandwich","meat","bread"]], supplies = ["yeast","flour","meat"]
 * Output: ["bread","sandwich","burger"]
 * Explanation:
 * We can create "bread" since we have the ingredients "yeast" and "flour".
 * We can create "sandwich" since we have the ingredient "meat" and can create the ingredient "bread".
 * We can create "burger" since we have the ingredient "meat" and can create the ingredients "bread" and "sandwich".
 *
 *
 *
 * Constraints:
 *
 *
 * n == recipes.length == ingredients.length
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= ingredients[i].length, supplies.length &lt;= 100
 *
 * 1 &lt;= recipes[i].length, ingredients[i][j].length, supplies[k].length &lt;= 10
 *
 * recipes[i], ingredients[i][j], and supplies[k] consist only of lowercase English letters.
 *
 * All the values of recipes and supplies combined are unique.
 *
 * Each ingredients[i] does not contain any duplicate values.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use a data structure to quickly query whether we have a certain ingredient?
 * Hint 2: Once we verify that we can make a recipe, we can add it to our ingredient data structure. We can then check if we can make more recipes as a result of this.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Graph Theory, Topological Sort).
 *
 * @see <a href="https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/">LeetCode #2115</a>
 */
public class FindAllPossibleRecipesFromGivenSupplies {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find All Possible Recipes from Given Supplies");
    }

    public static void main(String[] args) {
        System.out.println("=== FindAllPossibleRecipesFromGivenSupplies ===");
        FindAllPossibleRecipesFromGivenSupplies sol = new FindAllPossibleRecipesFromGivenSupplies();
        System.out.println(sol.solve(null));
    }
}

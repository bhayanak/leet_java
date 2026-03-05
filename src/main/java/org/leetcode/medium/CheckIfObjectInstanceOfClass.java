package org.leetcode.medium;


/**
 * <b>#2618 - Check if Object Instance of Class</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Write a function that checks if a given value is an instance of a given class or superclass. For this problem, an object is considered an instance of a given class if that object has access to that class's methods.
 *
 *
 * There are no constraints on the data types that can be passed to the function. For example, the value or the class could be undefined.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: func = () =&gt; checkIfInstanceOf(new Date(), Date)
 * Output: true
 * Explanation: The object returned by the Date constructor is, by definition, an instance of Date.
 *
 * Example 2:
 *
 * Input: func = () =&gt; { class Animal {}; class Dog extends Animal {}; return checkIfInstanceOf(new Dog(), Animal); }
 * Output: true
 * Explanation:
 * class Animal {};
 * class Dog extends Animal {};
 * checkIfInstanceOf(new Dog(), Animal); // true
 *
 * Dog is a subclass of Animal. Therefore, a Dog object is an instance of both Dog and Animal.
 *
 * Example 3:
 *
 * Input: func = () =&gt; checkIfInstanceOf(Date, Date)
 * Output: false
 * Explanation: A date constructor cannot logically be an instance of itself.
 *
 * Example 4:
 *
 * Input: func = () =&gt; checkIfInstanceOf(5, Number)
 * Output: true
 * Explanation: 5 is a Number. Note that the "instanceof" keyword would return false. However, it is still considered an instance of Number because it accesses the Number methods. For example "toFixed()".
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: In Javascript, inheritance is achieved with the prototype chain.
 * Hint 2: You can get the prototype of an object with the Object.getPrototypeOf(obj) function. Alternatively, you can code obj['__proto__'].
 * Hint 3: You can compare an object's __proto__ with classFunction.prototype.
 * Hint 4: Traverse the entire prototype chain until you find a match.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/check-if-object-instance-of-class/">LeetCode #2618</a>
 */
public class CheckIfObjectInstanceOfClass {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if Object Instance of Class");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckIfObjectInstanceOfClass ===");
        CheckIfObjectInstanceOfClass sol = new CheckIfObjectInstanceOfClass();
        System.out.println(sol.solve(null));
    }
}

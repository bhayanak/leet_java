package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MaximumNumberOfWordsYouCanType solution. */
public class MaximumNumberOfWordsYouCanType {

    /**
     * Returns the number of words in the text that can be typed using a keyboard
     * with the given broken letters unavailable.
     * @param text  space-separated words
     * @param brokenLetters string of broken letters
     * @return count of typeable words
     * <p><b>Explanation:</b> Build a set of broken letters; for each word check no char is broken.</p>
     */
    public int solve(String text, String brokenLetters) {
        Set<Character> broken = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) broken.add(c);
        int count = 0;
        for (String word : text.split(" ")) {
            boolean ok = true;
            for (char c : word.toCharArray()) if (broken.contains(c)) { ok = false; break; }
            if (ok) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        MaximumNumberOfWordsYouCanType sol = new MaximumNumberOfWordsYouCanType();
        System.out.println(sol.solve("hello world", "ad")); // 1 ("world" fine, "hello" has no a/d but h,e,l,o - wait "hello" ok, "world" has no a/d → 2? let's check: h,e,l,l,o - none broken; w,o,r,l,d - d is broken → 1)
        System.out.println(sol.solve("leet code", "lt"));  // 1 ("code" fine, "leet" has l → 0? code: c,o,d,e - none broken → 1)
    }

}

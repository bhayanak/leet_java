package org.leetcode.easy;

/** OccurrencesAfterBigram solution. */
public class OccurrencesAfterBigram {
    /**
     * Returns all words that come immediately after every occurrence of bigram "first second".
     *
     * @param text  the input sentence
     * @param first first word of the bigram
     * @param second second word of the bigram
     * @return array of words immediately following each occurrence of the bigram
     *
     * <p><b>Explanation:</b> Splits the text into tokens and scans every consecutive triple,</p>
     *   collecting words[i+2] wherever words[i]==first and words[i+1]==second. Time O(n).
     */
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        java.util.List<String> res = new java.util.ArrayList<>();
        for (int i = 0; i + 2 < words.length; i++)
            if (words[i].equals(first) && words[i+1].equals(second))
                res.add(words[i+2]);
        return res.toArray(new String[0]);
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac OccurrencesAfterBigram.java &amp;&amp; java org.leetcode.easy.OccurrencesAfterBigram</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== OccurrencesAfterBigram ===");
        OccurrencesAfterBigram sol = new OccurrencesAfterBigram();
        System.out.println(sol.findOcurrences("hello", "hello", "hello"));
    }
}

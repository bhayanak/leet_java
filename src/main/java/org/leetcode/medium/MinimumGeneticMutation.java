package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * LeetCode #433: Minimum Genetic Mutation
 * @see <a href="https://leetcode.com/problems/minimum-genetic-mutation/">Problem</a>
 */
public class MinimumGeneticMutation {

    /**
     * LeetCode #433 – Minimum Genetic Mutation
     * Difficulty: MEDIUM
     * Topics: Hash Table, String, Breadth-First Search
     *
     * A gene string can be represented by an 8-character long string, with
     * choices from 'A', 'C', 'G', and 'T'.
     * 
     * 
     * Suppose we need to investigate a mutation from a gene string startGene to a
     * gene string endGene where one mutation is defined as one single character
     * changed in the gene string.
     * 
     * 
     * For example, "AACCGGTT" --&gt; "AACCGGTA" is one mutation.
     * 
     * There is also a gene bank bank that records all the valid gene mutations. A
     * gene must be in bank to make it a valid gene string.
     * 
     * 
     * Given the two gene strings startGene and endGene and the gene bank bank,
     * return the minimum number of mutations needed to mutate from startGene to
     * endGene. If there is no such a mutation, return -1.
     * 
     * 
     * Note that the starting point is assumed to be valid, so it might not be
     * included in the bank.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: startGene = "AACCGGTT", endGene = "AACCGGTA", bank = ["AACCGGTA"]
     * Output: 1
     * 
     * Example 2:
     * 
     * Input: startGene = "AACCGGTT", endGene = "AAACGGTA", bank =
     * ["AACCGGTA","AACCGCTA","AAACGGTA"]
     * Output: 2
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 0 &lt;= bank.length &lt;= 10
     * 
     * startGene.length == endGene.length == bank[i].length == 8
     * 
     * startGene, endGene, and bank[i] consist of only the characters ['A', 'C',
     * 'G', 'T'].
     */
    // BFS: each mutation changes one character to A/C/G/T
    /**
     * Computes the minimum Min mutation.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param startGene the startGene (String)
     * @param endGene the endGene (String)
     * @param bank the bank (String[])
     * @return the computed int result
     */
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(endGene)) return -1;
        Queue<String> q = new LinkedList<>();
        q.offer(startGene);
        Set<String> visited = new HashSet<>();
        visited.add(startGene);
        int steps = 0;
        char[] genes = {'A','C','G','T'};
        while (!q.isEmpty()) {
            int size = q.size(); steps++;
            for (int i = 0; i < size; i++) {
                char[] cur = q.poll().toCharArray();
                for (int j = 0; j < cur.length; j++) {
                    char orig = cur[j];
                    for (char g : genes) {
                        cur[j] = g;
                        String next = new String(cur);
                        if (next.equals(endGene)) return steps;
                        if (bankSet.contains(next) && !visited.contains(next)) {
                            visited.add(next); q.offer(next);
                        }
                    }
                    cur[j] = orig;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MinimumGeneticMutation sol = new MinimumGeneticMutation();
        System.out.println(sol.minMutation("hello", "hello", new String[]{"a","b"}));
    }
}

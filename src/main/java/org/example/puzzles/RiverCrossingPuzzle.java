package org.example.puzzles;

import java.util.*;

/**
 * RiverCrossingPuzzle
 *
 * Problem: Classic puzzle - A farmer must take a wolf, goat, and cabbage across a river. The boat can carry only one item at a time.
 * Wolf can’t be left with goat, goat can’t be left with cabbage. Model this in Java (state machine or backtracking).
 *
 * Approach: Use backtracking (BFS) to explore all valid states, avoiding invalid ones. Each state is represented by the positions of the farmer, wolf, goat, and cabbage.
 * This is a classic state-space search problem, testing modeling and recursion/backtracking skills.
 *
 * Example: The solution prints the sequence of moves to get all safely across the river.
 */
public class RiverCrossingPuzzle {
    /**
     * Represents the state of the puzzle.
     * Each boolean indicates if the entity is on the right bank (true) or left bank (false).
     * The 'prev' field is used to reconstruct the solution path.
     * The 'move' field describes the move taken to reach this state.
     */
    static class State {
        boolean farmer, wolf, goat, cabbage; // true = right, false = left
        State prev;
        String move;
        State(boolean f, boolean w, boolean g, boolean c, State p, String m) {
            farmer = f; wolf = w; goat = g; cabbage = c; prev = p; move = m;
        }
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof State)) return false;
            State s = (State) o;
            return farmer == s.farmer && wolf == s.wolf && goat == s.goat && cabbage == s.cabbage;
        }
        @Override
        public int hashCode() {
            return Objects.hash(farmer, wolf, goat, cabbage);
        }
    }

    /**
     * Checks if the state is valid (no one eats anyone).
     * Goat cannot be left with wolf or cabbage without the farmer.
     */
    static boolean isValid(State s) {
        if (s.goat == s.wolf && s.goat != s.farmer) return false; // Wolf eats goat
        if (s.goat == s.cabbage && s.goat != s.farmer) return false; // Goat eats cabbage
        return true;
    }

    /**
     * Solves the puzzle and prints the sequence of moves.
     * Uses BFS to find the shortest solution.
     */
    public static void solve() {
        Queue<State> queue = new LinkedList<>();
        Set<State> visited = new HashSet<>();
        State start = new State(false, false, false, false, null, "Start");
        queue.add(start);
        while (!queue.isEmpty()) {
            State curr = queue.poll();
            // If all are on the right bank, print the solution
            if (curr.farmer && curr.wolf && curr.goat && curr.cabbage) {
                printSolution(curr);
                return;
            }
            // Skip invalid or already visited states
            if (!isValid(curr) || visited.contains(curr)) continue;
            visited.add(curr);
            // Farmer moves alone
            queue.add(new State(!curr.farmer, curr.wolf, curr.goat, curr.cabbage, curr, "Farmer alone"));
            // Farmer takes wolf
            if (curr.farmer == curr.wolf)
                queue.add(new State(!curr.farmer, !curr.wolf, curr.goat, curr.cabbage, curr, "Farmer takes wolf"));
            // Farmer takes goat
            if (curr.farmer == curr.goat)
                queue.add(new State(!curr.farmer, curr.wolf, !curr.goat, curr.cabbage, curr, "Farmer takes goat"));
            // Farmer takes cabbage
            if (curr.farmer == curr.cabbage)
                queue.add(new State(!curr.farmer, curr.wolf, curr.goat, !curr.cabbage, curr, "Farmer takes cabbage"));
        }
        System.out.println("No solution found.");
    }

    /**
     * Prints the sequence of moves from the initial state to the solution.
     */
    static void printSolution(State s) {
        List<String> moves = new ArrayList<>();
        while (s != null) {
            moves.add(s.move);
            s = s.prev;
        }
        Collections.reverse(moves);
        for (String move : moves) System.out.println(move);
    }

    /**
     * Main method to demonstrate the river crossing puzzle solution.
     */
    public static void main(String[] args) {
        solve();
    }
}

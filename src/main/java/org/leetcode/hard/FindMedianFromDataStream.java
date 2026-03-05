package org.leetcode.hard;

/**
 * <b>#295 - Find Median from Data Stream</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Two Pointers, Design, Sorting, Heap (Priority Queue), Data Stream</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.
 * 
 * 	
 * For example, for arr = [2,3,4], the median is 3.
 * 	
 * For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
 * 
 * Implement the MedianFinder class:
 * 
 * 	
 * MedianFinder() initializes the MedianFinder object.
 * 	
 * void addNum(int num) adds the integer num from the data stream to the data structure.
 * 	
 * double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
 * [[], [1], [2], [], [3], []]
 * Output
 * [null, null, null, 1.5, null, 2.0]
 * 
 * Explanation
 * MedianFinder medianFinder = new MedianFinder();
 * medianFinder.addNum(1);    // arr = [1]
 * medianFinder.addNum(2);    // arr = [1, 2]
 * medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
 * medianFinder.addNum(3);    // arr[1, 2, 3]
 * medianFinder.findMedian(); // return 2.0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -105 &lt;= num &lt;= 105
 * 	
 * There will be at least one element in the data structure before calling findMedian.
 * 	
 * At most 5 * 104 calls will be made to addNum and findMedian.
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * If all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
 * 	
 * If 99% of all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Two heaps: maxHeap for lower half, minHeap for upper half.
 * Keep sizes balanced (differ by at most 1). Median is from the heap tops.
 *
 * <h2>Complexity</h2>
* Time: O(log n) add, O(1) findMedian  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/find-median-from-data-stream/">LeetCode #295</a>
 */
public class FindMedianFromDataStream {

    static class MedianFinder {
        private java.util.PriorityQueue<Integer> lo = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder()); // max-heap
        private java.util.PriorityQueue<Integer> hi = new java.util.PriorityQueue<>(); // min-heap
    /**
     * Adds Add num.
     *
     * @param num the num (int)
     */
        public void addNum(int num) {
            lo.offer(num);
            hi.offer(lo.poll());         // balance: push lo's max into hi
            if(lo.size()<hi.size()) lo.offer(hi.poll()); // keep lo >= hi in size
        }
    /**
     * Finds Find median.
     *
     * @return the computed double result
     */
        public double findMedian() {
            return lo.size()>hi.size() ? lo.peek() : (lo.peek()+hi.peek())/2.0;
        }
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        MedianFinder sol = new MedianFinder();
        sol.addNum(1);
        sol.addNum(2);
        System.out.println(sol.findMedian()); // 1.5
    }
}

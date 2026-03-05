package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #733: Flood Fill
 * @see <a href="https://leetcode.com/problems/flood-fill/">Problem</a>
 */
public class FloodFill {

    /**
     * LeetCode #733 – Flood Fill
     * Difficulty: EASY
     * Topics: Array, Depth-First Search, Breadth-First Search, Matrix
     *
     * You are given an image represented by an m x n grid of integers image,
     * where image[i][j] represents the pixel value of the image. You are also
     * given three integers sr, sc, and color. Your task is to perform a flood
     * fill on the image starting from the pixel image[sr][sc].
     * 
     * 
     * To perform a flood fill:
     * 
     * 
     * Begin with the starting pixel and change its color to color.
     * 
     * Perform the same process for each pixel that is directly adjacent (pixels
     * that share a side with the original pixel, either horizontally or
     * vertically) and shares the same color as the starting pixel.
     * 
     * Keep repeating this process by checking neighboring pixels of the updated
     * pixels and modifying their color if it matches the original color of the
     * starting pixel.
     * 
     * The process stops when there are no more adjacent pixels of the original
     * color to update.
     * 
     * Return the modified image after performing the flood fill.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
     * 
     * 
     * Output: [[2,2,2],[2,2,0],[2,0,1]]
     * 
     * 
     * Explanation:
     * 
     * From the center of the image with position (sr, sc) = (1, 1) (i.e., the red
     * pixel), all pixels connected by a path of the same color as the starting
     * pixel (i.e., the blue pixels) are colored with the new color.
     * 
     * 
     * Note the bottom corner is not colored 2, because it is not horizontally or
     * vertically connected to the starting pixel.
     * 
     * Example 2:
     * 
     * Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
     * 
     * 
     * Output: [[0,0,0],[0,0,0]]
     * 
     * 
     * Explanation:
     * 
     * 
     * The starting pixel is already
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }
    private void fill(int[][] img, int r, int c, int orig, int newColor) {
        if (r<0||r>=img.length||c<0||c>=img[0].length||img[r][c]!=orig) return;
        img[r][c] = newColor;
        fill(img,r+1,c,orig,newColor); fill(img,r-1,c,orig,newColor);
        fill(img,r,c+1,orig,newColor); fill(img,r,c-1,orig,newColor);
    }

    public static void main(String[] args) {
        FloodFill sol = new FloodFill();
        System.out.println(sol.floodFill(new int[][]{{1,2},{3,4}}, 0, 0, 0));
    }
}

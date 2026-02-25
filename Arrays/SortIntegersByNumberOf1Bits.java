// Problem: Sort Integers by the Number of 1 Bits
// Platform: LeetCode
// Approach: Bit Manipulation + Custom Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.*;

class Solution {

    public int[] sortByBits(int[] arr) {
        
        // Convert int[] to Integer[] for custom sorting
        Integer[] temp = Arrays.stream(arr)
                               .boxed()
                               .toArray(Integer[]::new);

        // Sort based on number of 1 bits
        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            // First compare by bit count
            if (countA != countB) {
                return countA - countB;
            }
            
            // If bit count same, compare normally
            return a - b;
        });

        // Convert back to int[]
        return Arrays.stream(temp)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}

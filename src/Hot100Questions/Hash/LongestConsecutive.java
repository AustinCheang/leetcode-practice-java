package Hot100Questions.Hash;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    /**
     * LeetCode 128 - Longest Consecutive Sequence
     * Finds the longest consecutive sequence in an unsorted array of integers.
     * This method uses a HashSet for efficient lookups and only starts a sequence count
     * when it finds the smallest number of a potential sequence (i.e., when num - 1 is not in the set).
     * It then counts consecutive numbers until the sequence breaks.
     * <p>
     * Time: O(n) | Space: O(n)
     **/
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<>();

        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            // Find the first starting sequence
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                // Look for the consecutive sequence of current head
                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}

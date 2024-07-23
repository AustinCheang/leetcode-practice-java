package Hot100Questions.Hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * LeetCode 1: Two Sum
     * Finds two numbers in the given array that add up to the target sum.
     * <p>
     * This method uses a HashMap to store the complement of each number
     * and its index. It iterates through the array once, checking if the
     * complement of the current number exists in the map. If found, it
     * returns the indices of the two numbers that sum up to the target.
     * <p>
     * Time: O(n) | Space: O(n)
     **/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remainder = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (remainder.containsKey(diff)) {
                return new int[]{remainder.get(diff), i};
            }
            remainder.put(nums[i], i);

        }
        return new int[]{-1, -1};
    }
}

package Hot100Questions.TwoPointers;

public class MoveZeroes {
    /**
     * LeetCode 283 - Move Zeroes
     * Moves all zeros in the input array to the end while maintaining the relative order of non-zero elements.
     * This method modifies the input array in-place.
     * <p>
     * Time: O(n) | Space: O(1)
     */
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        for (; left < nums.length; left++) {
            nums[left] = 0;
        }
    }
}

package Hot100Questions.TwoPointers;

public class ContainerWithMostWater {
    public int calculateArea(int height, int width) {
        return height * width;
    }

    /**
     * Finds the maximum area that can be contained between two vertical lines in the given height array.
     * Uses the two-pointer technique to efficiently solve the problem.
     * <p>
     * Algorithm:
     * 1. Initialize two pointers, left at the start and right at the end of the array.
     * 2. Calculate the area between the lines at left and right pointers.
     * 3. Update the maximum area if the current area is larger.
     * 4. Move the pointer with the shorter line towards the center:
     * - If the left line is shorter, move left pointer to the right.
     * - If the right line is shorter, move right pointer to the left.
     * 5. Repeat steps 2-4 until the pointers m
     * <p>
     * Time: O(n) | Space: O(1)
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int currentMax = -1;

        while (left < right) {
            int area = calculateArea(Math.min(height[left], height[right]), right - left);
            currentMax = Math.max(currentMax, area);

            // Update left or right pointer to get next larger area
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return currentMax;
    }
}

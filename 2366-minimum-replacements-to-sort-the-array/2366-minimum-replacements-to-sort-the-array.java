class Solution {
    public long minimumReplacement(int[] nums) {

        long operations = 0;

        // Maximum value allowed for the current element
        int limit = nums[nums.length - 1];

        // Traverse from right to left
        for (int i = nums.length - 2; i >= 0; i--) {

            // No replacement needed
            if (nums[i] <= limit) {
                limit = nums[i];
                continue;
            }

            // Number of pieces needed (ceil(nums[i] / limit))
            int pieces = (nums[i] + limit - 1) / limit;

            // Each extra piece is one replacement
            operations += pieces - 1;

            // Update the maximum allowed value for the next iteration
            limit = nums[i] / pieces;
        }

        return operations;
    }
}
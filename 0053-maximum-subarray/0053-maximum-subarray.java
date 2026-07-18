class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Start new subarray or continue old one
            currSum = Math.max(nums[i], currSum + nums[i]);

            // Update maximum sum
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
        
    }
}
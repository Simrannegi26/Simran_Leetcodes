class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;

         // use sum of n natural no's formula

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum = actualSum + num;
        }

        return expectedSum - actualSum;
        
    }
}
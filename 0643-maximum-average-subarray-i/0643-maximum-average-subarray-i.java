class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int windowSum=0;
        for(int i=0; i<k;i++){
            windowSum+= nums[i];
        }
        int max= windowSum;

        for(int i=k; i<n; i++){
            windowSum+= nums[i]-nums[i-k];
            max= Math.max(max, windowSum);
        }
        return (double)max/k;
        
    }
}
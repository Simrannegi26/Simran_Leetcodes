class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minLen= Integer.MAX_VALUE; // store min length for initialization
        for(int right=0; right<nums.length; right++){
            
            //add curr element
            sum+= nums[right];

            //Shrink window while condition is satisfied
            while(sum>=target){
                minLen= Math.min(minLen, right-left +1);  // update min Length
                sum-= nums[left];                         // remove leftmost element
                left++;

            }
        }
        // no no subarray exists return 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
        
    }
}
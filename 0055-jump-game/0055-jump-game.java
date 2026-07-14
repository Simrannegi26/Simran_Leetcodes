class Solution {
    public boolean canJump(int[] nums) {
        int final_pos= nums.length-1;
        for(int indx= nums.length-2; indx>=0; indx--){
            if(indx + nums[indx] >= final_pos){
                final_pos = indx;
            }
        }
        return final_pos ==0;  
    }
}
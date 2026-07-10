class Solution {
    public int singleNumber(int[] nums) {
        // Approach- using XOR 
        //For Ex- 1 xor 2 xor 2 xor gives 1 as output becoz 2 xor 2 = 0 and 0 xor 1 = 1

        int single = 0;
        for(int i=0; i<nums.length; i++){
            single= single^nums[i];
        }
        return single;

    }
}
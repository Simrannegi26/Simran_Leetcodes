class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if(n<3){
            return n;
        }
        // converts the number into its binary representation
        // then count no of bits
        int bits= Integer.toBinaryString(n).length();

        // << is the left shift operator.
        // It shifts the binary digits of 1 to the left.


        return 1 << bits;          


        
    }
}
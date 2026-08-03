class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans= new int[n];

        int left=0;
        int right= n -1;
        int index= n-1;

        while(left<= right){
            int LeftSq= nums[left]*nums[left];
            int RytSq= nums[right]*nums[right];

             if (LeftSq > RytSq) {
                ans[index] = LeftSq;
                left++;
            } else {
                ans[index] = RytSq;
                right--;
            }

            index--;
        }

        return ans;
          
    }
}
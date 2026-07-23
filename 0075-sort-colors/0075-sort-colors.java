class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right= nums.length -1;

        while(mid<= right){
            switch(nums[mid]){

                case 0:
                swap(nums,left, mid);
                mid++;
                left++;
                break;

                case 1:
                mid++;
                break;

                case 2:
                swap(nums, mid, right);
                right--;
                break;
            }
        }  
    }
    private void swap(int[]arr, int pos1, int pos2){
        int temp= arr[pos1];
        arr[pos1]= arr[pos2];
        arr[pos2]= temp;
    }
}
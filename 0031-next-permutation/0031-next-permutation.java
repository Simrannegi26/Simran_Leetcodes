class Solution {
    public void nextPermutation(int[] nums) {
         int i = nums.length - 2;

        // Find the pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
         // Find the next greater element and swap
        if (i >= 0) {
            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }
         //Reverse the remaining part
        reverse(nums, i + 1, nums.length - 1);
    }

    // Swap two elements
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse the array from left to right
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}

  
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] nums, int index, List<Integer> curr) {

        ans.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {

            curr.add(nums[i]);          // Choose

            backtrack(nums, i + 1, curr); // Explore

            curr.remove(curr.size() - 1); // Undo (Backtrack)
        }
    }
}
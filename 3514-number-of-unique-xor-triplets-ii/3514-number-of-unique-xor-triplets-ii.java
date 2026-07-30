class Solution {
    public int uniqueXorTriplets(int[] nums) {

        int maxVal = 0;
        for (int x : nums) {
            maxVal = Math.max(maxVal, x);
        }

        int LIMIT = 1;
        while (LIMIT <= maxVal) {
            LIMIT <<= 1;
        }

        boolean[] pairXor = new boolean[LIMIT];
        boolean[] ans = new boolean[LIMIT];

        int n = nums.length;

        // All XORs of pairs (i <= j)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairXor[nums[i] ^ nums[j]] = true;
            }
        }

        // XOR each pair result with every element
        for (int x = 0; x < LIMIT; x++) {
            if (!pairXor[x]) continue;

            for (int num : nums) {
                ans[x ^ num] = true;
            }
        }

        int count = 0;
        for (boolean b : ans) {
            if (b) count++;
        }

        return count;
    }
}
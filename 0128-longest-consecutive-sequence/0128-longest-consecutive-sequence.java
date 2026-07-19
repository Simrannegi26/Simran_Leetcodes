class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();

        // Add all numbers to the HashSet
        for (int num : nums) {
            set.add(num);
        }
        int maxLen= 0;

        // Check each number
        for (int num : set) {

            // Start only if it's the beginning of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int len = 1;

                 // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    len++;
                }

                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;

      
        
    }
}
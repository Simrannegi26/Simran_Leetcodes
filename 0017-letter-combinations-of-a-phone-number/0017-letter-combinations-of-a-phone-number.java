import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "",      // 0
            "",      // 1
            "abc",   // 2
            "def",   // 3
            "ghi",   // 4
            "jkl",   // 5
            "mno",   // 6
            "pqrs",  // 7
            "tuv",   // 8
            "wxyz"   // 9
        };

        backtrack(digits, 0, new StringBuilder(), ans, map);

        return ans;
    }

    public void backtrack(String digits, int index,
                          StringBuilder current,
                          List<String> ans,
                          String[] map) {

        // Base case
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        // Convert current digit character to integer
        int digit = digits.charAt(index) - '0';

        // Get corresponding letters
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {

            // Choose
            current.append(letters.charAt(i));

            // Explore
            backtrack(digits, index + 1, current, ans, map);

            // Undo choice
            current.deleteCharAt(current.length() - 1);
        }
    }
}
        
   

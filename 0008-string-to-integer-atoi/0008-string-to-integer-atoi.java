class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long ans = 0;

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If string is empty after removing spaces
        if (i == n) {
            return 0;
        }

        // Check sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } 
        else if (s.charAt(i) == '+') {
            i++;
        }

        // Read digits
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            ans = ans * 10 + digit;

            // Overflow
            if (sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            // Underflow
            if (sign == -1 && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * ans);
    }
}
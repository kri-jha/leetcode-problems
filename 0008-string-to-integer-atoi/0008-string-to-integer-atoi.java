class Solution {

    public int myAtoi(String s) {

        int n = s.length();
        int index = 0;

        // 1. Ignore leading spaces
        while (index < n) {
            if (s.charAt(index) == ' ') {
                index++;
            } else {
                break;
            }
        }

        // 2. Check sign
        int sign = 1;

        // Important: index < n check
        if (index < n && s.charAt(index) == '-') {
            sign = -1;
            index++;

        } else if (index < n && s.charAt(index) == '+') {
            sign = 1;
            index++;
        }

        // 3. Recursion
        return parse(s, index, sign, 0);
    }


    public int parse(String s, int index, int sign, long result) {

        // Base condition
        if (index == s.length() ||
            !Character.isDigit(s.charAt(index))) {

            return (int) (result * sign);
        }

        // Current digit
        int digit = s.charAt(index) - '0';

        // Update result
        result = result * 10 + digit;


        // Positive overflow
        if (sign == 1 && result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }


        // Negative overflow
        if (sign == -1 && -result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }


        // Recursive call
        return parse(s, index + 1, sign, result);
    }
}
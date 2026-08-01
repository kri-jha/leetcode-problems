class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        Integer[][] memo = new Integer[n][n];
        // If the max score difference Player 1 can achieve is >= 0, they win.
        return maxScoreDifference(nums, 0, n - 1, memo) >= 0;
    }

    private int maxScoreDifference(int[] nums, int left, int right, Integer[][] memo) {
        // Base case: only one element left
        if (left == right) {
            return nums[left];
        }
        
        // Return pre-calculated result if it exists
        if (memo[left][right] != null) {
            return memo[left][right];
        }
        
        // Option 1: Pick the left element
        int pickLeft = nums[left] - maxScoreDifference(nums, left + 1, right, memo);
        
        // Option 2: Pick the right element
        int pickRight = nums[right] - maxScoreDifference(nums, left, right - 1, memo);
        
        // The current player will choose the option that maximizes their score difference
        memo[left][right] = Math.max(pickLeft, pickRight);
        
        return memo[left][right];
    }
}
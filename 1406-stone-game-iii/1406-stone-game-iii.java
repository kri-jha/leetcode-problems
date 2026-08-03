class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        // We only need the last 3 dp states
        int[] dp = new int[3]; 
        
        for (int i = n - 1; i >= 0; i--) {
            int maxDiff = Integer.MIN_VALUE;
            int currentSum = 0;
            
            // The current player can take 1, 2, or 3 stones
            for (int j = 0; j < 3 && i + j < n; j++) {
                currentSum += stoneValue[i + j];
                // Subtract the best the opponent can do from the remaining stones
                maxDiff = Math.max(maxDiff, currentSum - dp[(i + j + 1) % 3]);
            }
            
            // Store the result for the current index
            dp[i % 3] = maxDiff;
        }
        
        // dp[0] represents the maximum score difference Alice can achieve starting from index 0
        if (dp[0] > 0) {
            return "Alice";
        } else if (dp[0] < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}
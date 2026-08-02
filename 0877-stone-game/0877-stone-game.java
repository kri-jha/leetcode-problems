class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        // dp[i][j] stores the max score difference for subarray piles[i...j]
        int[][] dp = new int[n][n];
        
        // Base case: sub-arrays of length 1 (a player just takes that pile)
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }
        
        // Iterate over sub-array lengths (d is the distance between i and j)
        for (int d = 1; d < n; d++) {
            for (int i = 0; i < n - d; i++) {
                int j = i + d;
                // The current player takes either the left pile or the right pile,
                // minus whatever the next player can optimally achieve.
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
            }
        }
        
        // If the max score difference for the whole array is > 0, Alice wins
        return dp[0][n - 1] > 0;
    }
}
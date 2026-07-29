class Solution {
    // Cap limits to prevent massive numbers since k <= 10^6
    private final long MAX = 1000001L;

    public String smallestPalindrome(String s, int k) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Build the available character pool for the left half
        int[] halfCount = new int[26];
        String midLetter = "";
        
        for (int i = 0; i < 26; i++) {
            halfCount[i] = count[i] / 2;
            if (count[i] % 2 == 1) {
                midLetter = String.valueOf((char) (i + 'a'));
            }
        }
        
        // If total permutations are fewer than k, return ""
        long totalPerm = countArrangements(halfCount);
        if (k > totalPerm) {
            return "";
        }
        
        // Greedily build the left half
        StringBuilder leftHalf = generateLeftHalf(halfCount, k);
        
        // Construct the final palindrome
        StringBuilder result = new StringBuilder();
        result.append(leftHalf);
        result.append(midLetter);
        result.append(leftHalf.reverse());
        
        return result.toString();
    }
    
    private StringBuilder generateLeftHalf(int[] halfCount, long k) {
        int halfLen = 0;
        for (int freq : halfCount) {
            halfLen += freq;
        }
        
        StringBuilder left = new StringBuilder();
        
        for (int step = 0; step < halfLen; step++) {
            for (int i = 0; i < 26; i++) {
                if (halfCount[i] == 0) {
                    continue;
                }
                
                // Temporarily use character 'i'
                halfCount[i]--;
                long arrangements = countArrangements(halfCount);
                
                if (arrangements >= k) {
                    // Keep the character and move to the next position
                    left.append((char) (i + 'a'));
                    break;
                } else {
                    // Skip these arrangements and restore the character
                    k -= arrangements;
                    halfCount[i]++;
                }
            }
        }
        return left;
    }
    
    private long countArrangements(int[] count) {
        int total = 0;
        for (int freq : count) {
            total += freq;
        }
        
        long res = 1;
        for (int freq : count) {
            if (freq > 0) {
                res *= nCk(total, freq);
                if (res >= MAX) {
                    return MAX;
                }
                total -= freq;
            }
        }
        return res;
    }
    
    private long nCk(int n, int k) {
        long res = 1;
        int limit = Math.min(k, n - k);
        for (int i = 1; i <= limit; i++) {
            res = res * (n - i + 1) / i;
            if (res >= MAX) {
                return MAX;
            }
        }
        return res;
    }
}
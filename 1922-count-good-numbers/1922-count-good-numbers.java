class Solution {

    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = power(5, even);
        ans = (ans * power(4, odd)) % MOD;

        return (int) ans;
    }

    public long power(long a, long b) {

        // Base case
        if (b == 0) {
            return 1;
        }

        // Recursive call
        long half = power(a, b / 2);

        long result = (half * half) % MOD;

        // If exponent is odd
        if (b % 2 == 1) {
            result = (a * result) % MOD;
        }

        return result;
    }
}
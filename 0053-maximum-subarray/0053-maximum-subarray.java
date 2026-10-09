class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int ls = nums[0];
        int sum =nums[0];
        for(int i=1; i<n; i++)
        {
        sum +=nums[i];

        // if(sum<0 && n==1)
        // {
        //     return sum;
        // }
        // if(sum<=0)
        // {
        //     sum=0;
        // } else {
        //     ls = Math.max(sum, ls);
        // }

        sum = Math.max(sum ,nums[i]);
        ls = Math.max(sum ,ls);

        }
        return ls;
    }
}
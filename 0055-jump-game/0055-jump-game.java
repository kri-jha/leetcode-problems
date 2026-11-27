class Solution {
    public boolean canJump(int[] nums) {
        int maxsteps =0;
        int n = nums.length;

        for(int i=0; i<n; i++)
        {
            if(i>maxsteps)
            {
                return false;
            }

            maxsteps = Math.max(maxsteps , i+nums[i]);

            if(maxsteps>=n-1)
            {
                return true;
            }

    

        }
        return true;
    }
}
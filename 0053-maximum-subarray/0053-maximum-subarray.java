class Solution {
    public int maxSubArray(int[] nums) {
  int n = nums.length;

  int ms= Integer.MIN_VALUE;
int csum =0;
  for( int num : nums)
  {
   
    csum+=num;

    ms = Math.max(ms , csum);
    if(csum <0)
    {
        csum=0;
    }

  }
  return ms;
    }
}


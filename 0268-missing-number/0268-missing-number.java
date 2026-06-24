class Solution {
    public int missingNumber(int[] nums) {
        // int i =0;
        // int j = nums.length-1;

        // Arrays.sort(nums);
        // int asum=0;
        // int n = nums.length;

        // for(int i =0; i<nums.length; i++)
        // {
        //     asum += nums[i];

        // }
        // int exsum = n*(n+1)/2;

        // return exsum -asum;  // by the formula method 

        Arrays.sort(nums);

        int n = nums.length;
        int i =0;
        int j =nums.length-1;


        while(i<=j)
        {
            int mid = (i+j)/2;

            if(nums[mid]==mid)
            {
                i=mid+1;
            } else j = mid-1;

          

        }

          return i;


    }
}
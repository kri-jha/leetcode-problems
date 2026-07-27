class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        // int max =0;
        // Arrays.sort(nums);

        // int i =nums[n-2];
        // int j = nums[nums.length-1];
        //  int p = ((nums[i]-1)* (nums[j]-1));

        int fm =0;
        int sm =0;

        for(int i=0; i<n; i++)
        {
            if(nums[i]>fm)
            {
                // int temp =fm;
                sm = fm;
                fm = nums[i];
            } 
            else if(nums[i]>sm)
            {
                sm =nums[i];
            }
        }

    // int p = ((nums[fm]-1)* (nums[j]-1));
    int p = (fm-1)*(sm-1);

    return p;
        

        


        // for(int i=0; i<n; i++)
        // {
        //     for(int j=i+1; j<n; j++)
        //     {
        //         int p = ((nums[i]-1)* (nums[j]-1));
        //         max = Math.max(max, p);
        //     }
        // }
        // return max;

        // return p;
    }
}
class Solution {
    public int findGCD(int[] nums) {
        // int n =nums.length;
// Arrays.sort(nums);
//         int g=nums[0];
//         int b = nums.length;
//         int s=nums[b-1];

        // for(int i=0;i<b; i++){
        //     if(nums[i]%g==0 && nums[i]%s==0)
        //     {
        //         return 
        //     }
        // }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            if(num<min)
            {
                min=num;
            }

            if(num>max)
            {
                max=num;
            }

        }
        
        while(min!=0)
        {
            int temp =min;
            min=max % min;
            max=temp;

            // if(s==0)
            // {
            //     return g;
                
            // }
        }
        return max;
        
    }
}
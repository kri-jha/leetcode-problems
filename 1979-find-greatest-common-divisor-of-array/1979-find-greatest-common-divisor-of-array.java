class Solution {
    public int findGCD(int[] nums) {
        // int n =nums.length;
Arrays.sort(nums);
        int g=nums[0];
        int b = nums.length;
        int s=nums[b-1];

        // for(int i=0;i<b; i++){
        //     if(nums[i]%g==0 && nums[i]%s==0)
        //     {
        //         return 
        //     }
        // }
        
        while(s!=0)
        {
            int temp =s;
            s=g%s;
            g=temp;

            // if(s==0)
            // {
            //     return g;
                
            // }
        }
        return g;
        
    }
}
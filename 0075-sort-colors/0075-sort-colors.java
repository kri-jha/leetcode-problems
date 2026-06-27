class Solution {
    public void sortColors(int[] nums) {
        // // Arrays.sort(nums);
        // int l =0;
        // int n = nums.length;
        // int r = n-1;
        // int i =0;

        
        
        //     while(i<=r)
        //     {
        //         if(nums[i]==0)
        //         {
        //             int temp = nums[i];
        //             nums[i] = nums[l];
        //            nums[l] = temp;
        //             l++;
        //             i++;
        //         } else if(nums[i] ==1)
        //         {
        //             i++;
        //         }




        //         else
        //         {
        //               int temp = nums[i];
        //         nums[i] = nums[r];
        //         nums[r] = temp;

        //             r--;
                    
                    
        //         }
        //     }

        int count0 = 0;
        int count1 = 0;
        int count2=0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                count0++;
            } else if(nums[i]==1)
            {
                count1++;
            } else 
            {
                count2++;
            }
        }

         int index = 0;

        while (count0 > 0) {
            nums[index] = 0;
            index++;
            count0--;
        }

        while(count1>0)
        {
            nums[index] =1;
            index++;
            count1--;
        }


        while (count2> 0) {
            nums[index] = 2;
            index++;
            count2--;
        }


   
    }
}
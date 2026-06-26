class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int l =0;
        int n = nums.length;
        int r = n-1;
        int i =0;

        
        
            while(i<=r)
            {
                if(nums[i]==0)
                {
                    int temp = nums[i];
                    nums[i] = nums[l];
                   nums[l] = temp;
                    l++;
                    i++;
                } else if(nums[i] ==1)
                {
                    i++;
                }




                else
                {
                      int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;

                    r--;
                    
                    
                }
            }
    }
}
class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        // int min =0;
        
        for(int i=0; i<n; i++)
        { int sd =0;
        int curr =nums[i];
           while (curr>0)
           {
            int ld= Math.abs(curr) % 10;
             sd +=ld;
             curr/=10;
            
           }

           if(sd ==i)
           {
            // min = Math.min(min , i);
            return i;
           }
           
        }

        return -1;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length+ nums2.length];
        // int n = res.length;
int idx=0;
        int m = nums1.length;
        int n = nums2.length;

        for(int i=0 ; i<m; i++)
        {
            res[idx] = nums1[i];
            idx++;

        }
        for(int j=0; j<n; j++)
        {
            res[idx] = nums2[j];
            idx++;
        }
        Arrays.sort(res);
        
        int l= res.length;  // res ki length hai 
        if(l%2==1) {
            return res[l/2];
        } else 
        {
            int mid1 = res[l/2-1];
            int mid2 = res[l/2];
            return (mid1+mid2)/2.0;
        }
         

        // for(int k =0; k<res.length; k++)
        // {
        //  // if length is odd then apply median formula 
        // }
    }
}
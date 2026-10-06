class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
    //  Arrays.sort(nums);
        int m = n/2;
        // int max =0;


HashMap<Integer ,Integer> map = new HashMap<>();


for(int num : nums)
{
    map.put(num , map.getOrDefault(num ,0)+1);
}
for(int j: nums)
{
    if(map.get(j)>m)
    {
        return j;
    }
}
       return -1;
        
    }
}
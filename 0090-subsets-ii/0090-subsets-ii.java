class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        List<Integer> curr =  new ArrayList<>();

        solve(0 , curr , res , nums);
        return res;
    }

    public void  solve(int index ,  List<Integer>curr  , List<List<Integer>>res , int []nums )
    {
        // empty case ka case yaad ana chahiye 
               res.add(new ArrayList<>(curr));
         
        


        for(int i =index; i<nums.length; i++)
        {
            if(i>index  && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);

            solve(i+1, curr, res, nums);

            curr.remove(curr.size()-1);
        }
    }
}
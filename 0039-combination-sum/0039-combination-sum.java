class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
          List<List<Integer>> res =new ArrayList<>();

           cs(0,candidates, target, curr, res);
           return res;

    }

    public void cs(int i, int[] candidates, int target, List<Integer>curr , List<List<Integer>>res)
    {
 if(target==0)
 {
     res.add(new ArrayList<>(curr));
     return;
 } 

 if(target<0 ||i==candidates.length)
 {
    return;
 }

 curr.add(candidates[i]);
        cs(i,candidates, target-candidates[i], curr, res);

        curr.remove(curr.size()-1); // backtrack to remove the lastest element to try different combination.

        cs(i+1, candidates, target, curr, res); // skip the element unitl the get the arr end 

    }
}
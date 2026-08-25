class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        solve(candidates, target, 0,
              new ArrayList<>(), ans);

        return ans;
    }

    public void solve(int[] candidates,
                      int target,
                      int index,
                      List<Integer> current,
                      List<List<Integer>> ans) {

        // Target achieve ho gaya
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Array khatam ya target negative
        if (index == candidates.length || target < 0) {
            return;
        }

        // ----------------
        // CHOOSE
        // ----------------

        current.add(candidates[index]);

        solve(candidates,
              target - candidates[index],
              index + 1,
              current,
              ans);

        // Backtrack
        current.remove(current.size() - 1);


        // ----------------
        // SKIP
        // ----------------

        // Duplicate skip
        int next = index + 1;

        while (next < candidates.length &&
               candidates[next] == candidates[index]) {
            next++;
        }

        solve(candidates,
              target,
              next,
              current,
              ans);
    }
}
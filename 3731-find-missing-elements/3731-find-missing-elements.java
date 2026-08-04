class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        Set<Integer> numSet = new HashSet<>();
        
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
            numSet.add(num);
        }
        
        List<Integer> missingNums = new ArrayList<>();
        
        for (int i = minNum; i <= maxNum; i++) {
            if (!numSet.contains(i)) {
                missingNums.add(i);
            }
        }
        
        return missingNums;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] ans = new int [n];

        for(int i=0; i<n; i++)
        {
            ans[i] =0;
        }

        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++)
        {

            int curr =i;
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()])
            {
                ans[s.peek()] = i-s.peek();
                s.pop();
            }

           
            s.push(i);
        }
        return ans;
    }
}
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];

            while (!s.isEmpty() && curr < 0 && s.peek() > 0) {
                if (s.peek() < Math.abs(curr)) {
                    s.pop();
                } 
                else if (s.peek() == Math.abs(curr)) {
                    s.pop();
                    curr = 0;
                    break;
                } 
                else {
                    curr = 0;
                    break;
                }
            }

            if (curr != 0) {
                s.push(curr);
            }
        }

        int[] ans = new int[s.size()];

        for (int i = 0; i < s.size(); i++) {
            ans[i] = s.get(i);
        }

        return ans;
    }
}
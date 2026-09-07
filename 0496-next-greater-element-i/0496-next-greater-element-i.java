import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // nums2 ke har element ka next greater store karega
        HashMap<Integer, Integer> map = new HashMap<>();

        // Monotonic decreasing stack
        Stack<Integer> stack = new Stack<>();


        // nums2 ko RIGHT -> LEFT traverse karenge
        for (int i = nums2.length - 1; i >= 0; i--) {

            int current = nums2[i];


            // Jab tak stack ka top current se chhota/equal hai,
            // woh current ka next greater nahi ban sakta
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }


            // Ab stack empty hai -> koi greater element nahi
            if (stack.isEmpty()) {
                map.put(current, -1);
            }

            // Stack ka top current se greater hai
            // aur right side ka nearest greater element hai
            else {
                map.put(current, stack.peek());
            }


            // Current element ko future elements ke liye stack me daal do
            stack.push(current);
        }


        // nums1 ke according final answer
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            // nums2 me already answer calculate kar chuke hain
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
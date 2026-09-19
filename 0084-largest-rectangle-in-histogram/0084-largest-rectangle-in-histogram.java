import java.util.*;

class Solution {

    public int largestRectangleArea(int[] arr) {

        int[] ps = prevsmaller(arr);
        int[] ns = nextsmaller(arr);

        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {

            int width = ns[i] - ps[i] - 1;

            int area = arr[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    static int[] nextsmaller(int[] arr) {

        int n = arr.length;

        int[] ns = new int[n];

        for (int i = 0; i < n; i++) {
            ns[i] = n;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() &&
                   arr[i] <= arr[st.peek()]) {

                ns[st.pop()] = i;
            }

            st.push(i);
        }

        return ns;
    }

    static int[] prevsmaller(int[] arr) {

        int n = arr.length;

        int[] ps = new int[n];

        for (int i = 0; i < n; i++) {
            ps[i] = -1;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() &&
                   arr[i] <= arr[st.peek()]) {

                st.pop();
            }

            if (!st.isEmpty()) {
                ps[i] = st.peek();
            }

            st.push(i);
        }

        return ps;
    }
}
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            maxArea = Math.max(maxArea, getMaxArea(height));
        }

        return maxArea;
    }

    public int getMaxArea(int[] arr) {
        int[] ps = prevSmaller(arr);
        int[] ns = nextSmaller(arr);

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int width = ns[i] - ps[i] - 1;
            int area = arr[i] * width;
            max = Math.max(max, area);
        }

        return max;
    }

    public int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }

    public int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }
}
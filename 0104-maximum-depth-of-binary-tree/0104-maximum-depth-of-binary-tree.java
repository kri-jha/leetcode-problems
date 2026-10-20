// class Solution {
//     public int maxDepth(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }

//         int left = maxDepth(root.left);
//         int right = maxDepth(root.right);

//         return 1 + Math.max(left, right);
//     }
// }


class Solution {
    int maxd = 0;

    public int maxDepth(TreeNode root) {
        depth(root, 0);
        return maxd;
    }

    public void depth(TreeNode root, int currd) {
        if (root == null) {
            return;
        }

        currd++;

        if (root.left == null && root.right == null) {
            maxd = Math.max(maxd, currd);
        }

        depth(root.left, currd);
        depth(root.right, currd);
    }
}
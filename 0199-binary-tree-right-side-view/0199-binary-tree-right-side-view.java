/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();

        rv(root , res ,0);

        return res;
    }

    public static void rv(TreeNode root, ArrayList<Integer> res , int level)
    {
     if(root ==null) return ;

//     if(root.left ==null)
//     {
// rv(root.right , res);
//         // return ;
//     }
        
//                 res.add(root.right);
//      if(root.right==null)
//     { 
//        rv(root.left , res);
//     }
//     res.add(root.left);

//     if(root.left!=null && root.right!=null)
//     {
//         rv(root.right , res);
//     }
//     res.add(root.right);
       
    
//     //   rv(root.left , res);

  if(level==res.size())
  {
    res.add(root.val);
  }

  rv(root.right , res , level+1);
    rv(root.left , res , level+1);


    }
}
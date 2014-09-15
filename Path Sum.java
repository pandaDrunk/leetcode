/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
       return hasPathSum(root, 0, sum);
    }
    public boolean hasPathSum(TreeNode root, int res, int sum){
        if(root==null) return false;
        res+=root.val;
        if(root.left==null&&root.right==null){
            if(res==sum)
                return true;
            else 
                return false;
        }
        return hasPathSum(root.left, res, sum)||hasPathSum(root.right, res, sum);
    }
}
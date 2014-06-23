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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return(check(root.left,root.right));
    }
    public boolean check(TreeNode l, TreeNode r){
        if(l==null&&r==null) return true;
        if(l==null||r==null) return false;
        if(l.val!=r.val) return false;
        
        return check(l.left,r.right)&&check(l.right,r.left);
    }
}
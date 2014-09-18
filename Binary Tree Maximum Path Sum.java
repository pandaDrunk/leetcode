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
    int maxSum;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        maxSum=root.val;
        getMaxPathSum(root);
        return maxSum;
    }
    public int getMaxPathSum(TreeNode root){
        if(root==null) return 0;
        
        int left = Math.max(getMaxPathSum(root.left), 0);
		int right = Math.max(getMaxPathSum(root.right), 0);
		
		maxSum=Math.max(root.val+left+right, maxSum);
		
		return root.val+Math.max(left,right);
    }
}
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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList inorder = new ArrayList();
        if(root!=null){
            inorder.addAll(inorderTraversal(root.left));
            inorder.add(root.val);
            inorder.addAll(inorderTraversal(root.right));
        }
        return inorder;
    }
}
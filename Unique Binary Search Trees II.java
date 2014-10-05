/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public ArrayList<TreeNode> generateTrees(int n) {
        return generateTrees(1,n);
    }
    public ArrayList<TreeNode> generateTrees(int head, int tail){
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        if(head>tail){
            res.add(null);
            return res;
        }
        for(int i=head;i<=tail;i++){
            ArrayList<TreeNode> leftTrees = generateTrees(head,i-1);
            ArrayList<TreeNode> rightTrees = generateTrees(i+1,tail);
            for(TreeNode left:leftTrees){
                for(TreeNode right:rightTrees){
                    TreeNode root = new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    res.add(root);
                }
            }//link root, left and right
        }
        return res;
    }
}
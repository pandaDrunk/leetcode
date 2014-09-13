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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList postOrder = new ArrayList();
        if(root==null) return postOrder;
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        LinkedList<TreeNode> output = new LinkedList<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            output.push(cur);
            if (cur.left!=null){
                stack.push(cur.left);
            }
            if (cur.right!=null){
                stack.push(cur.right);
            }
        }
        while(!output.isEmpty()){
            TreeNode res = output.pop();
            postOrder.add(res.val);
        }
        return postOrder;
    }
}
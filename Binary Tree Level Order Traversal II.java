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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(root==null) return res;
        
        Stack<ArrayList<Integer>> stack=new Stack<ArrayList<Integer>>();
        ArrayList<TreeNode> nodes=new ArrayList<TreeNode>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            ArrayList<TreeNode> temp=new ArrayList<TreeNode>();//key. Use the temp list to seperate levels.
            ArrayList<Integer> level=new ArrayList<Integer>();
            while(!nodes.isEmpty()){
                TreeNode node=nodes.remove(0);
                level.add(node.val);
                if(node.left!=null) temp.add(node.left);
                if(node.right!=null) temp.add(node.right);
            }
            stack.add(level);
            nodes=temp;
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}
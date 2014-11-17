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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(root==null) return res;
        
        ArrayList<TreeNode> nodes=new ArrayList<TreeNode>();
        int count=1;
        nodes.add(root);
        ArrayList<Integer> first=new ArrayList<Integer>();
        first.add(root.val);
        res.add(first);
        
        while(!nodes.isEmpty()){
            ArrayList<TreeNode> temp=new ArrayList<TreeNode>();
            ArrayList<Integer> level = new ArrayList<Integer>();
            while(!nodes.isEmpty()){
                TreeNode node = nodes.remove(nodes.size()-1);
                if(count%2==0){
                    //TreeNode node=nodes.remove(0);
                    //level.add(node.val);
                    if(node.left!=null) {
                        temp.add(node.left);
                        level.add(node.left.val);
                    }
                    if(node.right!=null) {
                        temp.add(node.right);
                        level.add(node.right.val);
                    }
                }
                else {
                    //TreeNode node=nodes.remove(0);
                    //level.add(node.val);
                    if(node.right!=null) {
                        temp.add(node.right);
                        level.add(node.right.val);
                    }
                    if(node.left!=null) {
                        temp.add(node.left);
                        level.add(node.left.val);
                    }
                }
            }
            count++;
            if(level.size()>0){
                res.add(level);
            }
            nodes=temp;
        }
        
        return res;
    }
}//BFS, similar with level order traversal
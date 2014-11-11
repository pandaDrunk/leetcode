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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root==null) return res;
        hasPathSum(res, root, new ArrayList<Integer>(), sum);
        return res;
        
    }
    public void hasPathSum(ArrayList<ArrayList<Integer>> res, TreeNode root,  ArrayList<Integer> list, int sum){
        if(root==null) return;
        
        if(root.left==null&&root.right==null){
            if(sum==root.val){
                list.add(root.val);
                res.add(new ArrayList<Integer>(list));
                return;
            }
        }
        list.add(root.val);
        if(root.left!=null){
            hasPathSum(res, root.left, list, sum-root.val);
            list.remove(list.size()-1);
            
        }
        if(root.right!=null){
            hasPathSum(res, root.right, list, sum-root.val);
            list.remove(list.size()-1);
        }
    }
}
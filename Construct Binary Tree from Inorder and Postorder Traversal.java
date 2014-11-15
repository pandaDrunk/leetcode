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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||postorder==null){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length;i++){
            map.put(inorder[i],i);
        }//use hashmap to avoid linear search for the index of inorder
        return constructTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }
    public TreeNode constructTree(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight, HashMap<Integer, Integer> map){
        if(inLeft>inRight||postLeft>postRight){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postRight]);
        int index = map.get(root.val);
        root.left = constructTree(inorder, inLeft, index-1, postorder, postLeft, postLeft+index-inLeft-1, map);
        root.right = constructTree(inorder, index+1, inRight, postorder, postRight-(inRight-index), postRight-1, map);
        return root;
    }
}
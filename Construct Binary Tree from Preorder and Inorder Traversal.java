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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||inorder==null){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length;i++){
            map.put(inorder[i],i);
        }//use hashmap to avoid linear search for the index of inorder
        return constructTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
        
    }
    public TreeNode constructTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight, HashMap<Integer, Integer> map){
        if(preLeft>preRight||inLeft>inRight){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preLeft]);
        int index = map.get(root.val);
        root.left = constructTree(preorder, preLeft+1, index-inLeft+preLeft, inorder, inLeft, index-1, map);
        root.right = constructTree(preorder, preLeft+index-inLeft+1, preRight, inorder, index+1, inRight, map);
        return root;
    }
}
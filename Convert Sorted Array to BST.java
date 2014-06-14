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
    public TreeNode sortedArrayToBST(int[] num) {
        if(num==null) return null;
        return sortedArrayToBST(num,0,num.length-1);
    }
    
    public TreeNode sortedArrayToBST(int[] num,int start,int end){
        if(start>end) return null;
        int mid=(end+start)/2;
        TreeNode root=new TreeNode(num[mid]);
        root.right=sortedArrayToBST(num,mid+1,end);
        root.left=sortedArrayToBST(num,start,mid-1);
        return root;
    }
        
       
}
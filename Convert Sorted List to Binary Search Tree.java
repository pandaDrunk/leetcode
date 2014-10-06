/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return sortedListToBST(head, null);
    }
    public TreeNode sortedListToBST(ListNode head, ListNode tail){
        if(head==tail) return null;
        //two pointers search for mid-node
        ListNode mid = head;            
        ListNode end = head;         
        while(end!=tail && end.next!=tail){    
            mid = mid.next;  
            end = end.next.next;  
        }
        
        TreeNode root = new TreeNode(mid.val);
        root.left=sortedListToBST(head,mid);
        root.right=sortedListToBST(mid.next,tail);
        
        return root;
    }
}
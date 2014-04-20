/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
        ListNode nl1 = l1;
        ListNode nl2 = l2;
        ListNode merged=new ListNode(0);
        ListNode l=merged;
        
       
        while(nl1!=null&&nl2!=null){
            if(nl1.val<nl2.val){
                l.next=nl1;
                nl1=nl1.next;
            }
            else {
                l.next=nl2;
                nl2=nl2.next;
            }
            l=l.next;
        }
        if(nl1!=null) l.next=nl1;
        if(nl2!=null) l.next=nl2;
        return merged.next;
    }
}